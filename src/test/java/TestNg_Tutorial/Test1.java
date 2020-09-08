package TestNg_Tutorial;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 
{
	@BeforeTest
	public void Beforetest() {
		System.out.println("first execute test");
		System.out.println("first Git Demo test");
	}
	
	@AfterTest
	public void Aftertest() {
		System.out.println("After execute test");
		System.out.println("first Git Demo test2");
	}
	@BeforeClass
	public void beforecls() {
		System.out.println("before execute class");
		System.out.println("first Git Demo test3");
	}
	
	@AfterClass
	public void afterls() {
		System.out.println("after execute class");
	}
	
	@BeforeMethod
	public void beforemthd() {
		System.out.println("before execute hello and bye mthds");
	}
	
	@AfterMethod
	public void aftermthd() {
		System.out.println("after execute hello and bye mthds");
	}
	
	@Test(groups={"Smoke"})
	public void demo() {
		System.out.println("Hello");
	}
	
	@Test(dependsOnMethods={"demo"})
	public void secondMethod() {
		System.out.println("Bye");
		Assert.assertTrue(false);
	}
	
	@Test(enabled=false)
	public void zMethod() {
		System.out.println("zzzz");
	}
	
	

	
}
