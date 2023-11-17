package E_Com_Website.E_Com_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getSize {

	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///D:/learning/login.html");
		WebElement EmailTextBox = driver.findElement(By.id("enterLoginEmail"));
		int height = EmailTextBox.getSize().getHeight();
		int width = EmailTextBox.getSize().getWidth();
//		System.out.println("height is =" + height);
//		System.out.println("width is =" + width);
		 
		WebElement PaswordTextBox=driver.findElement(By.id("enterLoginPassword"));
		int height2 = PaswordTextBox.getSize().getHeight();
		int width2 = PaswordTextBox.getSize().getWidth();
		
		
		System.out.println("height of emailtextbox is =" + height);
		System.out.println("width of emailtextbox is =" + width);
		System.out.println("height of pasword text box is= "+ height2);
		System.out.println("width of pasword text box is =" + width2);
		driver.quit();

	}

}
