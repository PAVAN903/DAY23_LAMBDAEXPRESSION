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
	boolean validNamemob(String mobile)
	{
        Pattern pattern=Pattern.compile("^91([ ])?[7-9]{1}[0-9]{9}$");
		boolean matches=pattern.matcher(mobile).matches();
		return matches;
		
	}
	boolean validPassword(String Spassword)
	{
		Pattern pattern=Pattern.compile("^[A-Z]{1}([@#$%^&*]){1}[a-z0-9]{8,}");
		boolean matches=pattern.matcher(Spassword).matches();
		return matches;
	}
	}
