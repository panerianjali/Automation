package WebDri_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegesterGmail {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ConnectionAssignment.getConnection("https://accounts.google.com/v3/signin/identifier?checkedDomains=youtube&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ddm=0&emr=1&flowName=GlifWebSignIn&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&hl=en&ifkv=AdF4I76YH1BHnJpAbCobDDV2LYrWif-jcJv0PFrZjcBJ0e78VuoKrdZP6uOQJuW7wCdwM5_6qJg3fg&osid=1&pstMsg=1&service=mail&flowEntry=AccountChooser");
		
		WebElement createaccount = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span"));
		createaccount.click();
		
		Thread.sleep(2000);
		
		WebElement fPersonalUse = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]"));
		fPersonalUse.click();
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Anjali1");
		
		Thread.sleep(1000);
		
		WebElement lastname = driver.findElement(By.name("lastName"));
		lastname.sendKeys("Trivedi");
		
		
		
		WebElement btnNext = driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span"));
		btnNext.click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("month")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("month"));
	      dropdown.findElement(By.xpath("//option[. = 'March']")).click();
	    }
	    
	    driver.findElement(By.id("day")).click();
	    driver.findElement(By.id("day")).sendKeys("12");
	    driver.findElement(By.id("year")).sendKeys("2012");
	    driver.findElement(By.id("gender")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("gender"));
	      dropdown.findElement(By.xpath("//option[. = 'Female']")).click();
	    }
	    
	    WebElement btnNext1 = driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span"));
	    btnNext1.click();
	    
	    Thread.sleep(1000);
	    
	    WebElement uname = driver.findElement(By.name("Username"));
	    uname.sendKeys("anjalitrivedi614");
	    Thread.sleep(1000);
	    
	    WebElement btnNext2 = driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span"));
	    btnNext2.click();
	    Thread.sleep(1000);
	    
//	    driver.findElement(By.cssSelector(".VfPpkd-vQzf8d")).click();
	    //WebElement emailSelector = driver.findElement(By.id("selectionc2"));
    //emailSelector.click();
	    
	   // driver.findElement(By.id("selectionc2")).click();
	    
		//Thread.sleep(1000);
		
		driver.findElement(By.name("Passwd")).sendKeys("anjali@2715");
		Thread.sleep(1000);
		
		driver.findElement(By.name("PasswdAgain")).sendKeys("anjali@2715");
		Thread.sleep(1000);
		
		WebElement showPass = driver.findElement(By.id("selectionc0"));
		showPass.click();
		Thread.sleep(1000);
		
		WebElement btnNext3 = driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span"));
		btnNext3.click();
		Thread.sleep(1000);
		
		WebElement mobileno = driver.findElement(By.id("phoneNumberId"));
		mobileno.sendKeys("7016962719");
		Thread.sleep(1000);
		
		WebElement btnNext4 = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[1]/div[1]/div[2]/div/div/div[3]/div/div/div/div/button/span"));
		btnNext4.click();
		
		WebElement otp=driver.findElement(By.name("code"));
		otp.sendKeys("115649");
		
		//driver.close();
		
		
	}

}
