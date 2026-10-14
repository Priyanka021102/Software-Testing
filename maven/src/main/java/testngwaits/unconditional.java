package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class unconditional {
	//implicit wait
	@Test
	public void testcase() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://www.mycontactform.com");
		
		cd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// waits for 3 second for every statement if the statement is not executed and then throws error
		cd.findElementById("user").sendKeys("Dhivyakarthi123");
		cd.findElementByName("pass").sendKeys("12345");
		cd.findElementByClassName("btn_log").click();
		cd.navigate().refresh();
		cd.quit();
	}

}
