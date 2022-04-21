package com.day22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String firstName, lastName, email,address,city,state;;
		long phoneNo;
		int zip;
		Scanner scanner = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();
		
		System.out.println("Enter the first name:");
		firstName = scanner.next();
		addressBook.setFirstName(firstName);
		
		System.out.println("Enter the Last name:");
		lastName = scanner.next();
		addressBook.setLastName(lastName);
		
		System.out.println("Enter the Email:");
		email = scanner.next();
		addressBook.setEmail(email);
		
		System.out.println("Enter the Address:");
		address = scanner.next();
		addressBook.setAddress(address);
		
		System.out.println("Enter the City:");
		city = scanner.next();
		addressBook.setCity(city);
		
		System.out.println("Enter the State:");
		state = scanner.next();
		addressBook.setState(state);
		
		System.out.println("Enter the Phone Number:");
		phoneNo = scanner.nextLong();
		addressBook.setPhoneNo(phoneNo);
		
		System.out.println("Enter the Zip:");
		zip = scanner.nextInt();
		addressBook.setZip(zip);
		
		scanner.close();
		
		System.out.println("First Name : "+addressBook.getFirstName());
		System.out.println("Last Name  : "+addressBook.getLastName());
		System.out.println("Email      : "+addressBook.getEmail());
		System.out.println("Address    :  "+addressBook.getAddress());
		System.out.println("City       :   "+addressBook.getCity());
		System.out.println("State      :   "+addressBook.getState());
		System.out.println("Phone Number: "+addressBook.getPhoneNo());
		System.out.println("Zip :"+addressBook.getZip());
	
	}

}
