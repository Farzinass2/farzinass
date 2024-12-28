package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.FakerUtility;
import Utilities.PageUtilities;


public class QALegendTicketTest extends Base {
public WebDriver driver;
private Object uploadFileButton;
private WebElement AddNoteSaveButton;
private WebElement EditSaveButton;
	
	@Test
	public void  addTicket() throws InterruptedException {
		loginpage.loginToQALegend(properties.getProperty("username"),properties.getProperty("password"));
		ticketpage.clickAddTicket();
		String ticketTitle=ticketpage.addTicket(properties.getProperty("title")+FakerUtility.randomNumberGenerator(), properties.getProperty("client")+FakerUtility.randomNumberGenerator()+properties.getProperty("ticket_type")+FakerUtility.randomNumberGenerator(),properties.getProperty("description")+FakerUtility.randomNumberGenerator(),properties.getProperty("Assign_to")+FakerUtility.randomNumberGenerator()+properties.getProperty("Labels")+FakerUtility.randomNumberGenerator()); 
	Thread.sleep(3000);
	((WebElement) uploadFileButton).click();
	 PageUtilities.ClickOnElement(AddNoteSaveButton);

		
		
	}
	@Test
	public void settingsButton() throws InterruptedException
	{
		loginpage.loginToQALegend(properties.getProperty("username"),properties.getProperty("password"));
		ticketpage.clickOnSettingsButton();
		ticketpage.clickOnEditButton();
		String ticketTitle=ticketpage.settingsButton(properties.getProperty("title")+FakerUtility.randomNumberGenerator(), properties.getProperty("Ticket_type")+FakerUtility.randomNumberGenerator()+properties.getProperty("Assign_to")+FakerUtility.randomNumberGenerator(),properties.getProperty("Labels")+FakerUtility.randomNumberGenerator(),properties.getProperty("Assign_to")+FakerUtility.randomNumberGenerator()+properties.getProperty("Labels")+FakerUtility.randomNumberGenerator()); 
		Thread.sleep(3000);
		PageUtilities.ClickOnElement(EditSaveButton);
		ticketpage.clickOnDeleteButton();
		ticketpage.clickon_delete();
        Thread.sleep(4000);
       // Assert.assertEquals(ticketpage.clickOnSettingsButton(),true);
	}
	

}



