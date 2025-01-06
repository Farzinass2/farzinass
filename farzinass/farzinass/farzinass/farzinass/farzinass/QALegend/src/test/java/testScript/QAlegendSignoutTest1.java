package testScript;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class QAlegendSignoutTest1 extends Base {
	public WebDriver driver;
	@Test
	public void SignOutt() throws InterruptedException {
		homepage.loginWithValidCredentials(properties.getProperty("usename"),properties.getProperty("password"));
		Thread.sleep(3000);
		homepage.Clickon_LakshmiNair();
		homepage.ClickOn_SignOut();
		//Assert.assertEquals(loginpage.FindSigninLabel(),true);
		
		
	}

}
