package com.actionclasss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_demo 
{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F://Basavaraj//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		WebElement target=driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		WebElement srchBox=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(srchBox).click().keyDown(Keys.SHIFT).sendKeys("HElloooh").doubleClick().build().perform();
		act.moveToElement(target).contextClick().build().perform();
				

}
}

