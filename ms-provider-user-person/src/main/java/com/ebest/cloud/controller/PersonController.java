package com.ebest.cloud.controller;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ebest.cloud.entity.Person;
import com.ebest.cloud.service.OrganizationService;
import com.ebest.cloud.service.PersonRoleBannerService;
import com.ebest.cloud.service.PersonRoleService;
import com.ebest.cloud.service.PersonService;
import com.ebest.cloud.util.ReturnUtil;
import com.ebest.cloud.utility.ConstantClassField;
import com.ebest.cloud.utility.Result;

/**
 * person controller class
 * 
 * @author ebest
 *
 */
@RestController
public class PersonController {

	private static final Logger log = LoggerFactory.getLogger(PersonController.class);

	@Autowired
	OrganizationService organizationService;

	@Autowired
	PersonRoleBannerService personRoleBannerService;

	@Autowired
	PersonRoleService personRoleService;

	@Autowired
	PersonService personService;

	@PostMapping(value = "/person", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Result createPerson(@RequestBody @Valid Person person, BindingResult bindingResult,
			HttpServletResponse response) {

		Result result = new Result();
		if (bindingResult.hasErrors() || this.resultResponse(person, result)) {
			response.setStatus(HttpStatus.BAD_REQUEST.value());
			this.validatorParams(person, bindingResult, result);
			return result;
		}
		personService.insertSinglePerson(person, ConstantClassField.RECUSERCODE, result);

		return result;

	}
	
	@PutMapping(value = "/person", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ModelMap updatePerson(Person person) {
		int resultCode = personService.updateSinglePerson(person);
		return ReturnUtil.Success("code", resultCode);
	}

	@DeleteMapping(value = "/person", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ModelMap deletePerson(@RequestParam("code") String code, @RequestParam("leaveDate") String leaveDate) {
		int resultCode = personService.deleteSinglePerson(code, leaveDate);
		return ReturnUtil.Success("code", resultCode);
	}

	@GetMapping(value = "/person/{code}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ModelMap searchSinglePerson(@PathVariable("code") String code) {
		Person person = personService.searchSinglePerson(code);
		return ReturnUtil.Success("persons", person);
	}

	@GetMapping(value = "/person", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ModelMap searchMultiplePerson() {
		return null;
	}

	@PostMapping(value = "/person_role", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ModelMap createPersonRole() {
		return null;
	}
	
	public void validatorParams(Person person,BindingResult bindingResult, Result result) {
		List<FieldError> errors = bindingResult.getFieldErrors();
		result.setPersonCode(person.getCode());
		result.setHttpStatus(HttpStatus.BAD_REQUEST);
		result.addErrorDesc(errors);
	}

	public boolean resultResponse(Person person, Result result) {

		String lineManagerCode = person.getLineManager();
		String orgCode = person.getPersonRoles().get(0).getOrgCode();
		String bannerCode = person.getPersonRoleBanners().get(0).getBannerCode();
		String roleId = person.getPersonRoleBanners().get(0).getRoleId();

		return personService.isExistCode(person.getCode(), result) 
				& personRoleService.isExistCode(roleId, result)
				& personRoleBannerService.isExistCode(bannerCode, roleId, result)
				& organizationService.isExistCode(orgCode, result)
				& personService.isExistLineManager(lineManagerCode, result);
	}
}
