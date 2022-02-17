package com.blz.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Contacts> person = new ArrayList<Contacts>();

    // constructor
    public AddressBookMain() {
//	ArrayList<Contacts> person = new ArrayList<Contacts>();
    }

    // add new person record to array list after taking input

    public Contacts addPerson() {
	System.out.println("Enter the First Name");
	String fName = scanner.next();
	System.out.println("Enter the Last Name");
	String lName = scanner.next();
	System.out.println("Enter the Address");
	String address = scanner.next();
	System.out.println("Enter the City");
	String city = scanner.next();
	System.out.println("Enter the State");
	String state = scanner.next();
	System.out.println("Enter the Zip");
	String zip = scanner.next();
	System.out.println("Enter the PhoneNumber");
	String phoneNumber = scanner.next();
	System.out.println("Enter the Email");
	String email = scanner.next();
	// creating constructor
	Contacts contacts = new Contacts(fName, lName, address, city, state, zip, phoneNumber, email);

	// add the above list to to Contacts array list
	person.add(contacts);

	// printing contacts object data inside
	System.out.println(contacts);

	return contacts;

    }// end of add person method

    // Edit contact details using person name
    public void editPerson() {
	System.out.println("Enter name to Edit");
	String s = scanner.next();
	AddressBookMain ab = new AddressBookMain();

	for (int i = 0; i < person.size(); i++) {
	    Contacts p = (Contacts) person.get(i);
	    if (s.equals(p.getFirstName())) {
		System.out.println(p);
		System.out.print("choice to edit 1)firstName\n2)lastName\n3)address\n4)city\n5)state\n"
			+ "6)zip\n7)phoneNumber\n8)email\n9)exit");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1 -> p.setFirstName(scanner.next());
		case 2 -> p.setLastName(scanner.next());
		case 3 -> p.setAddress(scanner.next());
		case 4 -> p.setCity(scanner.next());
		case 5 -> p.setState(scanner.next());
		case 6 -> p.setZip(scanner.next());
		case 7 -> p.setPhoneNumber(scanner.next());
		case 8 -> p.setEmail(scanner.next());

		}
		person.set(i, p);
		System.out.println(p);
	    }
	}

    }

    // delete contant details using person name
    public void deletePerson() {
	System.out.println("Enter name to Delete");
	String s = scanner.next();

	for (int i = 0; i < person.size(); i++) {
	    Contacts p = (Contacts) person.get(i);
	    if (s.equals(p.getFirstName())) {
		System.out.println(p);
		person.remove(i);
		System.out.println(person.isEmpty());
	    }
	}

    }

    // main program
    public static void main(String[] args) {
	System.out.println("Welcome to Address Book Program in AddressBookMain class");
	AddressBookMain ab = new AddressBookMain();
	ab.addPerson();
	ab.editPerson();
	ab.deletePerson();

    }// end of main

}/// end of class
