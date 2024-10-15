package WebDri_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLink {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Driver\\\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     String url = "http://demo.guru99.com/test/web-table-element.php";
	     driver.get(url);
	     driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	     //Using tagname with anchor
	     List<WebElement> links = driver.findElements(By.tagName("a"));
	     System.out.println("The number of links is" + links.size());
	     driver.close();
		
	}
	 

}
