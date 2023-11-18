package buyPage_Io;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackToBuypage {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://127.0.0.1:5500/index.html");
		
		String projectPath = System.getProperty("user.dir");
		String filePath = projectPath + "/Cart_page_IO/index.html";
		driver.get("file:///" + filePath);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		driver.findElement(By.id("buy-button")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"buy-button\"]")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
