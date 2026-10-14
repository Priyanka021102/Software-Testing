package autoit;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autoitclass {
	public static void main(String args[]) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//Thread.sleep(3000);
		d.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html"); //Testing webpage
		Thread.sleep(3000);
		d.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(3000);
		WebElement ele = d.findElement(By.xpath("//input[@type='file']"));
		Actions ac= new Actions(d);
		ac.moveToElement(ele).click().build().perform();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\autoitprojectsample.exe");
	}
}
