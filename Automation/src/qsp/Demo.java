package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui/");
Thread.sleep(2000);
driver.findElement(By.xpath("//section[contains(text(),'Dropdown')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[contains(text(),'Multi')]")).click();
Thread.sleep(2000);
WebElement multi=driver.findElement(By.id("select-multiple-native"));
Select s = new Select(multi);
Thread.sleep(2000);
s.selectByIndex(0);
Thread.sleep(2000);
s.selectByValue("United Kingdom");
Thread.sleep(2000);
s.selectByVisibleText("Poland");
Thread.sleep(2000);
if(s.isMultiple())
{
	System.out.println("multiselected");
}
	else 
	{
		System.out.println("not multiselected");
	
}
s.deselectAll();
driver.quit();

	}

}
