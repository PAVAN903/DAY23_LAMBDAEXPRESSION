package com.bridgelabday23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Firstname user=new Firstname();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first name");
	String fname=sc.next();
	if(user.firstname(fname)==true) {
		System.out.println("valid first name");
	}else {
		System.out.println("invalid first name");
	}

	}

}
