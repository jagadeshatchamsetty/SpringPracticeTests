package com.example.demo.Exception;

public class DuplicateEmployeeFoundException extends Exception {

	private static final long serialVersionUID = 1L;
    private String errorMessage;
  
    public String getErrorMessage() {
        return errorMessage;
    }
    public DuplicateEmployeeFoundException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
    public DuplicateEmployeeFoundException() {
        super();
    }

	
	
}
