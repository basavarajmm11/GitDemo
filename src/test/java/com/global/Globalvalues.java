package com.global;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Globalvalues 
{
	public static void main(String[] args) throws IOException 
	{
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("F:\\Basavaraj\\New folder\\Practice\\src\\test\\java\\Data.properties");
	    prop.load(fis);
	    
	    System.out.println(prop.getProperty("browser"));
	    
	    System.out.println(prop.getProperty("url"));
	    
	    //writing back to data file
	    prop.setProperty("browser", "firefox"); //setting up new value
	    System.out.println(prop.getProperty("browser"));
	    FileOutputStream fos=new FileOutputStream("F:\\Basavaraj\\New folder\\Practice\\src\\test\\java\\Data.properties");
	    prop.store(fos, "com");
	}


}
