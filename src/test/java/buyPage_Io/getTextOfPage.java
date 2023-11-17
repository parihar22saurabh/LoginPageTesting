package buyPage_Io;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class getTextOfPage 
{

	
	
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new EdgeDriver();
			driver.get("file:///D:/Cart_page_IO/index.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			WebElement nameOnFrontPagElement = driver.findElement(By.xpath("/html/body/div/div[1]/h1"));
			
			String name = nameOnFrontPagElement.getText();
			
			System.out.println("name of the product is = " + name );
			driver.quit();

	}

}
