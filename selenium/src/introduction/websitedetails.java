package introduction;

import org.openqa.selenium.chrome.ChromeDriver;

public class websitedetails {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("http://www.google.com");
		
		//all uses get method
		
		System.out.println(obj.getTitle());//title
		
		System.out.println(obj.getCurrentUrl());//URL
		
		System.out.println(obj.getCapabilities());//browser details(name, version)
		
		System.out.println(obj.manage().window().getSize());//size of the window in dimension(height,width)
		
		System.out.println(obj.manage().window().getPosition());//size of the window in graph position(x,y)
		
	}
}
