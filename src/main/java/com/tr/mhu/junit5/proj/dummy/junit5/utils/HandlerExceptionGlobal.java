package com.tr.mhu.junit5.proj.dummy.junit5.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author muludag on 25.04.2020
 */
@Slf4j
@ControllerAdvice
public class HandlerExceptionGlobal extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value
			= {IllegalArgumentException.class, IllegalStateException.class})
	protected ResponseEntity<Object> handleConflict(
			RuntimeException ex, WebRequest request) {
		String bodyOfResponse = "This should be application specific";
		log.warn("!!!!!!!!!! -> " + ex.getLocalizedMessage());
		return handleExceptionInternal(ex, bodyOfResponse,
				new HttpHeaders(), HttpStatus.CONFLICT, request);
	}
}

