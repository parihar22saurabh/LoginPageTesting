package buyPage_Io;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getProductInCart {

	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		driver.get("file:///D:/learning/buypage.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		WebElement productName= driver.findElement(By.xpath("/html/body/div/div/div[1]/div/h5"));
//		System.out.println(productName);
		
		driver.get("file:///D:/learning/buypage.html");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div/div/div[1]/div/a")).click();
		
	
	}

}
