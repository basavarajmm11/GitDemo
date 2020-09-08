package TestNg_Tutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 
{
	
	@Test
	public void webLoginHomeLoan() 
	{
		System.out.println("webLoginHomeLoan");
		
	}
	@Parameters({ "URL","Apikey" })
	@Test
	public void mobileLoginHomeLoan(String urlname,String key) 
	{
		System.out.println("mobileLoginHomeLoan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(groups={"Smoke"})
	public void loginAPIHomeLoan() 
	{
		System.out.println("loginAPIHomeLoan");
	}

}
