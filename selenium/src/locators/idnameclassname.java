package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class idnameclassname {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://www.mycontactform.com");
					
			cd.findElementById("user").sendKeys("Dhivyakarthi123");
			Thread.sleep(2000);
			cd.findElementByName("pass").sendKeys("12345");
			Thread.sleep(2000);
			cd.findElementByClassName("btn_log").click();
			Thread.sleep(2000);
			
			cd.quit();
			
	}		
}

