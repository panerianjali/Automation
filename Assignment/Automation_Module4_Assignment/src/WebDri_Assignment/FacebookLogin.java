package WebDri_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class FacebookLogin {
	public static WebDriver getConnection(String url) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		
		
		WebElement username=driver.findElement(By.id("user_email_Login"));
		username.sendKeys("abc@gmail.com");
		WebElement password=driver.findElement(By.id("user_password"));
		password.sendKeys("your_password");
		WebElement login=driver.findElement(By.name("commit"));
		login.click();
		//String actualUrl="https://live.browserstack.com/dashboard";
		//String expectedUrl= driver.getCurrentUrl();
		//Assert.assertEquals(expectedUrl,actualUrl);
	
		return driver;
	}
}
