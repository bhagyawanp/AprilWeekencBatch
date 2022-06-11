package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


//This is my comment for demo pupose

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver driverInitialization() throws IOException {
		
		//To read the properties file
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");
		
		//To access the data.properties file
	     prop=new Properties();
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.contentEquals("chrome")) {
			//WebDriverManager.chromedriver().browserVersion("79.0.9").setup(); //To run  specic chrome driver	
			   WebDriverManager.chromedriver().setup(); // it will run automtically with you latest browser 
			
		    driver = new ChromeDriver();
		    	
		}else if(browserName.contentEquals("firfox")) {
			
			//FireFox code
		}
        else if(browserName.contentEquals("Edge")) {
			
			//FireFox code
		}
        else {
        	System.out.println("please  provide browser browser value");
        }
		
		
		return driver;
			
		
	}
	@BeforeMethod
	public void launchDriver() throws IOException {
		
		driver=driverInitialization();
		driver.get(prop.getProperty("url"));
	}
	@AfterMethod
	public void closeBrowser() throws IOException {
		
	         driver.close();
	}
	
	

}
