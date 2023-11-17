package buyPage_Io;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getSizeOfContainer {

	public static void main(String[] args) 
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement size= driver.findElement(By.xpath("/html/body/div[5]"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getHeight();
		System.out.println("height of product 1 window is "+ height);
		System.out.println("height of product 1 window is "+ width);
		driver.quit();

	}

}
