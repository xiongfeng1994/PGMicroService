package com.ebest.cloud.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
import org.springframework.web.servlet.NoHandlerFoundException;

import com.ebest.cloud.entity.Store;
import com.ebest.cloud.service.StoreService;
import com.ebest.cloud.utility.ConstantClassField;
import com.ebest.cloud.utility.Result;

import io.swagger.annotations.ApiOperation;

/**
 * store controller class
 * 
 * @author ebest
 *
 */
@RestController
public class StoreController {

	// define service object
	@Autowired
	private StoreService storeService;

	/**
	 * search store api
	 * 
	 * @param storeCode
	 * @param storeName
	 * @param STORETYPECODE
	 * @param bannerCode
	 * @param channelCode
	 * @param regionCode
	 * @param marketCode
	 * @param storeOwnerCode
	 * @return store list json
	 */
	// search store swagger
	@ApiOperation(value = ConstantClassField.SWAGGERQUERYSTOREAPIVALUE, notes = ConstantClassField.SWAGGERQUERYSTORENOTE)
	@GetMapping(value = ConstantClassField.STOREPATH, produces = ConstantClassField.JSONPRODUCES)
	public Result searchStore(
			@RequestParam(name = ConstantClassField.STORECODE, required = false) String storeCode,
			@RequestParam(name = ConstantClassField.STORENAME, required = false) String storeName,
			@RequestParam(name = ConstantClassField.STORETYPECODE, required = false) String storeTypeCode,
			@RequestParam(name = ConstantClassField.BANNERCODE, required = false) String bannerCode,
			@RequestParam(name = ConstantClassField.CHANNELCODE, required = false) String channelCode,
			@RequestParam(name = ConstantClassField.REGIONCODE, required = false) String regionCode,
			@RequestParam(name = ConstantClassField.MARKETCODE, required = false) String marketCode,
			@RequestParam(name = ConstantClassField.STOREOWNERCODE, required = false) String storeOwnerCode,
			@RequestParam(name = ConstantClassField.OFFSET, required = false, defaultValue = ConstantClassField.OFFSETDEFAULT) int offset,
			@RequestParam(name = ConstantClassField.LIMIT, required = false, defaultValue = ConstantClassField.LIMITDEFAULT) int limit,
			@RequestParam(name = ConstantClassField.ORDERBYFIELD, required = false, defaultValue = ConstantClassField.STORECODE) String orderbyField) {
		
		// define result object
		Result result = new Result();
		
		// search store data from db
		List<Store> stores = storeService.searchStore(storeCode,storeName, storeTypeCode, bannerCode, channelCode,
				regionCode, marketCode, storeOwnerCode, offset, limit, orderbyField);
		
		// set store list
		result.setStores(stores);
		
		// return search store api result
		return result;
	}

