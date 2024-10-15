package WebDri_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnectionAssignment {
	
	public static WebDriver getConnection(String url) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//driver.get("https://www.saucedemo.com/");
	
		return driver;
	}

}
