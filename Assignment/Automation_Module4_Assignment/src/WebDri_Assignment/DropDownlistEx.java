package WebDri_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownlistEx {
	public static void main(String[] args) {
		
		WebDriver driver = ConnectionAssignment.getConnection("https://demo.guru99.com/test/newtours/register.php");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement dropdown = driver.findElement(By.name("country"));
		dropdown.click();
		
		Select country = new Select(dropdown);
		country.selectByIndex(246);
	}

}
