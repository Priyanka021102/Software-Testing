package otherwebelements;

import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttoncheckbox {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.letskodeit.com/practice");
		
		//radiobuttons
		cd.findElementById("bmwradio").click();
		Thread.sleep(1000);
		cd.findElementById("benzradio").click();
		Thread.sleep(1000);
		cd.findElementById("hondaradio").click();
		Thread.sleep(1000);
		//no de-select available in radiobuttons
		
		//checkboxes
		cd.findElementById("bmwcheck").click();
		Thread.sleep(1000);
		cd.findElementById("benzcheck").click();
		Thread.sleep(1000);
		cd.findElementById("hondacheck").click();
		Thread.sleep(1000);
		//to de-select repeat the same command
		cd.findElementById("hondacheck").click();
		Thread.sleep(1000);
		
		cd.quit();
		
	}	

}
