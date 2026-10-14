package package1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class2 {
	@Test(groups="PACKAGE 1")
	public void testcase2() throws InterruptedException {
		//any selenium code can be given
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.google.com");
		
		//re-sizing
		Dimension d=new Dimension(1000,1000);//creating object and giving values for dimension(height,width)
		cd.manage().window().setSize(d);//using set method object is being passed	
		
		Thread.sleep(3000);
		
		//re-positioning
		Point p=new Point(150,300);//creating object and giving values for graph positions(x,y)
		cd.manage().window().setPosition(p);//using set method object is being passed
		
		cd.quit();
		
	}

}
