package buyPage_Io;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Product2Link {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///D:/Cart_page_IO/index.html");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.findElement(By.id("Link_amazon")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.id("Link_amazon")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		//Thread.sleep(2000);
		//driver.navigate().back();
		//driver.findElement(By.id("nav-cart-count")).click();		
		//Thread.sleep(2000);
		//driver.navigate().back();
		//Thread.sleep(1000);
		driver.quit();

	}

}
