import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class ScreenShot {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		/*
		 * File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * 
		 * String path = "D://Eclipse"; FileUtils.copyFile(scrFile, path);
		 */
		
		TakesScreenshot source = ((TakesScreenshot)driver);
		
		File SourceFile = source.getScreenshotAs(OutputType.FILE);
		
		String path = "D://Eclipse";
		
		FileUtils.copyFile(SourceFile, path);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
