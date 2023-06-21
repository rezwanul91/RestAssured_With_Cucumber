package base;

import java.util.Random;

import io.cucumber.java.Before;

public class Base {
	
	public String setUp() {
		Random random = new Random();
	    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
	    StringBuilder usernameBuilder = new StringBuilder();
	    StringBuilder emailBuilder = new StringBuilder();
	    for (int i = 0; i < 8; i++) {
	        int index = random.nextInt(characters.length());
	        usernameBuilder.append(characters.charAt(index));
	    }
	   
	  String  randomUserName = usernameBuilder.toString();
	  return randomUserName;
	   
	}


}// class
