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
		// Get the current directory where the Java program is running
		String projectPath = System.getProperty("user.dir");
		
		// Specify the relative path to your HTML file
		String htmlFilePath = projectPath + "/frontend/index.html";
		
		driver.get("file:///" + htmlFilePath);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement NameDisplaying = driver.findElement(By.xpath("//*[@id=\"cont\"]/h1"));
		 String Name = NameDisplaying.getText();
		 System.out.println("Name displying on screen is-  "+"'"+ Name+ "'");
         driver.quit();

	}

}
