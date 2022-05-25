/*
  FSE Cohort - Team Project2
  Amazing Computer Parts Inventory System -Team1
  Class: PartNotFoundForDeleteException - custom exception for deleting non-existing object by id
 */
package com.fseteam1.amazingcomputerparts.exception;

import java.text.MessageFormat;

public class PartNotFoundForDeleteException extends RuntimeException{
    public PartNotFoundForDeleteException(final int id){
        super(MessageFormat.format("Oops! Could not find computer part with id: {0} for deletion. Please try another id.", id));
    }
}
