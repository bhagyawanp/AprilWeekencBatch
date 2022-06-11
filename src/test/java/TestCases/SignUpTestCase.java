package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.signUpPageObjects;
import Resources.BaseClass;

public class SignUpTestCase extends BaseClass{
	
	@Test
	public void fillSignupData() throws IOException, InterruptedException {
		
	//	driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		signUpPageObjects obj=new signUpPageObjects(driver);
		obj.EnterFirstname().sendKeys("rahul");
		
		Thread.sleep(5000);
		 Select s=new Select(obj.EnterJobTitle());
		 s.selectByIndex(1);
		 
		 
		
		
	
	}

}
