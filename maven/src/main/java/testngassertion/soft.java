package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft {
	@Test
	public void testcase() {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://www.google.com");
		SoftAssert st=new SoftAssert();
		//assertequals(actual,expected)
		st.assertEquals(cd.getTitle(),"Google");
		//assertnotequals(actual,expected)
		st.assertNotEquals(cd.getTitle(),"google");
		
		WebElement ele=cd.findElementByLinkText("Images");
		//assertTrue(condition)
		st.assertTrue(ele.isSelected());
		//assertFalse(condition)
		st.assertFalse(ele.isDisplayed());
		
		cd.quit();
		st.assertAll();

		
	}

}
