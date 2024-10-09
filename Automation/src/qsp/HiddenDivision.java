package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section [text()='Hidden division']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("gini");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='email'])")).sendKeys("raginirock94@gmail.com");
		Thread.sleep(2000);
		WebElement productlist = driver.findElement(By.xpath("//select[@class='w-[97%] m-2 px-4 h-10 border-2 border-stone-600 rounded-md']"));
		Thread.sleep(2000);
		Select s=new Select(productlist);
		s.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath(("//textarea"))).sendKeys("Hidden Division popup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.quit();
		
		
		
		

	}

}
