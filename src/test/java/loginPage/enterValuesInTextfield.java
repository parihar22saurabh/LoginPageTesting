package loginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class enterValuesInTextfield {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new FirefoxDriver();
		
		// Get the current directory where the Java program is running
		String projectPath = System.getProperty("user.dir");
		
		// Specify the relative path to your HTML file
		String htmlFilePath = projectPath + "/frontend/index.html";
		
		driver.get("file:///" + htmlFilePath);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("customer");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.id("checkbox")).click();
	
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		
		driver.quit();

	}

}
