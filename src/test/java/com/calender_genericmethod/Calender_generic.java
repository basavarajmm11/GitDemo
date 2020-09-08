package com.calender_genericmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_generic {

	public static void main(String[] args)
	{
		
				System.setProperty("webdriver.chrome.driver", "F://Basavaraj//driver//chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
				driver.get("https://www.path2usa.com/travel-companions/");

	}

}
