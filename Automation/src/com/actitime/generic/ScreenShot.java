package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException
	{
    WebDriver driver = new ChromeDriver();
    driver.get("https://google.com/");
    TakesScreenshot t = (TakesScreenshot)driver;
    Thread.sleep(2000);
    File src =t.getScreenshotAs(OutputType.FILE);
    Thread.sleep(2000);
    File dest = new File("./Screenshots/ss.png");
    Thread.sleep(2000);
    FileUtils.copyFile(src, dest);
    driver.quit();
    
  
	

}
}