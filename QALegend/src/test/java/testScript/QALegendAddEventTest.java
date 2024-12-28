package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.FakerUtility;

public class QALegendAddEventTest extends Base{
	public WebDriver driver;
	@Test
	public void addEvent() {
		loginpage.loginToQALegend(properties.getProperty("username"),properties.getProperty("password"));
		eventpage.addEvent();
		String addEvent_title=eventpage.addEvent(properties.getProperty("addEvent_title") + FakerUtility.randomNumberGenerator(),properties.getProperty("addEvent_Description") + FakerUtility.randomNumberGenerator(),properties.getProperty("addEvent_StartDate") + FakerUtility.randomNumberGenerator(),(properties.getProperty("addEvent_EndDate") + FakerUtility.randomNumberGenerator(),properties.getProperty("addEvent_StartTime") + FakerUtility.randomNumberGenerator(),properties.getProperty("addEvent_EndTime") + FakerUtility.randomNumberGenerator(),(properties.getProperty("addEvent_Location") + FakerUtility.randomNumberGenerator(),properties.getProperty("addEvent_Labels") + FakerUtility.randomNumberGenerator(),properties.getProperty("addEvent_Client") + FakerUtility.randomNumberGenerator(),properties.getProperty("addEvent_ShareWith") + FakerUtility.randomNumberGenerator(),properties.getProperty("addEvent_Repeat") + FakerUtility.randomNumberGenerator());
		Thread.sleep(4000);
        Assert.assertEquals(eventpage.addEvent(),true);
		
	}

}
