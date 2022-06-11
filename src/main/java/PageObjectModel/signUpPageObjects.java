package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPageObjects {
	public WebDriver driver;
	
	By firstName=By.xpath("//input[@name='UserFirstName']");
	By jobTitle=By.xpath("//select[@name='UserTitle']");
	
	
	
	
	public signUpPageObjects(WebDriver driver2) {
	    this.driver=driver2;
	}

	public WebElement EnterFirstname() {
		return driver.findElement(firstName);
	}
	
	public WebElement EnterJobTitle() {
		return driver.findElement(jobTitle);
	}

}
