package com.day22;

public class AddressBook {

	String firstName,lastName,address,city,state,email;
	long phoneNo;
	int zip;
	
	public void setDetails() {
		
		firstName = "Yadu";
		lastName  = "Krishnan";
		address   = "Nirmalyam";
		city	  = "Kalpathur";
		state	  = "Kerala";
		email	  =	"xyz@gmail.com";
		phoneNo   = 3333333;
		zip		  = 76439;
		
	}

	public void print() {
		
		System.out.println("\nfirstName : " + firstName +"\n LastName : "+ lastName +
				"\n Address: "+ address +"\nCity : "+city +"\nState :"+state +"\nEmail :"+email+ 
				"\nPhone No:" +phoneNo+"\nZip :"+zip);
	
	}

}


