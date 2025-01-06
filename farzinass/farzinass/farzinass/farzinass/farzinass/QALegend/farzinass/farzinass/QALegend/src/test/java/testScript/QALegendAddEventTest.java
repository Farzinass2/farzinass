package testScript;

import org.testng.annotations.Test;

import Constants.Constants;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendAddEventTest extends Base{
	public WebDriver driver;
	@Test
	public void verifyaddEvent() throws IOException{
		loginpage.loginToQALegend(properties.getProperty("username"),properties.getProperty("password"));
		homepage.clickOnHomePageEventButton();
		eventpage.clickonaddEventButton();
		String addEvent_title=ExcelUtility.getStringData(1, 0, Constants.EXCELFILEPATH,"Events")+ FakerUtility.randomNumberGenerator();
		String addEvent_Description=ExcelUtility.getStringData(1,1,Constants.EXCELFILEPATH,"Events")+FakerUtility.randomNumberGenerator();
		eventpage.addEvent(addEvent_title, addEvent_Description);
        Assert.assertEquals(eventpage.addEventsaveButtonStatusChecker(),true);
		
	}

}
