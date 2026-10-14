package logfile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class logfile1 {
	static Logger Log=LogManager.getLogger(logfile1.class);
	
    @Test
	public void log() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		
		Log.info("Visiting Website");
		obj.get("http://www.google.com");
		
		Log.info("Checking Title");
		Assert.assertNotEquals(obj.getTitle(),"Googlefdfle");
		
		Log.info("Checking Images");
		WebElement ele=obj.findElementByLinkText("Images");
		
		Log.info("Checking Display");
		Assert.assertTrue(ele.isDisplayed());
		
		Log.warn("Exiting");
		Assert.assertFalse(ele.isSelected());
		obj.quit();
	}
}

