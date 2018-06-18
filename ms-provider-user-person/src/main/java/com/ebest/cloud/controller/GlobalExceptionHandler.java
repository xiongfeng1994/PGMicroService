package com.ebest.cloud.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.ebest.cloud.utility.ApiLogObject;
import com.ebest.cloud.utility.Result;

/**
 * global exception handler
 * @author ebest
 *
 */
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

	// define log object
	private final static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	/**
	 * no handler exception reports
	 * 
	 * @param request
	 * @param exception
	 * @return result
	 * @throws Exception
	 */
	@ExceptionHandler(value = NoHandlerFoundException.class)
	public Result noHandlerFoundExceptionHandler(HttpServletRequest request, Exception exception,
			HttpServletResponse response) throws Exception {
		
		
		// set error result information
		Result result = new Result();
		result.setPath(request.getServletPath());
		result.setHttpStatus(HttpStatus.NOT_FOUND);
		result.addErrorDesc(exception.getMessage());
		
		// change response status
		response.setStatus(HttpStatus.NOT_FOUND.value());
		
		// define apiLogObject and log error
		ApiLogObject object = new ApiLogObject(request.getServletPath(),System.currentTimeMillis(), result.getErrorDesc(), HttpStatus.NOT_FOUND);
		logger.error(object.toString());
		
		// return error message
		return result;
	}
	
	/**
	 * http request method not supported exception reports
	 * @param request
	 * @param exception
	 * @param response
	 * @return result
	 * @throws Exception
	 */
	@ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
	public Result httpRequestMethodNotSupportedExceptionHandler(HttpServletRequest request,
			Exception exception, HttpServletResponse response) throws Exception {
		
		// set error result information
		Result result = new Result();
		result.setPath(request.getServletPath());
		result.setHttpStatus(HttpStatus.METHOD_NOT_ALLOWED);
		result.addErrorDesc(exception.getMessage());
		
		// change response status
		response.setStatus(HttpStatus.METHOD_NOT_ALLOWED.value());
		
		// define apiLogObject and log error
		ApiLogObject object = new ApiLogObject(request.getServletPath(),System.currentTimeMillis(), result.getErrorDesc(), HttpStatus.METHOD_NOT_ALLOWED);
		logger.error(object.toString());
		
		// return error message
		return result;
	}
	
	/**
	 * sql exception reports
	 * @param request
	 * @param exception
	 * @param response
	 * @return result
	 * @throws Exception
	 */
	@ExceptionHandler(value = SQLException.class)
	public Result sqlExceptionHandler(HttpServletRequest request, Exception exception,
			HttpServletResponse response) throws Exception {
		
		// set error result information
		Result result = new Result();
		result.setPath(request.getServletPath());
		result.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		result.addErrorDesc(exception.getMessage());
		
		// change response status
		response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		
		// define apiLogObject and log error
		ApiLogObject object = new ApiLogObject(request.getServletPath(),System.currentTimeMillis(), result.getErrorDesc(), HttpStatus.INTERNAL_SERVER_ERROR);
		logger.error(object.toString());
		
		// return error message
		return result;
	}
	
	/**
	 * all exception reports
	 * @param request
	 * @param exception
	 * @param response
	 * @return result
	 * @throws Exception
	 */
	@ExceptionHandler(value = Exception.class)
	public Result ExceptionHandler(HttpServletRequest request, Exception exception,
			HttpServletResponse response) throws Exception {
		
		// set error result information
		Result result = new Result();
		result.setPath(request.getServletPath());
		result.setHttpStatus(HttpStatus.BAD_REQUEST);
		result.addErrorDesc(exception.getMessage());
		
		// change response status
		response.setStatus(HttpStatus.BAD_REQUEST.value());
		
		// define apiLogObject and log error
		ApiLogObject object = new ApiLogObject(request.getServletPath(),System.currentTimeMillis(), result.getErrorDesc(), HttpStatus.BAD_REQUEST);
		logger.error(object.toString());
		
		// return error message
		return result;
	}
}
