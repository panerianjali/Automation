package WebDri_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {
	public static void main(String[] args) {
		
		WebDriver driver =  ConnectionAssignment.getConnection("https://only-testing-blog.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement dropdown = driver.findElement(By.id("Carlist"));
		dropdown.click();
		
		Select car = new Select(dropdown);
		car.selectByIndex(2);
		js.executeScript("arguments[0]", args);
		
	}

}
