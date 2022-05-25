/*
  FSE Cohort - Team Project2
  Amazing Computer Parts Inventory System -Team1
  Class: ApiError - record for HTTP restful api related exception
 */
package com.fseteam1.amazingcomputerparts.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ApiError(LocalDateTime localDateTime, HttpStatus httpStatus, String message) {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy hh:mm:ss a")
    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ApiError{" +
                "dateTime=" + localDateTime +
                "httpStatus=" + httpStatus +
                ", message='" + message + '\'' +
                '}';
    }
}

