package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException {
		

	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");

	    // Take a screenshot of the entire page
	    TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
	    File screenshot = screenshotDriver.getScreenshotAs(OutputType.FILE);

	    // Define the target file location with descriptive variable names
	    String screenshotLocation = System.getProperty("/DebMavenProjectS/target");
	    File targetFile = new File(screenshotLocation + "Screenshot2.jpeg");

	    // Copy the screenshot to the target location
	    FileUtils.copyFile(screenshot, targetFile);

	    driver.close();
	  }
	

}
