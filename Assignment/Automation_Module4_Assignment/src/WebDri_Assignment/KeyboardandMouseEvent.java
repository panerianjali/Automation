package WebDri_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardandMouseEvent {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ConnectionAssignment.getConnection("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement btnHover = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		Actions action = new Actions(driver);
		action.moveToElement(btnHover).build().perform();
		
		Thread.sleep(1000);
		
	}

}
