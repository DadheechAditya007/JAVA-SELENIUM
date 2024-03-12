package com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	
	public static void main(String[] args) {
		//to launch the browser
	ChromeDriver driver = new ChromeDriver();
	   
	   //to maximize the browser
	driver.manage().window().maximize();
	
	 //to get the url
	driver.get("https://www.youtube.com/");
	String actualurl=driver.getCurrentUrl();
	String expectedurl="https://www.youtube.com/";
	if(actualurl.equals(expectedurl)) {
		System.out.println("url is Matched");
	}else 
		{System.out.println("url is wrong");
	}
		
	}
	
	

}
