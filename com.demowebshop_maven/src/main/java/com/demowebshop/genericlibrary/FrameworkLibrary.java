package com.demowebshop.genericlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class FrameworkLibrary implements FrameWorkConstants {

//	public WebDriver chromeBrowser(String Url)
//	{
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(Url);
//		return driver;
//	}
	
	public Actions actions;
	public WebDriverWait wait;
	public SoftAssert softAssert;
	
	public void selectclass(WebElement dropdown, String option)
	{
		
		Select select= new Select(dropdown);
		int counter=0;
		try {
			int indexvalue= Integer.parseInt(option);
			select.selectByIndex(indexvalue);
			counter++;
		}
		catch (Exception e) {
			if(counter==0) {
				try {
					select.selectByVisibleText(option);
				}
				catch (Exception e1) {
					select.selectByValue(option);
				}
			}		
		}
	}
	public void deselectclass(WebElement dropdown, String option)
	{
		Select deselect= new Select(dropdown);
		int counter=0;
		try {
			int indexvalue= Integer.parseInt(option);
			deselect.deselectByIndex(indexvalue);
			counter++;
		}
		catch (Exception e) {
			if(counter==0) {
				try {
					deselect.deselectByVisibleText(option);
				}
				catch (Exception e1) {
					deselect.deselectByValue(option);
				}
				
			}
			else {
			
				deselect.deselectAll();
			}
		}
	}
	
	public void takeScreenShotOfPage(WebDriver driver) throws Throwable
	{
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File dest=new File("./Screenshots/"+dateandtime()+".png");
		File temp=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(temp, dest);
	}
	public void takeScreenShotOfElement(WebElement element) throws Throwable
	{
		File dest=new File("./Screenshots/element"+dateandtime()+".png");
		File temp=element.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(temp, dest);
	}
	public String dateandtime()
	{
		LocalDateTime datetime=LocalDateTime.now();
		String fileName=datetime.toString().replace(":", "-");
		return fileName;
	}
	public String getPropertyValue(String Key) throws IOException {
		File file=new File(PROPERTIES_PATH);
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(Key)
;
	}
	
	
	public void initObjects(WebDriver driver){
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		softAssert = new SoftAssert();
		
	}
	
	public void scrollTillWebElement(WebElement element) {
		actions.scrollToElement(element);
		
		
	}
	
}
