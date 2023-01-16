package com.bridgelabday23;

import java.util.regex.Pattern;

public class UserRegistration {
	boolean valid(String name)
	{
		Pattern pattern=Pattern.compile("^[A-Z]{1}[a-zA-Z]{3,}");
		boolean matches=pattern.matcher(name).matches();
		return matches;
		
	}
	boolean validName(String mail)
	{
		
		Pattern pattern1=Pattern.compile("^[a-z0-9]+([@#$%][a-zA-Z]+)*[@][a-z]{2,}[.][a-z]{2,}([.][a-z]{2})?$");
		boolean matches=pattern1.matcher(mail).matches();
		return matches;
		
	}
	}
