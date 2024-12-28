package testScript;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class QALegendLoginTests extends Base {
	
	public WebDriver driver;
	
	@Test
	public void invalidLogin() {
		loginpage.loginWithInvalidCredentials(properties.getProperty("invalidusername"), properties.getProperty("invalidpassword"));
		//Assert.assertEquals(loginpage.isdisplyed(),true);
		Assert.assertEquals(loginpage.checkAuthentication(),true);
	}
}
