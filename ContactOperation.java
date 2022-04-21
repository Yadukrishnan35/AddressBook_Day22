package com.day22;

import java.util.Scanner;

public class ContactOperation {

	AddressBook addressBook = new AddressBook();
	
	public void editContact(AddressBook addressBook) {
		
		String address;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name to edit address:");
		String editName = sc.nextLine();
		if(editName.equals(addressBook.getFirstName())){
			
			System.out.println("Enter your new address:");
			address = sc.nextLine();
			addressBook.setAddress(address);
		}
		else {
			
			System.out.println("Name not existing");
		}
	}
	public AddressBook deleteContact(AddressBook contact){

	        Scanner sc= new Scanner(System.in);
	        System.out.print("\nEnter the First name for delete : ");
	        String deleteName = sc.nextLine();
	        if(deleteName.equals(contact.getFirstName())){
	            AddressBook detail = new AddressBook();
	            System.out.print("\nYour contact deleted..");
	            return detail;
	        }
	        else{
	            System.out.print("\ncouldn't find the contact..");
	        }
	        sc.close();
	        return contact;        
	    }
	
	public void showContact(AddressBook addressBook) {
			
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
