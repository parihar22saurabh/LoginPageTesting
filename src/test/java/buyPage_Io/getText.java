package buyPage_Io;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getText 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new EdgeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement NameOfProduct = driver.findElement(By.xpath("/html/body/div[1]/div[1]/h2"));
		WebElement pricOfProduct = driver.findElement(By.xpath("/html/body/div[1]/div[2]"));
		String name = NameOfProduct.getText();
		String price = pricOfProduct.getText();
		System.out.println("name of the product is = " + name +
				", Price of the Procuct is = " + price);
		driver.quit();
	}

}
