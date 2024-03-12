package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {
	public static void main(String[]args) throws InterruptedException 
	{ WebDriver driver= new ChromeDriver();
	  Dimension Dimension= new Dimension(1000,2000);
	  driver.manage().window().setSize(Dimension);
	  driver.get("http://www.youtube.com");
		Thread.sleep(200);
	  driver.navigate().to("http://www.rooter.gg");
	  Thread.sleep(200);
	  driver.navigate().back();
	  Thread.sleep(200);
	  driver.navigate().forward();
	  
	}

}
