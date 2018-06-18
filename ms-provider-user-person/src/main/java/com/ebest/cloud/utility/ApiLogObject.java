package com.ebest.cloud.utility;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.alibaba.fastjson.JSONObject;
/**
 * log information record entity class
 * @author ebest
 *
 */
public class ApiLogObject implements Serializable {

	private static final long serialVersionUID = -6640921311173850458L;

	// application name
	private String appName = ConstantClassField.APPNAMEDEFAULT;
	
	// application interface name
	private String apiName = ConstantClassField.UNKNOWN;
	
	// call time 
	private long callTime = System.currentTimeMillis();
	
	// dimension
	private Map<String, Object> dimension = new HashMap<>();
	
	// error code
	private int errorCode;
	
	// error code alias
	private String errorCodeAlias = ConstantClassField.UNKNOWN;
	
	// response time
	private long responseTime;
	
	
	// apiLogObject constructor
	public ApiLogObject() {
		super();
	}

	// apiLogObject constructor
	public ApiLogObject(String apiName, long callTime, Object errorDesc, HttpStatus httpStatus) {
		super();
		this.apiName = apiName;
		this.callTime = callTime;
		this.dimension.put(ConstantClassField.ERRORDESC, errorDesc);
		this.errorCode = httpStatus.value();
		this.errorCodeAlias = httpStatus.getReasonPhrase();
	}

	/**
	 * override toString
	 */
	@Override
	public String toString() {
		JSONObject object = new JSONObject();
		object.put(ConstantClassField.APP_NAME, this.appName);
		object.put(ConstantClassField.API_NAME, this.apiName);
		object.put(ConstantClassField.CALL_TIEME, this.callTime);
		object.put(ConstantClassField.ERRORCODE, this.errorCode);
		object.put(ConstantClassField.ERROR_CODE_ALIAS, this.errorCodeAlias);
		object.put(ConstantClassField.RESPONSE_TIME, this.responseTime);
		if(this.dimension != null && !this.dimension.isEmpty()) {
			object.put(ConstantClassField.DIMENSION, this.dimension);
		}
		return object.toJSONString();
	}
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public long getCallTime() {
		return callTime;
	}

	public void setCallTime(long callTime) {
		this.callTime = callTime;
	}

	public Map<String, Object> getDimension() {
		return dimension;
	}

	public void setDimension(Map<String, Object> dimension) {
		this.dimension = dimension;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorCodeAlias() {
		return errorCodeAlias;
	}

	public void setErrorCodeAlias(String errorCodeAlias) {
		this.errorCodeAlias = errorCodeAlias;
	}

	public long getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(long responseTime) {
		this.responseTime = responseTime;
	}

	
}