	/**
	 * search store by storeCode api
	 * 
	 * @param storeCode
	 */
	// search store by storeCode swagger
	@ApiOperation(value = ConstantClassField.SWAGGERQUERYSTOREBYCODEAPIVALUE, notes = ConstantClassField.SWAGGERQUERYSTOREBYCODENOTE)
	@GetMapping(value = ConstantClassField.STOREANDSTORECODEPATH, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Result searchStoreByCode(@PathVariable(ConstantClassField.STORECODE) String storeCode) {

		// define result object
		Result result = new Result();
		
		// search store data from db
		Store store = storeService.searchStoreByCode(storeCode); // storeCode
		
		// set store to result
		result.setStore(store);
		
		// return search store by storeCode api result
		return result;
	}

	/**
	 * create store api
	 * 
	 * @param store json
	 * @return result json
	 */
	// create store swagger
	@ApiOperation(value = ConstantClassField.SWAGGERCREATESTOREAPIVALUE, notes = ConstantClassField.SWAGGERCREATESTORENOTE)
	@PostMapping(value = ConstantClassField.STOREPATH, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Result createStore(@RequestBody @Valid Store store, BindingResult bindingResult, HttpServletResponse response) {

		// define result object
		Result result = new Result();
		
		// get store code
		String storeCode = store.getCode();
		
		// validation parameters
		if (bindingResult.hasErrors()) {
			// define error
			List<FieldError> errors = bindingResult.getFieldErrors();
			
			// change response status
			response.setStatus(HttpStatus.BAD_REQUEST.value());
			
			// set result information
			result.setStoreCode(storeCode);
			result.setHttpStatus(HttpStatus.BAD_REQUEST);
			result.addErrorDesc(errors);
			
		} else {
			
			// create store
			if (storeService.createStore(store, ConstantClassField.RECUSERCODE, result)) {
				
				// change response status
				response.setStatus(HttpStatus.CREATED.value());
				
				// set result information
				result.setStoreCode(storeCode);
				
			} else {
				
				// change response status
				response.setStatus(HttpStatus.BAD_REQUEST.value());
				
				// set result information
				result.setStoreCode(storeCode);
				result.setHttpStatus(HttpStatus.BAD_REQUEST);
			}
		}
		// return create store api result
		return result;
	}

	/**
	 * update store api
	 * 
	 * @param store json
	 * @param bindingResult
	 * @return result json
	 */
	// update store swagger
	@ApiOperation(value = ConstantClassField.SWAGGERUPDATESTOREAPIVALUE, notes = ConstantClassField.SWAGGERUPDATESTORENODE)
	@PutMapping(value = ConstantClassField.STOREPATH, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Result updateStore(@RequestBody @Valid Store store, BindingResult bindingResult,
			HttpServletResponse response) {

		// define result object
		Result result = new Result();
		
		// get store code
		String storeCode = store.getCode();
		
		// validation parameters
		if (bindingResult.hasErrors()) {
			
			// define error
			List<FieldError> errors = bindingResult.getFieldErrors();
			
			// change response status
			response.setStatus(HttpStatus.BAD_REQUEST.value());
			
			// set result information
			result.setStoreCode(storeCode);
			result.setHttpStatus(HttpStatus.BAD_REQUEST);
			result.addErrorDesc(errors);
		} else {
			
			// update store
			if (storeService.updateStore(store, ConstantClassField.RECUSERCODE, result)) {
				
				// change response status
				response.setStatus(HttpStatus.CREATED.value());
				
				// set result information
				result.setStoreCode(storeCode);
			
			} else {
				
				// change response status
				response.setStatus(HttpStatus.BAD_REQUEST.value());
				
				// set result information
				result.setStoreCode(storeCode);
				result.setHttpStatus(HttpStatus.BAD_REQUEST);
			}
		}
		
		// return update store api result
		return result;
	}

	/**
	 * delete store api
	 * 
	 * @param storeCode
	 * @return result json
	 * @throws NoHandlerFoundException
	 */
	// deleted store swagger
	@ApiOperation(value = ConstantClassField.SWAGGERDELETESTOREAPIVALUE, notes = ConstantClassField.SWAGGERDELETESTORENOTE)
	@DeleteMapping(value = ConstantClassField.STOREANDSTORECODEPATH, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Result deleteStore(@PathVariable(ConstantClassField.STORECODE) String storeCode,
		HttpServletResponse response) {
		
		// define result object
		Result result = new Result();
		
		// delete store
		if (storeService.deleteStore(storeCode, ConstantClassField.RECUSERCODE, result)) {
			
			// change response status
			response.setStatus(HttpStatus.NO_CONTENT.value());
			
			// set result information
			result.setStoreCode(storeCode);
		
		} else {
			
			// change response status
			response.setStatus(HttpStatus.BAD_REQUEST.value());
			
			// set result information
			result.setStoreCode(storeCode);
			result.setHttpStatus(HttpStatus.BAD_REQUEST);
		}
		
		// return delete store api result
		return result;
	}
}
