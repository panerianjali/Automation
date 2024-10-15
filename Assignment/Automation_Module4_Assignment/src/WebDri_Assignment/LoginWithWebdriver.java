package WebDri_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginWithWebdriver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ConnectionAssignment.getConnection("https://www.facebook.com/");
		
		WebElement imgFb = driver.findElement(By.id("email"));
		imgFb.sendKeys("anjali@facebook.com");
		Thread.sleep(1000);


		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("anjali123");
		Thread.sleep(1000);
		
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"u_0_5_JD\"]"));
		btnLogin.click();
		Thread.sleep(1000);

	}
	
	
}
