package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class hubnode {
RemoteWebDriver ob;
	@Test(priority=0)
	public void setup() throws InterruptedException
	{
		
		String nodeurl="http://192.168.1.37:27389/wd/hub";
		DesiredCapabilities c= DesiredCapabilities.chrome();
				c.setBrowserName("chrome");
		        c.setPlatform(Platform.WINDOWS);
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		try {
			ob= new RemoteWebDriver(new URL(nodeurl),c);
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		ob.get("http://www.google.com");
		System.out.println(ob.getTitle());
		Thread.sleep(2000);
		ob.quit();
	}
}
