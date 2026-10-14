package navigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
	    cd.get("http://www.google.com");
	    cd.manage().window().maximize();
	    
	    //open mycontactform.com in new tab   
	    cd.executeScript("window.open('https://www.mycontactform.com','_blank');");//_blank is used to open the link in a new tab. If this is not used the mycontactform opens in the google tab
	    //get the control of first tab: driver.getwindowhandle()=> String => parent
	    //get the control of both tabs: driver.getwindowhandles() s1={google, mycontactform.com} 
	    String parent=cd.getWindowHandle();// control will be in the parent window //google
	    // collecting all the handle
	    Set<String> s = cd.getWindowHandles();
	    // 2(both the tabs = collected)
	    
	    //step3: iteration
	    // iterate through the elements present in set
	    Iterator<String> i = s.iterator(); // hasNext() , next()
	    
	    while(i.hasNext())// whether any content is there 
	    {
	      String window=i.next();
	      if(!parent.equals(window))
	      { 
	    	  // control is moved to child window 
	    	  cd.switchTo().window(window);
	          System.out.println(cd.getTitle());
	          cd.findElementByLinkText("Help").click();
	          Thread.sleep(1000);
	          cd.close();
	          } 
	      }
	  
	    cd.switchTo().window(parent);//google 
	    System.out.println(cd.getTitle());// google
	    cd.findElementByLinkText("Images").click();
	    Thread.sleep(1000);
	    cd.quit();
	    }
}
	  /*
	  * parent=google.com 
	  * s1={google.com, mycontactform.com}
	  * first iteration: I1 points to first element in set ., google.com
	  * while I1.hasnext()-> checking the content
	  * I1.next reads google.com and store in child_window
	  * child_window=google.com
	  * if parent!=child_window
	  * google!=google
	  *         
	  * second iteration: I1 points to second element in set, mycontactform.com
	  * while I1.hasnext-> checking the content
	  * I1.next reads mycontactform.com and store in child_window
	  * child_window=mycontactform.com
	  * if parent!=child_window
	  * google!=mycontactform.com
	  * switching control to child_Window, mycontactform.com
	  * fetching title
	  * 4 seconds 
	  * clicking on Help linktext
	  * 4 seconds
	  * closing the tab mycontactform.com
	  * third iteration: no content terminate 
	  *             
	  * switching control back to google
	  * title
	  * 5 seconds
	  * Images=> click
	  * 5 seconds
	  * quit
	  * */
	    
	
	//facebook : title
	// google.com: Privacy 
	// facebook: cookies
	
	// frst: mycintactform.com  login
	// second: google           selenium search
	

