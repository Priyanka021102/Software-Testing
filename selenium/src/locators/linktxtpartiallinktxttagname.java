package locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktxtpartiallinktxttagname {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://www.google.com");
		
		//linktext
		cd.findElementByLinkText("Gmail").click();
		Thread.sleep(2000);
		
		//partiallinktext
		cd.findElementByPartialLinkText("Si").click();//Sign in
		Thread.sleep(2000);
		
		//tagname(Counts from Sign in page)
		List<WebElement> t=cd.findElementsByTagName("img");
		System.out.println("No.of elements with img(image) tag:"+t.size());
		
		List<WebElement> t1=cd.findElementsByTagName("a");
		System.out.println("No.of elements with a(link) tag:"+t1.size());
		
		List<WebElement> t2=cd.findElementsByTagName("div");
		System.out.println("No.of elements with div(division) tag:"+t2.size());
		
		cd.quit();
		
	}
}
