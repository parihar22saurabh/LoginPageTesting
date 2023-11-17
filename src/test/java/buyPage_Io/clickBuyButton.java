package buyPage_Io;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clickBuyButton {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Cart_page_IO/index.html");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.findElement(By.id("buy-button")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
