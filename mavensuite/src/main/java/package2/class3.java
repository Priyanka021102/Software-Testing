package package2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class3 {
	@Test(groups="PACKAGE 2")
	public void testcase3() {
		//any selenium code can be given
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("http://www.google.com");
		
		//all uses get method
		
		System.out.println(obj.getTitle());//title
		
		System.out.println(obj.getCurrentUrl());//URL
		
		System.out.println(obj.getCapabilities());//browser details(name, version)
		
		System.out.println(obj.manage().window().getSize());//size of the window in dimension(height,width)
		
		System.out.println(obj.manage().window().getPosition());//size of the window in graph position(x,y)
		
		obj.quit();
		
	}

}
