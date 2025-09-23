package com.cusexp;

/**
 *	Throw exception if in phone any char is not a digit
 * 	
 *	@param:	{@link String} msg
 *	@return: {@link void}
 *	@throws: {@link RuntimeException}
 **/
public class InvalidPhonenumException extends RuntimeException {
	public InvalidPhonenumException(String msg) {
		super(msg);
	}
}
