package WebDri_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoofFacebook {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ConnectionAssignment.getConnection("https://demoblaze.com/");
		
		WebElement imgFb = driver.findElement(By.xpath("//*[@id=\"nava\"]/img"));
		Thread.sleep(1000);
		imgFb.click();
		
		
	}

}
