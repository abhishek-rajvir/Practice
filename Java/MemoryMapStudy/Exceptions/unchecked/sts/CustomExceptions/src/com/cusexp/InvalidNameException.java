package com.cusexp;

/**
 *	Throw exception if name any char is not an alphabet, regardless of the case
 * 	
 *	@param:	{@link String} msg
 *	@return: {@link void}
 *	@throws: {@link RuntimeException}
 **/
public class InvalidNameException extends RuntimeException{
	public InvalidNameException(String msg) {
		super(msg);
	}
}
