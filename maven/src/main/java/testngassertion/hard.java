package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testnglistener.Itestlistener.class)//Itestlistner uses this program

public class hard {
	@Test
	public void testcase() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://www.google.com");
		//assertequals(actual,expected)
		Assert.assertEquals(cd.getTitle(),"Google");
		//assertnotequals(actual,expected)
		Assert.assertNotEquals(cd.getTitle(),"google");
		
		WebElement ele=cd.findElementByLinkText("Images");
		//assertTrue(condition)
		Assert.assertTrue(ele.isDisplayed());//if its false then the execution stops here
		//assertFalse(condition)
		Assert.assertFalse(ele.isSelected());
		
		cd.quit();
	}
}
