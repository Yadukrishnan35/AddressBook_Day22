package com.day22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String firstName, lastName, email,address,city,state;;
		long phoneNo;
		int zip;
		char option;
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
		
		ContactOperation contactOperation = new ContactOperation();
		contactOperation.showContact(addressBook);
		
		System.out.println("Do you want to Edit Press(Y/N)");
		option = scanner.next().charAt(0);
		
		
		if(option == 'Y') {
			
			contactOperation.editContact(addressBook);
			
		}
			contactOperation.showContact(addressBook);
		
		 	System.out.print("\nDo you want to delete? press Y / N : ");
	        char deleteOption = scanner.next().charAt(0);
	        if(deleteOption == 'Y'){
	            addressBook = contactOperation.deleteContact(addressBook);
	        }
	        contactOperation.showContact(addressBook);
	        scanner.close();
		
	}

}
