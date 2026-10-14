package navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class forwardbackward {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();		
		cd.get("http://www.google.com");//step-1	
		
		cd.findElementByLinkText("Images").click();//step-2
		Thread.sleep(1000);
		
		cd.navigate().back();//step-3(tab backward)
		Thread.sleep(1000);
		
		cd.navigate().forward();//step-4(tab forward)
		Thread.sleep(1000);
		cd.quit();
	}

}
