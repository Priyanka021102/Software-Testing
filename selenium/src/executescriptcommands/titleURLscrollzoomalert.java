package executescriptcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class titleURLscrollzoomalert {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://www.mycontactform.com");
		
		System.out.println(cd.executeScript("return document.title"));
		System.out.println(cd.executeScript("return document.URL"));
		
		cd.manage().window().maximize();
		
		//SCROLL UP & DOWN
		cd.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		cd.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//SCROLL INBETWEEN
		cd.executeScript("window.scrollBy(0,50)");
		Thread.sleep(2000);
		cd.executeScript("window.scrollBy(0,-50)");
		Thread.sleep(2000);
		
		//ZOOM IN(greater than 100):
		cd.executeScript("document.body.style.zoom='200%'");
		Thread.sleep(2000);
				
		//NORMAL(equal to 100):
		cd.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(2000);
				
		//ZOOM OUT(lesser than 100):
		cd.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(2000);
		
		//ALERT
		//alert window will pop-up(click OK/Cancel manually)
		cd.executeScript("window.confirm('TIME OUT')");//use just this command to get alert window
				
		//switching control to alert(clicks OK automatically and alert closes)
		Alert a=cd.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
		
		cd.navigate().refresh();
		
		//just alert message will pop-up
		cd.executeScript("alert('TIME OUT')");
		Thread.sleep(2000);
		
		cd.quit();

	}
}
