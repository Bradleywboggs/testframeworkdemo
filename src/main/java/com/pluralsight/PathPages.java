package com.pluralsight;


public class PathPages {
	static final String URL = "https://www.pluralsight.com/paths";
	static String title = "Java | Pluralsight";
	
	public void goTo() {
		Browser.goTo(URL);
		
	}

	public PathPage getPathPage(String page) {
		switch (page) {
		case "Java":
			return Pages.javaPathPage();
		case "Python":
			return Pages.pythonPathPage();
		case "JavaScript":
			return Pages.javaScriptPathPage();
		}
		return null;
		
	}
	 
	public boolean isAt() {
		return Browser.title().equals(title);
	}
	
		

}
 