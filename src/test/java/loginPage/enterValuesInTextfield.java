package loginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class enterValuesInTextfield {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///D:/test/index.html");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("customer");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.id("checkbox")).click();
	
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		
		driver.quit();

	}

}
