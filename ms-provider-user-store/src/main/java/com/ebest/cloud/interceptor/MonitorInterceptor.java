package com.ebest.cloud.interceptor;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ebest.cloud.utility.ApiLogObject;
import com.ebest.cloud.utility.ConstantClassField;
import com.ebest.cloud.utility.copier.HttpServletResponseCopier;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * monitor interceptor class
 * @author ebest
 *
 */
public class MonitorInterceptor implements HandlerInterceptor {
	
	private static final Logger logger = LoggerFactory.getLogger(MonitorInterceptor.class);

	/**
	 * prepare handle
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
		//program begin time
		long begin_nao_time = System.currentTimeMillis();
		request.setAttribute(ConstantClassField.BEGIN_NAO_TIME, begin_nao_time);
		return true;
	}

	/**
	 * post handle
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView mav)
			throws Exception {
	}

	
	private ObjectMapper mapper = new ObjectMapper();
	
	/**
	 * after completion
	 */
	@Override
	public void afterCompletion(HttpServletRequest hsr, HttpServletResponse hsr1, Object o, Exception excptn)
			throws Exception {
		
		// program response time
		long begin_nao_time = (Long) hsr.getAttribute(ConstantClassField.BEGIN_NAO_TIME);
		long end_nao_time = System.currentTimeMillis();
		long interval = end_nao_time - begin_nao_time;
		String uri = hsr.getRequestURI();
		
		// object set calltime and appname and apiname
		ApiLogObject object = new ApiLogObject();
		object.setCallTime(begin_nao_time);
		object.setApiName(uri);
		object.setErrorCodeAlias(ConstantClassField.SUCCESS);
		Map<String,Object> dimension = new HashMap<String,Object>();
		
		//if exception equal to null, continue
		//else exception code set 500 and message set exception information
		if (excptn == null) {
			if (hsr1 instanceof HttpServletResponseCopier) {
				
				//get responseBody copy
				HttpServletResponseCopier copier = (HttpServletResponseCopier) hsr1;
				String responseBody = new String(copier.getCopy());
				if (StringUtils.isNotBlank(responseBody)) {
					
					try {
						HashMap map = this.mapper.readValue(responseBody, HashMap.class);
						
						//if map contains errorCode, object set errorCode and set errorDesc
						//else if map contains error, object set errorCode 500 and set message
						if (map.containsKey(ConstantClassField.ERRORCODE)) {
							
							object.setErrorCode((int) map.get(ConstantClassField.ERRORCODE));
							object.setErrorCodeAlias((String)map.get(ConstantClassField.ERRORMESSAGE));
							dimension.put(ConstantClassField.ERRORDESC,map.get(ConstantClassField.ERRORDESC));
						} else if (map.containsKey(ConstantClassField.ERRORNAME)) {
							
							object.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
							object.setErrorCodeAlias((String) map.get(ConstantClassField.MESSAGE));
						}
					
					} catch (Exception e) {
						
						//catch and set errorCode 500 and set exception massage
						object.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
						object.setErrorCodeAlias(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
					}
				}
			}
			
		} else {
			
			object.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
			object.setErrorCodeAlias(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
		}
		
		//object set dimension and set response time
		
		object.setDimension(dimension);
		object.setResponseTime(interval);
		
		//log infomation
		logger.info(object.toString());
	}
}