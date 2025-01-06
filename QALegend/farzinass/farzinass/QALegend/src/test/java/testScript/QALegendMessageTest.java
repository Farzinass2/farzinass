package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.FakerUtility;
import pages.QALegendLoginPage;

public class QALegendMessageTest extends Base 
{
	public WebDriver driver;
	@Test
	public void composingMessage()
	{
	loginpage.loginToQALegend(properties.getProperty("username"),properties.getProperty("password"));
	homepage.clickonHomePageMessageButton();
	String messageText="hello"+FakerUtility.uniqueStringGenerator();
    String userforMessaging=properties.getProperty("Messageuser");
	messagepage.composingMessage(userforMessaging,messageText);
    Assert.assertEquals(messageText,messagepage.valdatingMessageSent(userforMessaging));
}
}

