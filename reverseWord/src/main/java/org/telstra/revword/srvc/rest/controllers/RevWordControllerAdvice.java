/**
 * 
 */
package org.telstra.revword.srvc.rest.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.telstra.revword.srvc.rest.exceptions.RevWordException;

/**
 * @author Sarin
 *
 */
@RestControllerAdvice
public class RevWordControllerAdvice {
	
	/**
	 * Method added to handle RevWordException
	 * 
	 * @param request
	 * @param rwEx
	 */
	@ExceptionHandler(RevWordException.class)
	@ResponseStatus(code=HttpStatus.CONFLICT, reason="Reverse Word: Exception occurred during the generation of reverse word.")
	public void handleException(HttpServletRequest request, RevWordException rwEx) {
	}
	
	/**
	 *  Method added to handle Exception
	 *  
	 * @param request
	 * @param ex
	 */
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code=HttpStatus.METHOD_NOT_ALLOWED, reason="Reverse Word Application Error.")
	public void handleException(HttpServletRequest request, Exception ex) {
	}

}
