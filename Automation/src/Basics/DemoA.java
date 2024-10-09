package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoA {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.xpath("//div[@class='addNewContainer']")).click();
		driver.findElement(By.xpath("//div[contains(text() , ' New Customer')]")).click();
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("Lisha");
		driver.findElement(By.xpath("//button[text()=\"-- Select an active customer to import information from --\"]")).click();
		
		
		
		
		
	

	}

}
