package qsp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_Dupli {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Ragini/Desktop/multiselect.html");
			WebElement mtrlistbox = driver.findElement(By.id("mtr"));
			Select s=new Select(mtrlistbox);
			List<WebElement> alloptions = s.getOptions();
			ArrayList al = new ArrayList();
			
		}

}
