package com.bridgelabday23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	UserRegistration user=new UserRegistration();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first name");
	String fname=sc.next();
	if(user.valid(fname)==true) {
		System.out.println("first name is valid");
	}else {
		System.out.println("first name is not valid");
	}
	System.out.println("enter lastname");
	String lname=sc.next();
	if(user.valid(lname)==true) {
		System.out.println("last name is valid");
	}else {
		System.out.println("last name is not valid");
    }
	System.out.println("enter mail id");
	String mail=sc.next();
	if(user.validName(mail)==true) {
		System.out.println("mail id is valid");
	}else {
		System.out.println("mail is not is valid");
	}
	System.out.println("enter mobile number");
	String mobile=sc.next();
	if(user.validNamemob(mobile)==true) {
		System.out.println("mobile number is valid");
	}else {
		System.out.println("mobile number is not is valid");
	}
	System.out.println("enter password");
	String password=sc.next();
	if(user.validPassword(password)==true) {
		System.out.println("password is valid");
	}else {
		System.out.println("password is not valid");
	}
	System.out.println("enter password with upper case letter and numeric ");
	String Npassword=sc.next();
	if(user.validPassword(Npassword)==true) {
		System.out.println("password is valid");
	}else {
		System.out.println("password is not valid");
	}
	}
	}
