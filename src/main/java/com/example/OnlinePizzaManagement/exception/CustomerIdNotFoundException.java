package com.example.OnlinePizzaManagement.exception;

//import org.springframework.validation.BindException;

public class CustomerIdNotFoundException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5848480070564278690L;

	public CustomerIdNotFoundException(String message)
	{
		super(message);
	}
/*
	public BindException getBindingResult() {
		// TODO Auto-generated method stub
		return null;
	}
	*/
}
