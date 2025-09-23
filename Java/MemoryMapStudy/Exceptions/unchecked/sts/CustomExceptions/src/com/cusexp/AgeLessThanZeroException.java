package com.cusexp;

/**
 *	Throws a Runtime exception if age < 0
 * 	
 * 
 *	@param:	{@link String} msg
 *	@return: {@link void}
 *	@throws: {@link RuntimeException}
 **/
public class AgeLessThanZeroException extends RuntimeException {
	
	// default constructor
	public AgeLessThanZeroException() {
		System.out.println("Error: Age < 0..");
	}
	
	public AgeLessThanZeroException(String msg) {
		super(msg);
	}
}
