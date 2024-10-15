package WebDri_Assignment;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SelectRadioOnebyOne {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = ConnectionAssignment.getConnection("https://demo.guru99.com/test/radio.html");
		
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"vfb-7-1\"]"));
		radio.click();
		
		Thread.sleep(1000);
		
		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"vfb-7-2\"]"));
		radio2.click();
		Thread.sleep(1000);
		
		WebElement radio3 =driver.findElement(By.xpath("//*[@id=\"vfb-7-3\"]"));
		radio3.click();
		Thread.sleep(1000);
		
		//var radioButtons = document.getElementsByName("q"+i);

//		List RadioButton = driver.findElements(By.name("webform"));
//		
//		int size = RadioButton.size();
//		for(int i=0; i< size; i++)
//		{
//			String val = ((WebElement) RadioButton.get(i)).getAttribute("value");
//		}

		
		
		
		
	}
	
	

}
