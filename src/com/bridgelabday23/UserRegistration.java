package com.bridgelabday23;

import java.util.regex.Pattern;

public class UserRegistration {
	boolean valid(String name)
	
	
    {
		Pattern pattern=Pattern.compile("^[A-Z]{1}[a-zA-Z]{3,}");
		boolean matches=pattern.matcher(name).matches();
		return matches;
		
	}
	}
