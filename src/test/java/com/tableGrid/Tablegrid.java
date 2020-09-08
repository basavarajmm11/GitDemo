package com.tableGrid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablegrid 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F://Basavaraj//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		int sum=0;
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29074/eng-vs-pak-1st-test-pakistan-tour-of-england-2020");

		
		WebElement table=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		int tableSize=table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']")).size();
		System.out.println(tableSize);
		
	int counts=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	
	System.out.println(counts);
	
	for(int i=0;i<counts-2;i++)
	{
		//System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
	    String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	    int runs=Integer.parseInt(value);
	    sum=sum+runs;
	}
	System.out.println(sum);
	//System.out.println(table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
	String extrasValue=table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	int extraNumber=Integer.parseInt(extrasValue);
	
	int Totalgot=sum+extraNumber;
	System.out.println(Totalgot);
	
	String Actualtotal=table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	System.out.println(Actualtotal);
	
	int actualTotalValue=Integer.parseInt(Actualtotal);
	
	if(actualTotalValue==Totalgot)
	{
		System.out.println("matched");
	}
	else
	{
		System.out.println("Not matched");
	}
	
	}
	

}
