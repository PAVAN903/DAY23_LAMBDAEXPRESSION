package com.bridgelabday23;

import java.util.regex.Pattern;

public class Firstname {
	boolean firstname(String Firstname) {
		Pattern pattern=Pattern.compile("^[A-Z]{1}[a-zA-Z]{3,}");
		boolean matches=pattern.matcher(Firstname).matches();
		return matches;
		
	}

}
