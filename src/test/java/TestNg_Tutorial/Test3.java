package TestNg_Tutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 
{
	
	@BeforeSuite
	public void Beforesuitt() {
		System.out.println("first execute suite");
	}
	@AfterSuite
	public void aftersuitt() {
		System.out.println("Last execute suite");
	}
	@Parameters({ "URL","Apikey" })
	@Test()
	public void webLoginCarLoan(String urlname,String key) 
	{
		System.out.println("webLoginCarLoan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test
	public void mobileLoginCarLoan() 
	{
		System.out.println("mobileLoginCarLoan");
	}
	@Test
	public void mobilesignInLoan() 
	{
		System.out.println("mobileLoginCarLoan");
	}
	@Test
	public void mobilesignOutLoan() 
	{
		System.out.println("mobileLoginCarLoan");
	}
	
	@Test(dependsOnMethods={"webLoginCarLoan"})
	public void loginAPICarLoan() 
	{
		System.out.println("loginAPICarLoan");
	}

}
