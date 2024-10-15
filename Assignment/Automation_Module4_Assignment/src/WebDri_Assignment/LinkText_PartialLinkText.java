package WebDri_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkText_PartialLinkText {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = ConnectionAssignment.getConnection("https://phptravels.com/demo");
		
		WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
		
		Thread.sleep(2000);
		
		
		
		
		

	}
	
		

	

}
