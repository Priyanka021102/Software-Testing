package projectpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import projectpackage.projectclass2;

public class projectclass2 {
	static Logger Log=LogManager.getLogger(projectclass2.class);
	@Parameters({"USER","PASS"})
	@Test
	public void test1(String u, String v) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		Log.info("Visiting Website");
		obj.get("http://www.mycontactform.com");
		
		Log.info("Checking Title");
		Assert.assertNotEquals(obj.getTitle(),"mycontactform");
		
		Log.info("Username");
		obj.findElementById("user").sendKeys(u);
		Thread.sleep(1000);
		
		Log.info("Password");
		obj.findElementByName("pass").sendKeys(v);
		Thread.sleep(1000);
		
		Log.info("Logging in");
		obj.findElementByClassName("btn_log").click();
		Thread.sleep(1000);
		
		Log.warn("Exiting");
		obj.quit();
		
	}

}
