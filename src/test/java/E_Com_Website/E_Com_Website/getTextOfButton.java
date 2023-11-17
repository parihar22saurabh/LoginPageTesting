package E_Com_Website.E_Com_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getTextOfButton
	{
		public static void main(String[] args) 
		{
			WebDriver driver= new FirefoxDriver();
			driver.get("file:///D:/learning/login.html");
			 WebElement NameDisplaying = driver.findElement(By.className("row text h1"));
			 String Name = NameDisplaying.getText();
			 System.out.println("Name displying on screen is "+ Name);
	driver.quit();

	};
	//not working

}
