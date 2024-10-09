package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyDuplicate {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ragini/Desktop/multiselect.html");
		 WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		 Select s= new Select(mtrlistbox);
		 List<WebElement> alloptions = s.getOptions();
		 Set<String> hs = new HashSet<>();
		 for(WebElement ele:alloptions)
		 {
			 String text = ele.getText();
			 if(!hs.add(text))
			 {
				 System.out.println(text);
			 }
			 
		 }


	}

}
