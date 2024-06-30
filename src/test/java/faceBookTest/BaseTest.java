package faceBookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import facebookPages.LoginPage;

public class BaseTest {

	public WebDriver driver;
	public LoginPage logpg;
	public ScreenShotTest st;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		logpg = new LoginPage(driver);
		 st  = new ScreenShotTest(driver);
		
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
