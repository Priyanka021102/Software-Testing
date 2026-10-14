package otherwebelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownlistboxes {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.letskodeit.com/practice");
		
		//dropdown box
		WebElement ele=cd.findElementById("carselect");//Id is in the select tag
		Select sel=new Select(ele);
		
		//index number
		sel.selectByIndex(0);
		Thread.sleep(1000);	
		//value
		sel.selectByValue("benz");
		Thread.sleep(1000);
		//text in the web page
		sel.selectByVisibleText("Honda");//should be same
		Thread.sleep(1000);
		//no de-select available in dropdown box

		//listbox
		WebElement ele1=cd.findElementById("multiple-select-example");//expand fieldset tag & Id is in the division tag
		Select sel1=new Select(ele1);
		
		//index number
		sel1.selectByIndex(0);
		Thread.sleep(1000);
		//value
		sel1.selectByValue("orange");
		Thread.sleep(1000);
		//text in the web page
		sel1.selectByVisibleText("Peach");//should be same
		Thread.sleep(1000);
				
		//de-select
		//index number
		sel1.deselectByIndex(0);
		Thread.sleep(1000);
		
		//value
		sel1.deselectByValue("orange");
		Thread.sleep(1000);
		
		//text in the web page
		sel1.deselectByVisibleText("Peach");
		Thread.sleep(1000);
		
		cd.quit();
	}
}
