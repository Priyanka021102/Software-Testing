package projectpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class projectclass1 {
ChromeDriver cd;
	
	@BeforeTest
	public void beforetest() throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		cd=new ChromeDriver();
		cd.get("http://mycontactform.com");
		File f=cd.getScreenshotAs(OutputType.FILE);//to get the screenshot of the output
		FileUtils.copyFile(f, new File("interview1.png"));//format should always be in png
	}
	
	@AfterTest	
	public void aftertest() throws InterruptedException {
		cd.quit();
		Thread.sleep(1000);
	}
	
	@BeforeClass
	public void beforeclass() throws InterruptedException {
		cd.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	@AfterClass
	public void afterclass() throws InterruptedException, IOException {
		cd.findElementByName("Submit").click();
		File f=cd.getScreenshotAs(OutputType.FILE);//to get the screenshot of the output
		FileUtils.copyFile(f, new File("interview3.png"));//format should always be in png
		Thread.sleep(1000);
	}
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException {
		cd.findElementByCssSelector("#right_col_middle > a").click();
	}
	
	@AfterMethod
	public void aftermethod() throws InterruptedException, IOException {
		cd.findElementById("useragree").click();
		File f=cd.getScreenshotAs(OutputType.FILE);//to get the screenshot of the output
		FileUtils.copyFile(f, new File("interview2.png"));//format should always be in png
		Thread.sleep(1000);
	}
	
	@Test
	public void testcase1() throws InterruptedException {
		
		cd.findElementById("name").sendKeys("Alice Cooper");
		Thread.sleep(1000);
		
		cd.findElementById("email").sendKeys("priyankas34523517@gmail.com");
		Thread.sleep(1000);
		
		cd.findElementById("user_signup").sendKeys("AliceCooper021102");
		Thread.sleep(1000);
		
		cd.findElementById("pass_signup").sendKeys("021102@gmail");
		Thread.sleep(1000);
		
		cd.findElementById("pass2").sendKeys("021102@gmail");
		Thread.sleep(2000);
		
	}
	

}
