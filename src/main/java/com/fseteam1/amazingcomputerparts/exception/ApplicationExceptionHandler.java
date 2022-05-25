/*
  FSE Cohort - Team Project2
  Amazing Computer Parts Inventory System -Team1
  Class: ApplicationExceptionHandler - incorporate exceptions in HTTP response
 */
package com.fseteam1.amazingcomputerparts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@ControllerAdvice
@SuppressWarnings("unused")
public class ApplicationExceptionHandler {
    @ResponseStatus(
            value = HttpStatus.NOT_FOUND)
    //reason = "Requested Part Not Found")
    @ExceptionHandler(PartNotFoundForGetException.class)
    public ResponseEntity<ApiError> handleException(PartNotFoundForGetException e) {
        ApiError apiError = new ApiError(LocalDateTime.now(), HttpStatus.NOT_FOUND, e.getLocalizedMessage());
        return new ResponseEntity<>(apiError, apiError.getHttpStatus());
    }

    @ResponseStatus(
            value = HttpStatus.INTERNAL_SERVER_ERROR)
    //reason = "Requested Part Not Found")
    @ExceptionHandler(PartNotFoundForDeleteException.class)
    public ResponseEntity<ApiError> handleException(PartNotFoundForDeleteException e) {
        ApiError apiError = new ApiError(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, e.getLocalizedMessage());
        return new ResponseEntity<>(apiError, apiError.getHttpStatus());
    }
}

