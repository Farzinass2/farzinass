package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QALegendLoginTest1 extends Base{
	public WebDriver driver;
	@Test
	public void validLogin() {
		loginpage1.logintoQALegend(properties.getProperty("username"), properties.getProperty("password"));
	}
	@Test
	public void invalidLogin() {
		loginpage1.loginWithInvalidCredentials(properties.getProperty("invalidusername"), properties.getProperty("invalidpassword"));
		Assert.assertEquals(loginpage1.checkAuthentication(), true);
	}
	}

	


