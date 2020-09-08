package com.scope;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scopes
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F://Basavaraj//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int i;
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		
		//No of links in page
		System.out.println("using tagname=" +links.size());
		System.out.println("Using xpath=" +driver.findElements(By.xpath("//a")).size());
		
		//No of images in page
		System.out.println("using tagname=" +images.size());
		System.out.println("Using xpath=" +driver.findElements(By.xpath("//img")).size());
		
		
		//No of linka in footer
		WebElement footer=driver.findElement(By.xpath("//div[@id='gf-BIG']"));	
		System.out.println("Footer links" +footer.findElements(By.tagName("a")).size());
		
		//No of links in one coloumn
		
		WebElement coloumnDriver=footer.findElement(By.xpath("//div[@id='gf-BIG']//child::td[1]"));
		
		List<WebElement> column = coloumnDriver.findElements(By.tagName("a"));
		System.out.println("Column links=" +column.size());
		
		//clicking on the links
		for(i=1;i<column.size();i++)
		{
			String linkclick = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumnDriver.findElements(By.tagName("a")).get(i).sendKeys(linkclick);
			Thread.sleep(5000L);
		}
		
		
		Set<String> abc=driver.getWindowHandles();
		System.out.println(abc);
		Iterator<String> it = abc.iterator();
	      
		//iterating
	      while(it.hasNext())
	      {
	    	   Thread.sleep(3000);
	    	 driver.switchTo().window(it.next());
	    	  System.out.println(driver.getTitle());
	    	  
	      }
			
		
		
		
		
		
	}

}
