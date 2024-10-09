package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class select {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Drag Position")).click();
	WebElement mbtarg = driver.findElement(By.xpath("//div[@class=\"drop-column  min-h-[200px] bg-slate-100\"]"));
	WebElement mbsrc = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	WebElement mbtarg1 = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
	WebElement mbsrc1 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
	WebElement laptarg1 = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
	WebElement lapsrc = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	WebElement laptar2 = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
	WebElement lapsrc2 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
	Actions a=new Actions(driver);
	a.dragAndDrop(mbsrc, mbtarg).perform();
	a.dragAndDrop(mbsrc1, mbtarg1).perform();
	a.dragAndDrop(lapsrc, laptarg1).perform();
	a.dragAndDrop(lapsrc2, laptarg1).perform();
	
	Thread.sleep(2000);
	}
}