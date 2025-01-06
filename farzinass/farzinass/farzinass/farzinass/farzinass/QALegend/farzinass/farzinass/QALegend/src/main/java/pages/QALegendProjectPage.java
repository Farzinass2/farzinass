package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendProjectPage {
	public QALegendProjectPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
	public WebDriver driver;
	public PageUtilities pageUtilities;
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement addProjectButton;
	@FindBy(id="title")
	WebElement title;
	@FindBy(id="select2-drop-mask")
	WebElement client;
	@FindBy(id="description")
	WebElement description;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement addProjectSaveButton;
	@FindBy(xpath="//button[@class='btn btn-default'])[3]")
	WebElement closeButton;
	private WebElement Title;
	public QALegendProjectPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pageUtilities=pageUtilities(driver);
	PageFactory.initElements(driver,this);
	}
	public void addproject(String title,String Description)
	{
		pageUtilities.enterTextOnWebElement(Title,title);
		pageUtilities.enterTextOnWebElement(Description, Description);
		pageUtilities.ClickOnElement(addProjectSaveButton);
		
	}
	private PageUtilities pageUtilities(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}
	public void clickonHomeProjectButton() {
		// TODO Auto-generated method stub
		
	}
	public void clickonAddProjectButton() {
		// TODO Auto-generated method stub
		
	}
	public Object addProjectSaveButtonStatusChecker() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
