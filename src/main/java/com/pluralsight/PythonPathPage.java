package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PythonPathPage extends PathPage {
	@FindBy(how = How.CSS, using = "div.large-7:nth-child(1) > h1:nth-child(2)")
	WebElement pageElement;
	
	@Override
	public void goTo() {
		WebElement pythonPathLink = Browser.driver.findElement(By.xpath("//div[160]/a/div"));
		pythonPathLink.click();
	}

	@Override
	public String pathName() {
		return pageElement.getText();
	}

}
