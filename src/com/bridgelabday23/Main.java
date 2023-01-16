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

	}

}
