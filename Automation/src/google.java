import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("chandler Bing",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//canvas[@class=\"lNPNe\"]")).click();
	}

}
