/*
  FSE Cohort - Team Project2
  Amazing Computer Parts Inventory System -Team1
  Class: PartNotFoundForGetException - custom exception for getting non-existing object by id
 */
package com.fseteam1.amazingcomputerparts.exception;

import java.text.MessageFormat;

public class PartNotFoundForGetException extends RuntimeException{
    public PartNotFoundForGetException(final int id){
        super(MessageFormat.format("Oops! Could not find computer part with id: {0}. Please try another id.", id));
    }
}
