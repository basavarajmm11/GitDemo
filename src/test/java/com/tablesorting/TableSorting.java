package com.tablesorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSorting {

	public static void main(String[] args) 

		{
			System.setProperty("webdriver.chrome.driver", "F://Basavaraj//driver//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
			driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();//descending order one click
			driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();//assen on double click
			
			//Retrieve all values of fruits name colomn
			List<WebElement> first_AL = driver.findElements(By.xpath("//tr//td[2]"));
			

			
			//Raw Array list
			ArrayList<String> originalList=new ArrayList<String>();
			
			for(int i=0;i<first_AL.size();i++)
			{
				//System.out.println(first_AL.get(i).getText());
				
				originalList.add(first_AL.get(i).getText());
				
			}
			
			
			//copy list
			ArrayList<String> CopiedList=new ArrayList<String>();
	
			for(int i=0;i<originalList.size();i++)
			{
				//System.out.println(first_AL.get(i).getText());
				
				CopiedList.add(originalList.get(i));
				
			}
			
			
		Collections.sort(CopiedList);
		Collections.reverse(CopiedList);
		
		System.out.println("*******************Copied and sorted list*********");
		for(String s: CopiedList)
		{
			System.out.println(s);
		}
		
		System.out.println("*******************original list*********");
		
		for(String s1: originalList)
		{
			System.out.println(s1);
		}
		
		Assert.assertTrue(originalList.equals(CopiedList));
			
			
			
	}

}
