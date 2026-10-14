package FrameWork_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	//Declaring global Variables
	private WebDriver driver;


	 public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

// driver.findElement(By.id("user")
	 
	@FindBy(id="user")
	WebElement userName;
	
	@FindBy(xpath="//*[@id='pass']")
	WebElement passWord;
	
	@FindBy(css="#right_col_top > form > div > input")
	WebElement loginButton;
	
	// public returntypename()
	// {return }
	
	
	public WebElement userName(){
		return userName;
		
	}
	
	public WebElement passWord(){
		return passWord;
		
	}
	
	
	public WebElement loginButton(){
		return loginButton;
		
	}
	// public nextpagename currentpagemethod()
	
	public NewWizard loginMCF(){
		
		userName().sendKeys("Dhivyakarthi123");
		passWord().sendKeys("12345");
		loginButton().click();
		return PageFactory.initElements(driver,NewWizard.class);
		
	}
	
	

	
}
