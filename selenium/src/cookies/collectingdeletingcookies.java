package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class collectingdeletingcookies {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://www.google.com");
		
		//COLLECTING COOKIES:
		Set<Cookie> set=cd.manage().getCookies();
		System.out.println("The number of cookies that are collected:"+set.size());
		
		
		//DELETING COOKIES:
		cd.manage().deleteAllCookies();
		Set<Cookie> del=cd.manage().getCookies();
		System.out.println("The number of cookies after deleting:"+del.size());
		
		cd.quit();
	}
}