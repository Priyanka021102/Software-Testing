package packageparameter;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	@Parameters({"USER","PASS"})
	@Test
	public void test1(String u, String v) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("http://www.mycontactform.com");
		
		obj.findElementById("user").sendKeys(u);
		Thread.sleep(1000);
		obj.findElementByName("pass").sendKeys(v);
		Thread.sleep(1000);
		obj.findElementByClassName("btn_log").click();
		Thread.sleep(1000);
		obj.quit();
		
	}

}
