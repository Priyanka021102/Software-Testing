package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://mycontactform.com");
		
		//absolute xpath
		cd.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("bye");
		Thread.sleep(2000);
				
		//relative xpath
		cd.findElementByXPath("//*[@id=\"pass\"]").sendKeys("tata");
		Thread.sleep(2000);
		
		cd.navigate().refresh();
		
		//locator xpath
		cd.findElementByXPath("//*[@id='user']").sendKeys("bye");
		Thread.sleep(2000);
		
		//attribute xpath
		cd.findElementByXPath("//*[@type='password']").sendKeys("tata");
		Thread.sleep(2000);
		
		cd.quit();
	}
}
