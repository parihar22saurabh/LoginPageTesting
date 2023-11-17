package buyPage_Io;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class getTextOfButton 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new EdgeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement nameOnButtonElement = driver.findElement(By.id("buy-button"));
		
		String name = nameOnButtonElement.getText();
		
		System.out.println("name on the button is = " + name );
		driver.quit();

	}

}
