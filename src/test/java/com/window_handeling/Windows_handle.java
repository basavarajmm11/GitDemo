package com.window_handeling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_handle 
{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F://Basavaraj//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/signup");
		System.out.println(driver.getTitle());
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		
		driver.findElement(By.xpath("//a[text()='Terms']")).click();
		WebElement targeted=driver.findElement(By.xpath("//a[text()='Help']"));

		//Actions act=new Actions(driver);
		//act.moveToElement(targeted).contextClick().sendKeys(Keys.ARROW_DOWN).contextClick().build().perform();
		
		Set<String> ids=driver.getWindowHandles();
		System.out.println(ids);
		Iterator<String> itr=ids.iterator();
		String parentid=itr.next(); //In parent window 
		String childid1=itr.next();  //In child window
		//String childid2=itr.next(); 
		
		
		
		driver.switchTo().window(childid1);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		//driver.switchTo().window(childid2);
		//System.out.println(driver.getTitle());
		
	}
	
	
	
	
		
}
