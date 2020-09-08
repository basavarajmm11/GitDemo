package com.TakeSS;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot 
{
	public static void main(String[] args) throws IOException
	{
		
				System.setProperty("webdriver.chrome.driver", "F://Basavaraj//driver//chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
				driver.get("https://www.path2usa.com/travel-companions/");
				
				TakesScreenshot ts=(TakesScreenshot)driver;
				File src=ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("F://Basavaraj//SS//ss1.png");
				FileUtils.copyFile(src, dest);
				
				
				
				
				
				
	}

}
