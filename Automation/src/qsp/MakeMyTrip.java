package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(2000);
		driver.findElement((By.xpath("//p[text()='Bengaluru International Airport']"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='To']")).click();
		Thread.sleep(2000);
		driver.findElement((By.xpath("//p[text()='Goa - Dabolim Airport, India']"))).click();
		Thread.sleep(2000);
		
		
	}

}
