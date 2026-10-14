package testngattributes;

import org.testng.annotations.Test;

public class attributeswithprintstatement {
	
	
	//priority,description & groups attributes
	@Test(priority=1,description="first",groups="one")
	public void testcase1() {
		System.out.println("TESTCASE 1");
		}
	
	@Test(priority=2,description="second",groups="two")
	public void testcase2() {
		System.out.println("TESTCASE 2");
		}
	
	@Test(priority=3,description="third",groups="three")
	public void testcase3() {
		System.out.println("TESTCASE 3");
		}
	
	
	//invocation count attribute
	@Test(priority=4,description="invocationcount attribute",invocationCount=2)//loop
	public void testcase4() {
		System.out.println("TESTCASE 4");
		}
	
	
	//disabling attribute
	@Test(priority=5,description="disabling attribute",enabled=false)//disabling testcase
	public void testcase5() {
		System.out.println("TESTCASE 5");
		}
	
	
	//timeout attribute
	@Test(priority=6,description="timeout attribute",timeOut=2000)//executes testcase within the time limit, if not throws error
	public void testcase6() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("TESTCASE 6");
		}
	
	
	//depends on methods attribute
	@Test(priority=7,timeOut=3000)//m2 depends on m1
	public void m1() throws InterruptedException 
	{
		Thread.sleep(6000);//throws error so m2 is skipped
		System.out.println("Username & Password");
	}
	@Test(priority=8,dependsOnMethods="m1")
	public void m2()
	{
		System.out.println("Login");
	}
	
	
	//depends on groups attribute
	@Test(priority=9,timeOut=3000,groups="Website")//g3 depends on g1 & g2 who belong to same group
	public void g1() throws InterruptedException 
	{
		Thread.sleep(6000);//throws error in a group so g3 is skipped
		System.out.println("Username");
	}
	@Test(priority=10,groups="Website")
	public void g2()
	{
		System.out.println("Password");
	}
	@Test(priority=11,dependsOnGroups="Website")
	public void g3()
	{
		System.out.println("Login");
	}


}
