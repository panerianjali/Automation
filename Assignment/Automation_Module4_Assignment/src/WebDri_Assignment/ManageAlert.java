package WebDri_Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageAlert {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ConnectionAssignment.getConnection("https://testpages.eviltester.com/styled/index.html");
		
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement altmsg  = driver.findElement(By.id("alerttest"));
		altmsg.click();
		Thread.sleep(2000);
		
		
		
		WebElement showAlerts = driver.findElement(By.id("alertexamples"));
		showAlerts.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
	

		Thread.sleep(2000);
		
		
		WebElement confirm = driver.findElement(By.id("confirmexample"));
		confirm.click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert.accept();
		Thread.sleep(2000);
		
		

		
		
		
		
	}
	
	


}
