package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CarInsu {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement list = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(list);
		Thread.sleep(2000);
		s.selectByIndex(0);
		WebElement list1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1=new Select(list1);
		//Thread.sleep(2000);
		s1.selectByValue("1993");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='29']")).click();
	    driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	    driver.findElement(By.id("renew_policy_submit")).click();
	   
		
		
	}

	}


