import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vistara {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text( )=' Origin']"));
		driver.findElement(By.xpath("//div[@id=\"departsfrom-div\"]/input[1]")).sendKeys("PUNA",Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("MUMBAI",Keys.ENTER);
		Thread.sleep(3000);
		//find the departure date//
		driver.findElement(By.xpath("//*[@id=\"departCalendar\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]/div/table/tbody/tr[1]/td[6]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@id=\"return-radio\"]")).click();
		driver.findElement(By.xpath("//a[@data-date='9']")).click();
		
		
	}

}
