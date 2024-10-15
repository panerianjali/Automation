package WebDri_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandleAlert {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ConnectionAssignment.getConnection("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement custId = driver.findElement(By.name("cusid"));
		custId.sendKeys("123");
		
		Thread.sleep(1000);
		
		WebElement btnSubmit = driver.findElement(By.name("submit"));
		btnSubmit.click();
		Thread.sleep(1000);
		
		
		Actions builder = new Actions(driver);
		driver.switchTo().alert().accept();
		
	

		//builder.moveToElement(Home).build().perform();
		Thread.sleep(1000); 
		
		driver.switchTo().alert().accept();
		
		
		
	}

}
