package package1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class1 {
	@Test(groups="PACKAGE 1")
	public void testcase1() throws InterruptedException, IOException {
		//any selenium code can be given
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
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
		
		File f=obj.getScreenshotAs(OutputType.FILE);//to get the screenshot of the output
		FileUtils.copyFile(f, new File("screenshot1.png"));//format should always be in png
		
		//to exit the website
		obj.quit();
		
	}

}
