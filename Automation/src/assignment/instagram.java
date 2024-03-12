package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
 public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.instagram.com/accounts/login/");
	 
	 Thread.sleep(3000);
	 
	 driver.findElement(By.id("username")).sendKeys("adityadadheech3@");
	 
	 Thread.sleep(3000);
	 
	 driver.findElement(By.id("password")).sendKeys("Aditya3@");
	 
	 Thread.sleep(3000);
	 
	  driver.findElement(By.className("_acap")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("/accounts/password/reset/")).click();
	  Thread.sleep(3000);
	 

	 
	 
}
}
