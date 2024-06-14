package multipleClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotExample {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	   driver.get("https://spreadsheetpage.com/calendar/"); 
	   
	   driver.findElement(By.xpath("//*[@id=\"content-main\"]/p[10]/a[2]")).click();
	   
	   Robot robot = new Robot();
	   
	   robot.keyPress(KeyEvent.VK_DOWN);
	   
	   robot.keyPress(KeyEvent.VK_TAB);
	   robot.keyPress(KeyEvent.VK_TAB);
	   robot.keyPress(KeyEvent.VK_TAB);
	   
	   robot.keyPress(KeyEvent.VK_ENTER);
	   
	}

}
