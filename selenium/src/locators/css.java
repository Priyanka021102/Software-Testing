package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class css {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		
		//1.tagname & id
		cd.get("http://mycontactform.com");
		cd.findElementByCssSelector("input#user").sendKeys("hi");
		
		//2.tagname & classname
		cd.get("http://mycontactform.com");
		cd.findElementByCssSelector("input.txt_log").sendKeys("hello");
		
		//3.tagname & attribute
		cd.get("http://mycontactform.com");
		cd.findElementByCssSelector("input[type='password']").sendKeys("bye");
		
		//4.tagname,classname & attribute
		cd.get("http://mycontactform.com");
		cd.findElementByCssSelector("input.txt_log[type='password']").sendKeys("hi");
		
		//5.tagname & prefix of attribute
		cd.get("http://mycontactform.com");
		cd.findElementByCssSelector("input[type^='pa']").sendKeys("hello");
		
		//6.tagname & suffix of attribute
		cd.get("http://mycontactform.com");
		cd.findElementByCssSelector("input[type$='xt']").sendKeys("bye");
		
		//7.tagname & substring of attribute
		cd.get("http://mycontactform.com");
		cd.findElementByCssSelector("input[type*='ex']").sendKeys("hi");

		//copy-copy selector(shortcut)
		cd.get("http://mycontactform.com");
		cd.findElementByCssSelector("#user").sendKeys("hello");
		
		cd.quit();
	}

}
