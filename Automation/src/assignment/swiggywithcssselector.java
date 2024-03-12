package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggywithcssselector {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.swiggy.com");
		 
		 Thread.sleep(3000);
		 
		WebElement element= driver.findElement(By.cssSelector("img[alt='restaurants curated for biryani']"));
		 
		element.click();
		 Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"container-grid-filter-sort\"]/div/div[1]/div/div[3]/div/div/div")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("[alt$=' Behrouz']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"cid-Recommended\"]/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div/div[1]"));
		 Thread.sleep(3000);
		 driver.findElement(By.tagName("Customize “Royal Paneer Curry Combo (Serves 1)"));
		 Thread.sleep(3000);
		 driver.findElement(By.className("_38xdN")).click();
	}

}
