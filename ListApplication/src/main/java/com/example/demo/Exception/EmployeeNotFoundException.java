package com.example.demo.Exception;

public class EmployeeNotFoundException extends Exception {

	
	    private static final long serialVersionUID = 1L;
	    private String errorMessage;
	  
	    public String getErrorMessage() {
	        return errorMessage;
	    }
	    public EmployeeNotFoundException(String errorMessage) {
	        super(errorMessage);
	        this.errorMessage = errorMessage;
	    }
	    public EmployeeNotFoundException() {
	        super();
	    }
	
	
	
	
	
	
}
