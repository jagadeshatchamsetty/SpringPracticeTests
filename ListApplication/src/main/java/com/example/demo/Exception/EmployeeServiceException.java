package com.example.demo.Exception;

public class EmployeeServiceException extends Exception {

	
	    private static final long serialVersionUID = 1L;
	    private String errorMessage;
	  
	    public String getErrorMessage() {
	        return errorMessage;
	    }
	    public EmployeeServiceException(String errorMessage) {
	        super(errorMessage);
	        this.errorMessage = errorMessage;
	    }
	    public EmployeeServiceException() {
	        super();
	    }
	
	
	
	
	
	
}
