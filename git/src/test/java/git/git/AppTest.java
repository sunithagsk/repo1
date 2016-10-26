package git.git;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AppTest{
    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://www.guru99.com/selenium-tutorial.html");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Free Selenium Tutorials")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
		    //driver = new FirefoxDriver();
			
			 	

			 File pathToBinary = new File("C:\\Users\\372516\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			 FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
			 FirefoxProfile firefoxProfile = new FirefoxProfile();       
			 WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);


		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	