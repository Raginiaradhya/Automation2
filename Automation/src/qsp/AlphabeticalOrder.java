package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ragini/Desktop/multiselect.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> alloptions = s.getOptions();
		TreeSet<String> ts=new TreeSet<>();
		for(int i=0;i<alloptions.size();i++)
		{
			String text = alloptions.get(i).getText();
			ts.add(text);
		}
		
        for(String option :ts)
        {
        	System.out.println(option);
        }
driver.quit();
	}

}
