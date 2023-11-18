package E_Com_Website.E_Com_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login_Page2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new FirefoxDriver();
		
		String projectPath = System.getProperty("user.dir");
		String htmlFile = projectPath + "/learning_bootstrap/login.html";
		//driver.get("D:/learning/login.html");
		driver.get("file:///" + htmlFile ) ;
		driver.findElement(By.id("enterLoginEmail")).sendKeys("sp@gmail.com");
		driver.findElement(By.name("loginPassword")).sendKeys("pasword@123");
		driver.manage().window().maximize();
		driver.findElement(By.className("btn btn-primary")).click();
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    //line 20 is not working
		Thread.sleep(2000);
		driver.quit();

	}

}
