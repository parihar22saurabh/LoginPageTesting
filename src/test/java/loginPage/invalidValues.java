package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class invalidValues 
{

	 
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver= new FirefoxDriver();
			// Get the current directory where the Java program is running
			String projectPath = System.getProperty("user.dir");
			System.out.println(projectPath);
			// Specify the relative path to your HTML file
			String htmlFilePath = projectPath + "/frontend/index.html";
			System.out.println(htmlFilePath);
			driver.get("file:///" + htmlFilePath);
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"username\"]"))
			.sendKeys("saurabh");
			driver.findElement(By.name("password")).sendKeys("123@");
			driver.findElement(By.id("checkbox")).click();
		
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			
			
			driver.quit();

	}

}
