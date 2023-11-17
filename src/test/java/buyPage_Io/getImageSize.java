package buyPage_Io;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getImageSize {

	public static void main(String[] args) 
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///D:/Cart_page_IO/index.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement size= driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/img"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getHeight();
		System.out.println("height of product 1 window is "+ height);
		System.out.println("height of product 1 window is "+ width);
		driver.quit();

	}

}
