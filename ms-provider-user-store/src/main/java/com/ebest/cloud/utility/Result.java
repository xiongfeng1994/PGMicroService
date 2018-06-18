package com.ebest.cloud.utility;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import com.ebest.cloud.entity.Store;
/**
 * store api result entity
 * @author ebest
 *
 */
public class Result {
	
	/**
	 * errorDesc information
	 */
	private List<String> errorDesc;
	
	/**
	 * errorType information
	 */
	private int errorCode;
	/**
	 * the response status
	 */
	private String errorMessage;
	/**
	 * store information
	 */
	private List<Store> stores;
	/**
	 * store information
	 */
	private Object store;
	/**
	 * storeCode information
	 */
	private String storeCode;	
	/**
	 * request path
	 */
	private String path;
	
	public Result() {	
	}
	
	/**
	 * get store list
	 * @return
	 */
	public List<Store> getStores() {
		return stores;
	}
	
	/**
	 * set store list
	 * @param stores
	 */
	public void setStores(List<Store> stores) {
		this.stores = stores;
	}
	
	/**
	 * get store
	 * @return
	 */
	public Object getStore() {
		return store;
	}	
	
	/**
	 * set store
	 * @param store
	 */
	public void setStore(Store store) {
		this.store = store==null?new Object():store;
	}
	
	/**
	 * get store code
	 * @return
	 */
	public String getStoreCode() {
		return storeCode;
	}
	
	/**
	 * set store code
	 * @param storeCode
	 */
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	
	/**
	 * get the error type information
	 * @return errorType
	 */
	
	
	/**
	 * get the error description list
	 * @return Object
	 */
	public Object getErrorDesc() {
		if (errorDesc==null||errorDesc.isEmpty()) {
			return "";
		}else {
			return errorDesc;
		}
		
	}
	
	/**
	 * get request path
	 * @return String
	 */
	public String getPath() {
		return path;
	}
	
	/**
	 * set request path
	 * @param path
	 */
	public void setPath(String path) {
		this.path = path;
	}	
	
	/**
	 * set error status
	 */
	public void setHttpStatus(HttpStatus status) {
		errorMessage = status.getReasonPhrase();
		errorCode = status.value();
	}
	/**
	 * get error code
	 * @return
	 */
	public int getErrorCode() {
		return errorCode;
	}
	/**
	 * get error message
	 * @return
	 */
	public String getErrorMessage() {
		return errorMessage == null ? "":errorMessage;
	}
	/**
	 * set a new error description list
	 * @param errorDesc
	 */
	public void setErrorDesc(List<String> errorDesc) {
		this.errorDesc = errorDesc;
	}
	
	/**
	 * add information to the error description list
	 * @param errorDesc
	 */
	public void addErrorDesc(String errorDesc) {
		
		if(this.errorDesc == null) {
			this.errorDesc = new ArrayList<String>();
		}
		this.errorDesc.add(errorDesc);
	}
	
	/**
	 * add information from fieldErrors to the errorDesc for the result
	 * @param fieldErrors
	 */
	public void addErrorDesc(List<FieldError> fieldErrors){
		
		if(this.errorDesc == null) {
			this.errorDesc = new ArrayList<String>();
		}
		// iteration result
		for (int i = 0; i < fieldErrors.size(); i++) {
			
			// define fielderror
			FieldError fieldError =fieldErrors.get(i);
			
			// format the error and add to the errorDesc
			this.errorDesc.add(String.format(fieldError.getDefaultMessage(), fieldError.getField(), fieldError.getRejectedValue()));
		
		}
	}
	
}
