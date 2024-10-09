package qsp;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintingOnlyDuplicate {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ragini/Desktop/multiselect.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		boolean [] b =new boolean[alloptions.size()];
		for(int i =0;i<alloptions.size();i++) {
			if(b[i]==false) {
				int count1=1;
				for(int j=i+1;j<alloptions.size();j++) {
					if(alloptions.get(i).getText().equals(alloptions.get(j).getText())){
						count1++;
						b[j]=true;
					}
				}
				if(count1>1) {
					System.out.println("The duplicates are:");
					System.out.println(alloptions.get(i).getText());
				}
			}
		}
		driver.quit();
		
		
			
			
			
		

	}

}
