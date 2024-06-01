package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		int numOfiframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Numbers of iframe: " + numOfiframes);
		//driver.switchTo().frame("selenium");
		driver.findElement(By.xpath("//*[@id='genesis-mobile-nav-primary']")).click();

		driver.switchTo().defaultContent();

		WebElement newFrame = driver.findElement(By.xpath("//iframe[@title='selenium_news']"));

		driver.switchTo().frame(newFrame);
		driver.findElement(By.xpath("//*[@type='button'][@class='navbar-toggler']")).click();

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//*[@href=\"http://www.learn-automation.com\"]")).click();

	}

}
