package com.pluralsight;

public class HomePage {
	
	static final String URL = "http://www.pluralsight.com";
	static String title = "Unlimited Online Developer, IT and Cyber Security Training | Pluralsight";
	
	public void goTo() {
		Browser.goTo(URL);
		
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
