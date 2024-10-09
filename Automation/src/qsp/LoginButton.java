package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		boolean loginbutton = driver.findElement(By.id("loginbutton")).isEnabled();
		if(loginbutton==true)
			System.out.println("login button is enabled");
		else
			System.out.println("login button is disabled");
		

	}

}
