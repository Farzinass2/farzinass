package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendAddEvent {
private static final WebElement descriptionfield = null;
public QALegendAddEvent(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
public WebDriver driver;
public PageUtilities pageUtilities;
@FindBy(xpath="//a[@class='btn btn-default'])")
WebElement addEvent;
@FindBy(id="title")
WebElement addEvent_title;
@FindBy(id="description")
WebElement addEvent_description;
@FindBy(xpath="//div[@class='datepicker-days']")
WebElement addEvent_StartDate;
@FindBy(xpath="//div[@class='datepicker-days']")
WebElement addEvent_Enddate;
@FindBy(xpath="//input[@id='start_time']")
WebElement addEvent_StartTime;
@FindBy(id="end_time")
WebElement addEvent_EndTime;
@FindBy(id="location")
WebElement addEvent_Location;
@FindBy(xpath="//input[@id='s2id_autogen52']")
WebElement addEvent_Label;
@FindBy(xpath="//div[@class='select2-drop-mask']")
WebElement addEvent_Client;
@FindBy(xpath="//label[text()='Share with']")
WebElement ShareWith;
@FindBy(xpath="//label[text()='Repeat']")
WebElement Repeat;
@FindBy(xpath="//button[@class='btn btn-primary']")
WebElement addEvent_SaveButton;
@FindBy(xpath="//button[@class='btn btn-default'])[1]")
WebElement addEvent_CloseButton;
private WebElement addEventButton;
private WebElement titlebox;
private WebElement startdate;
private WebElement enddate;
public void QALegendAddEvent1(WebDriver driver) {
	this.driver=driver;
	this.pageUtilities=new PageUtilities(driver);
	PageFactory.initElements(driver,this);
	
	
}
public void clickonaddEventButton()
{
pageUtilities.ClickOnElement(addEventButton);

}
public void addEvent(String title,String description, WebElement starttime, WebElement endtime)
{
	titlebox.sendKeys("title");
	pageUtilities.enterTextOnWebElement(descriptionfield,description);
	startdate.sendKeys("2024-10-20");
	enddate.sendKeys("2024-11-22");
	starttime.sendKeys("10.00am");
	endtime.sendKeys("12.00pm");
	
	
}
public boolean addEventsaveButtonStatusChecker()
{
	return (pageUtilities.isElementEnabled(addEvent_SaveButton));
}
public void addEvent(int addEvent_title2, String addEvent_Description2) {
	// TODO Auto-generated method stub
	
}
public void addEvent(String addEvent_title2, String addEvent_Description2) {
	// TODO Auto-generated method stub
	
}
	
}

