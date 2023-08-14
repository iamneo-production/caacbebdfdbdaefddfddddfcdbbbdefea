package com.examly.springapp;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SpringApplicationTests {

    ChromeOptions chromeOptions = new ChromeOptions();
    WebDriver driver = null;
    String bUrl = "http://iamneo.ai";
		String facebookUrl = "https://www.facebook.com";

    @BeforeTest
    public void beforeTest() throws Exception
     {
   // replace seleniumhost and port with correct values
        driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
        driver.manage().window().maximize();
    }
    @Test(priority= 0)
		public void oprn() {

			driver.get(bUrl);

			String titleOfThePage = driver.getTitle();
			
			Assert.assertEquals(titleOfThePage, "We are Hiring!");

		}

		@Test(priority= 1)
		public void navigateCommands() {
			driver.navigate().to(facebookUrl);
		
		}
		@Test(priority= 2)
		public void navigateCommandsb() {
		
			driver.navigate().back();
		}
		
		@Test(priority= 3)
		public void url1() {
		
			String currentUrl = driver.getCurrentUrl();

			System.out.println("Current URL :: " + currentUrl);
	}
			
		@Test(priority= 4)
		public void url12() {
			driver.navigate().forward();
		}
		
		@Test(priority= 5)
		public void url123() {
			driver.navigate().refresh();

	                
		}
	
		

    @AfterTest
    public void afterTest() 
    {
        driver.quit();
    }

}