package com.dlea.Course.Resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.dlea.Course.services.exceptions.DatabaseException;
import com.dlea.Course.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice // interceptar as exeções que vai acontecer para que esse objeto posso tratar um
					// possivel tratamento
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {

		String error = "Resource not Found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(),
				request.getRequestURI());

		return ResponseEntity.status(status).body(err);

	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> Database(DatabaseException e, HttpServletRequest request) {

		String error = "Database error";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(),
				request.getRequestURI());

		return ResponseEntity.status(status).body(err);

	}

}
