package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforeaftertestcaseclassmethod {
	ChromeDriver cd;
	
	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver new\\chromedriver-win64\\chromedriver.exe");
		cd=new ChromeDriver();
		cd.get("http://mycontactform.com");
	}
	
	@AfterTest
	public void aftertest() {
		cd.quit();
	}
	
	@BeforeClass
	public void beforeclass() throws InterruptedException {
		cd.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void afterclass() throws InterruptedException {
		cd.navigate().refresh();
		Thread.sleep(2000);
	}
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException {
		cd.findElementById("user").sendKeys("Dhivyakarthi123");
		cd.findElementByName("pass").sendKeys("12345");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void aftermethod() throws InterruptedException {
		cd.findElementByClassName("btn_log").click();
		Thread.sleep(2000);
	}
	
	@Test
	public void testcase1() throws InterruptedException {
		cd.findElementByLinkText("Pricing").click();
		Thread.sleep(2000);
	}
	
	@Test
	public void testcase2() throws InterruptedException {
		cd.findElementByLinkText("Help").click();
		Thread.sleep(2000);
	}
	
	/*
	 * before test  : visiting mycontactform
	 * before class : maximizing mycontactform
	 * before method: username & password is given
	 * testcase 1   : clicking pricing
	 * after method : login button is clicked
	 * before method: username & password is given
	 * testcase 2   : clicking help
	 * after method : login button is clicked
	 * after class  : mycontactform is refreshed
	 * after test   : closing mycontactform
	 */


}
