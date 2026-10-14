package mousehandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdropdatepicker {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		
		//drag and drop
		cd.get("https://jqueryui.com/droppable/");
		cd.switchTo().frame(0);
		Actions act=new Actions(cd);
		WebElement ele=cd.findElementById("draggable");
		WebElement ele1=cd.findElementById("droppable");
		act.dragAndDrop(ele, ele1).build().perform();
		Thread.sleep(1000);
				
		//drag and drop by
		cd.get("https://jqueryui.com/slider/");
		cd.switchTo().frame(0);
		Actions act1= new Actions(cd);
		WebElement ele2=cd.findElementById("slider");		
		act1.dragAndDropBy(ele2, 50, 0).build().perform();//(web element,x axis,y axis)
		Thread.sleep(1000);
		
		//datepicker
		cd.get("https://jqueryui.com/datepicker/");
		cd.switchTo().frame(0);
		cd.findElementById("datepicker").click();
		//month(If I want the date is in the different month, copy the path of the forward/backward button, not the month. If I want the date is in the present month, there's no need for forward/backward button, just inspect the same month and copy the path)
		cd.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/div").click();
		//day
		cd.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(2) > td:nth-child(1) > a").click();
		Thread.sleep(1000);
		
		cd.quit();	
	}
}
