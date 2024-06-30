package faceBookTest;

import org.testng.annotations.Test;


public class LoginTest extends BaseTest{

	@Test(priority = 1)
	public void VerifyApplicationUrl() {
		logpg.verifyUrl();
		st.takeScreenshot("/Users/mhasan/Desktop/screenshot/Fb_login_verifyUrl_click.png");
	}
	
	@Test(priority = 3)
	public void VerifyApplicationLogin() {
		logpg.verifylogin("ilasharif2020@gmail.com", "Dhaka@001");
		st.takeScreenshot("/Users/mhasan/Desktop/screenshot/_login_verifyUrl_click.png");
	}
}
