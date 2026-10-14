package introduction;

import org.openqa.selenium.chrome.ChromeDriver;

public class browseroperations {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver new\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		
		//to open a website
		obj.get("http://www.google.com");
		
		//to maximize the window
		obj.manage().window().maximize();
		
		//refresh for n no.of times using loop
		for(int n=0;n<2;n++) {
			obj.navigate().refresh();//refresh once use just this
		}
		
		//hold the page/site for certain amount of time
		Thread.sleep(3000);
		
		//to exit the website
		obj.quit();
	}
}
