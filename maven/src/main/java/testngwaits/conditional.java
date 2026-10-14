package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class conditional {
	//explicit wait or conditional synchronization
	
	@Test
	public void testcase() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://www.google.com");
		
		WebDriverWait wdw=new WebDriverWait(cd,5);
		
		wdw.until(ExpectedConditions.titleIs("Google"));
		wdw.until(ExpectedConditions.titleContains("oog"));
		
		//many locators are available with this statement like id, classname, tagname, etc...
		wdw.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images")));
		wdw.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Gma")));
		
		wdw.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("html")));//if other tagname is given it throws error, but everything comes under html tag
		wdw.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Ima")));
		
		//alert
		cd.executeScript("window.confirm('TIME OUT')");//delete this statement to get the error
		wdw.until(ExpectedConditions.alertIsPresent());
		
		cd.quit();
		
	}
}
