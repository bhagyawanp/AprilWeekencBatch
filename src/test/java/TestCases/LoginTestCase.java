package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;

public class LoginTestCase extends BaseClass{
	///We have achived inhertnac ehere
	
	@Test(dataProvider="testData")
	public void luanchURl(String username,String password) throws IOException, InterruptedException {	
		//This driver have scope
	

	 LoginPageObjects obj=new  LoginPageObjects(driver);
	 //We have achived sbstarction here
	 obj.enterUsername().sendKeys(username);
	 obj.enterPassword().sendKeys(password);
	 obj.clickLogin().click();
	 
	 Thread.sleep(2000);
	 
	 WebElement a=obj.ErrorTextCapture();
	 String actualText= a.getText();
	 
	 
	 String ExpectedText="Your have beenn logged in succesfully";
	 
	 
	 Assert.assertEquals(actualText, ExpectedText);
	 
	}
	

	@DataProvider
	public Object[][] testData() {
		Object[][] data=new Object[2][2];
		data[0][0]="test1";
		data[0][1]="secure@1234";
		data[1][0]="test2";
		data[1][1]="secure@345";
		
		
		return data;
		
		
	}
	
	
	
}
