package com.test;

import com.cusexp.AgeLessThanZeroException;
import com.cusexp.InvalidNameException;
import com.cusexp.InvalidPhonenumException;

import java.util.Random;
import java.util.regex.Pattern;

class Aadhar{
	
	// Fields
	private int age = -1;
	private String fname = "N/A";
	private String lname = "N/A";
	private String phonenum = "N/A";
	private String UID = "N/A";
	
	private static String regstr = "[A-Za-z]{2,20}";
	private static String regdig = "[+][9][1] [0-9]{10,10}";
	
	private Aadhar(int age,String fname,String lname,String phonenum,String UID){
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		this.phonenum = phonenum;
		this.UID = UID;
		
	}
	
	/**
	 *	Validates age parameter
	 * 	
	 *	@param:	{@link int} age
	 *	@return: {@link void}
	 *	@throws: {@link AgeLessThanZeroException}
	 **/
	private static void validateAge(int age) throws AgeLessThanZeroException {
		if(age<0) {
			throw new AgeLessThanZeroException("Error: Age cannot be negative !!");
		}
	}
	
	/**
	 *	Validates fname lname parameter
	 * 	
	 *	@param:	{@link String} fname, {@link String} lname
	 *	@return: {@link void}
	 *	@throws: {@link InvalidNameException}
	 **/
	
	/**
	 *	Validates age parameter
	 * 	
	 *	@param:	{@link int} age
	 *	@return: {@link void}
	 *	@throws: {@link AgeLessThanZeroException}
	 **/
	private static void validatePhone(String phone) throws InvalidPhonenumException {
		phone = phone.strip();
		if (phone.matches(regdig)) {
			;
		}
		else {			
			throw new InvalidPhonenumException("Error: Phone number can only have digits and must start with +91 !!");
		}
	}
	
	private static void validateName(String fname, String lname) throws InvalidNameException {
		fname = fname.strip();
		
		// first name
		if (fname.matches(regstr)) {
			;
		}
		else {			
			throw new InvalidNameException("Error: firstname can only have alphabets !!");
		}
		
		// last name
		if (lname.matches(regstr)){
			;
		}
		else {			
			throw new InvalidNameException("Error: lastname can only have alphabets !!");
		}
	}
	
	
	

	public static Aadhar CreateAadhar(int age, String fname, String lname, String phonenum) {
		try{
			validateAge(age);
			validateName(fname,lname);
			validatePhone(phonenum);
			String UID = new String();
			Random rand = new Random();
			
			// First value should not be 0
			UID += String.valueOf(rand.nextInt(9)+1);
			
			for (int i = 1; i<16; i++) {
				if (i%4 == 0) {
					UID += " ";
				}
				UID += String.valueOf(rand.nextInt(10));
			}
			return new Aadhar(age,fname,lname,phonenum,UID);
		}
		catch (AgeLessThanZeroException | InvalidPhonenumException | InvalidNameException e) {	
			System.out.println(e.getLocalizedMessage());
			return null;
		}
	}



	/**
	 *	Prints all available states in Aadhar class
	 * 	
	 *	@param:	None
	 *	@return: {@link String}
	 *	@throws: {@link NullPointerException
	 *	@author: Abhishek Rajvir
	 *	@since: {@link 21.0.0}
	 **/
	@Override
	public String toString() {
		try {
			return "Aadhar [age=" + age + ", fname=" + fname + ", lname=" + lname + ", phonenum=" + phonenum + ", UID="
					+ UID + "]";
		}
		catch (NullPointerException e) {
			return "";
		}
	}
	
	
	
	
	
}
	
	
	
	

public class AdharSystem {
	public static void main(String[] args){
		Aadhar abhi = Aadhar.CreateAadhar(21,"Abhishek","Rajvir","+91 7798336299");
		if (abhi == null) {
			System.out.println("\nFailed to create Aadhar");
		}
		else {
			System.out.println("Aadhar card created succesfully..");
			System.out.println(abhi.toString());			
		}
	}

}
