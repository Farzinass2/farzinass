package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendTicketPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath="//button[@class='btn btn-default dropdown-toggle  mt0 mb0'])[1]\r\n")
	WebElement clicksettingsbutton;		
	@FindBy(xpath="//a[@class='delete'])[1]")
	WebElement clickdeletebutton;
	public QALegendTicketPage(WebDriver driver) {
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);

	}
	public void clickOnSettingsButton() {
		clicksettingsbutton.click();
	}
	public void clickOnDeleteButton() {
		clickdeletebutton.click();
	}
	public void clickAddTicket() {
		// TODO Auto-generated method stub
		
	}
	public String addTicket(String string, String string2, String string3, String string4) {
		// TODO Auto-generated method stub
		return null;
	}
	public void clickOnEditButton() {
		// TODO Auto-generated method stub
		
	}
	public String settingsButton(String string, String string2, String string3, String string4) {
		// TODO Auto-generated method stub
		return null;
	}
	public void clickon_delete() {
		// TODO Auto-generated method stub
		
	}

}
