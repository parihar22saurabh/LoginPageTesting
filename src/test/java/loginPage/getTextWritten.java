package loginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getTextWritten {

	public static void main(String[] args) 
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///D:/test/index.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement NameDisplaying = driver.findElement(By.xpath("//*[@id=\"cont\"]/h1"));
		 String Name = NameDisplaying.getText();
		 System.out.println("Name displying on screen is-  "+"'"+ Name+ "'");
         driver.quit();

	}

}
