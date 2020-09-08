
package com.calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F://Basavaraj//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String month="November";
		String dateee="20";
		driver.get("https://www.path2usa.com/travel-companions/");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']")).getText().contains(month))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();;			
		}
		
		List<WebElement> days = driver.findElements(By.className("day"));
		
		for(int i=0;i<days.size();i++)
		{
			String date = days.get(i).getText();
			System.out.println(date);
			
			if(date.equalsIgnoreCase(date))
			{
				days.get(i).click();
				break;
				
			}
			}
			
			
		}
	
	
		
	}


