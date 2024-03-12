package com.selenium;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Runtimepolymorphism {
	 static WebDriver driver;
	public static void main(String[]args)
	{
		while(true) {
			   Scanner sc=new Scanner (System.in);
			  System.out.println("==enter the browser==");
			  String browser=sc.next();
			  if(browser.equals("edge")); {
				  driver = new EdgeDriver();
				  driver.get("http://www.linkdin.com");
				  
		}  if(browser.equals("chrome")){
			driver = new ChromeDriver();
			driver.get("http://www.rooter.gg");
			break;
		}else {
			System.out.println("invalid Browser");
		}
			  
	} 
	}
}	


