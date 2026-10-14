package testngattributes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class attributesusedinwebsite {
	ChromeDriver cd;//declaring as global variable so that all test cases can use it
	
	@Test(priority=0,description="google",groups="Parent")
	public void google() {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		cd=new ChromeDriver();//local declaration
		cd.get("http://www.google.com");
	}
	
	@Test(priority=1,description="maximize",groups="Parent")
	public void maximise() {
		cd.manage().window().maximize();
	}
	
	@Test(priority=2,description="googleimages",dependsOnGroups="Parent")
	public void images() {
		cd.findElementByLinkText("Images").click();
		cd.quit();
	}

}
