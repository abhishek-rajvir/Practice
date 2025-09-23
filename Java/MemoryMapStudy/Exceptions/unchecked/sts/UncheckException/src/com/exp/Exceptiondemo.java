package com.exp;

public class Exceptiondemo {
	public static void show(String name) {
		try {
			if (name.equals("")) {
				sayHello(null);
			}
			else {				
				sayHello(name);
			}
		}
		catch(NullPointerException e){
			System.out.println("Error: "+e+"\nParam[name] cannot be null\n\nStackTrace --");
			e.printStackTrace();
			System.out.println("\nException handled safely...");
		}
	}
	
	/**
	 *  This method greets ("Hello+name)
	 *	@param name : Name of user 
	 *	@throws NullPointerException if string is found null
	 * 
	 **/
	static void sayHello(String name) throws NullPointerException 
	{
		System.out.println(name.toUpperCase());
	}
}
