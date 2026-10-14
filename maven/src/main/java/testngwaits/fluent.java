package testngwaits;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class fluent {
	
	//type of explicit wait, not preferred
    //Fluent Wait in Selenium marks the maximum amount of time for Selenium WebDriver
	//to wait for a certain condition (web element) becomes visible. 
	//It also defines how frequently WebDriver will check if the condition appears
	//before throwing the “ElementNotVisibleException”.
	
	@Test
	public void testcase() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://www.google.com");
		
		//Declare and initialise a fluent wait
		FluentWait fw = new FluentWait(cd);
		
		//Specify the timout of the wait
		fw.withTimeout(6000, TimeUnit.MILLISECONDS);
				
		//Sepcify polling time
		fw.pollingEvery(2000, TimeUnit.MILLISECONDS);
		
		//alert
		cd.executeScript("window.confirm('TIME OUT')");//delete this statement to get the error
		fw.until(ExpectedConditions.alertIsPresent());
						
		cd.quit();
	}


	// explici twait:   visit fabook.com
	// presence of alert
	}

