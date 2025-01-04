package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QALegendInvoiceTest1 extends Base{
	public WebDriver driver;
	private Object invoicespage;
	@Test
	public void eyeButtonFunctionality()
	{
		loginpage.loginToQALegend(properties.getProperty("username"),properties.getProperty("password"));
		homepage.clickonHomePageInvoiceButton();
		invoicespage.eyebutton();
		Assert.assertFalse(invoicespage.eyebuttonFunctionality());
		
	}
	

}
