package WebDri_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CountHyperlink {
	public static void main(String[] args) {
		
		WebDriver driver = ConnectionAssignment.getConnection("https://demo.guru99.com/test/web-table-element.php");
		
		int numberofLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("Number of links on webPage" +numberofLinks);
	}

}
