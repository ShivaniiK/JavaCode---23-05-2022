package com;

public class TestString {

	public static void main(String[] args) {
		
        StringJava objStringJava = new StringJava();
		
		objStringJava.arrayString();
		
		System.out.println("==============================================================");
		objStringJava.stringCompare();
		
		System.out.println("==============================================================");
		objStringJava.stringByChar();
		
		
		System.out.println("==============================================================");
		String strFullName = objStringJava.getFullName("Shivani","Kaingade");
		System.out.println("Full name : "+strFullName);
		
		
		System.out.println("==============================================================");
		String strCompanyName = objStringJava.getCompanyName("Verve Square Technologies");
		System.out.println("Company name : "+strCompanyName);
		System.out.println("Company name length : "+strCompanyName.length());
		
		
		System.out.println("==============================================================");
		objStringJava.stringContains();
		
		

		System.out.println("==============================================================");
		objStringJava.endString();
		
		
		System.out.println("==============================================================");
		 
		String strTechnology = objStringJava.verifyWordInCompany(strCompanyName);
		System.out.println("get Technologies : "+strTechnology);
		System.out.println("get Technologies length : "+strTechnology.length());
		System.out.println("get Technologies length : "+strTechnology.toUpperCase());
		System.out.println("get Technologies length : "+strTechnology.toLowerCase()); 
		

	}

}

	
