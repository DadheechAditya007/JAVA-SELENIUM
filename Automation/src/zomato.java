import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		driver.findElement(By.linkText("Blinkit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text( ),'Detect my location')]")).click();
		Thread.sleep(4000);
		List<WebElement> AddPRoduct=driver.findElements(By.xpath("//div[contains(text( ),'ADD')]"));
		
		 for(int i=0; i<3;i++) {
		
		WebElement button=AddPRoduct.get(i);
		button.click();
	}
          driver.findElement(By.xpath("/html/body/div/div/div/div[1]/header/div[3]/div[2]/div")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//div[@class='AddToCart___StyledDiv-sc-17ig0e3-10 chmKKp'][4]")).click();
          Thread.sleep(2000);
}}
