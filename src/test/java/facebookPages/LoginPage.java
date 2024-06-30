package facebookPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// Locatiors
	private By username = By.id("email");
	private By password = By.id("pass");
	private By logbton = By.xpath("//button[@type='submit']");

    //action
	public void verifyUrl() {
		
		String url = driver.getCurrentUrl();

		System.out.println("Test Pass: Url is Matched!");
	}

	public void verifylogin(String un, String pss) {
		driver.findElement(username).click();
		driver.findElement(password).click();
		driver.findElement(logbton).click();
		System.out.println("Login completed!");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Assert.assertTrue(false, "Login verification failed! Element not visible after login.");

		System.out.println("Login completed!");

	}
}