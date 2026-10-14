package mousehandling;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class click {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.mycontactform.com");
		
		Actions act=new Actions(cd);
		WebElement ele=cd.findElementByName("btnSubmit");
		
		
		//act.click(ele).build().perform();
		//Thread.sleep(1000);	
		
		//act.doubleClick(ele).build().perform();
		//Thread.sleep(2000);		
		
		//act.contextClick(ele).build().perform();//right click
		//Thread.sleep(1000);
		
		//act.moveToElement(ele).click().build().perform();//mouse hovering
		//Thread.sleep(1000);
	    
		
		act.clickAndHold(ele).build().perform();
		Thread.sleep(5000);
		act.release().build().perform();
		
		cd.quit();
		
	}
}
