package com.blz.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Contacts> person;

    // constructor
    public AddressBookMain() {
	person = new ArrayList<Contacts>();
    }

    // add new person record to array list after taking input

    public void addPerson() {
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

    }// end of add person method

    public static void main(String[] args) {
	System.out.println("Welcome to Address Book Program in AddressBookMain class");
	AddressBookMain ab = new AddressBookMain();
	ab.addPerson();

    }// end of main

}/// end of class
