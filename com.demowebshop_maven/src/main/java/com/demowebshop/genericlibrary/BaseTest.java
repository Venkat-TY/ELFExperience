package com.demowebshop.genericlibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends FrameworkLibrary
{
	
public	WebDriver driver;
	
	@BeforeMethod
	public void browserSetup() throws Throwable {
		if(getPropertyValue("browser").equals("chrome")) 
		{
		driver= new ChromeDriver();
		}
		else if (getPropertyValue("browser").equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.get(getPropertyValue("url"));
		
	}
	@AfterMethod
	public void broswerTearDown() 
	{
		driver.close();
		//softAssert.assertAll();
	}

	
	
}
