package com.synchronizationn;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_wait {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F://Basavaraj//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		String[] itemsNeeded = { "Cucumber", "Beetroot", "Cauliflower" }; // Array
		
		
		addItems(driver,itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//*[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//*[@class='promoBtn']")).click();
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='promoInfo']")));
	System.out.println(driver.findElement(By.xpath("//*[@class='promoInfo']")).getText());
		
		
		
		
		}
	
	public static void addItems(WebDriver driver,	String[] itemsNeeded) throws InterruptedException
	{
		int j = 0;
		List<WebElement> prdcts = driver.findElements(By.cssSelector("h4.product-name"));

		

		for (int i = 0; i < prdcts.size(); i++)

		{
			String[] name = prdcts.get(i).getText().split("-");
			String realName = name[0].trim();
			System.out.println(realName);
		
			// converting array to array list to reduce memory at run time
			List<String> list1 = Arrays.asList(itemsNeeded);
			System.out.println(list1);
			
			if (list1.contains(realName))
			{

				// click on add to cart
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				
				if (j ==itemsNeeded.length)
				{
					break;
				}
			}
		}

	}
}