package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendHomePage {
	public WebDriver driver;
	private PageUtilities pageutilities;
	@FindBy(xpath="//span[text()='Notes']")
	WebElement dashboard_notesbutton;
	@FindBy(xpath="//span[text()='Lekshmi Nair']")
	WebElement Dropdownbutton;
	@FindBy(xpath="//i[@class='fa fa-power-off mr10']")
	WebElement signoutbutton;
	@FindBy(xpath="//i[@class='fa fa-desktop dashboard-menu']")
	WebElement dashboardbutton;
	@FindBy(xpath="//span[text()='Messages']")
	WebElement Messagebutton;
	@FindBy(xpath="//span[text()='Projects']")
	WebElement HomeProjectbutton;
	@FindBy(xpath="//span[text()='AllProjects']")
	WebElement AllProjectbutton;
	private WebElement userNameField;
	private WebElement signInbutton;
	public QALegendHomePage(WebDriver driver) {
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void clickOnDashBoardNotesButton() {
		dashboard_notesbutton.click();
	}
	public void DropdownButton() {
		Dropdownbutton.click();
	}
	public void DashboardButton() {
	    dashboardbutton.click();
	}
	public void MessageButton() {
		Messagebutton.click();
	}
	public void HomeProjectButton() {
		HomeProjectbutton.click();
	}
	public void AllProjectButton() {
	AllProjectbutton.click();
	}
public  void loginWithValidCredentials(String username,String password) {
		pageutilities.enterTextOnWebElement(userNameField, username);
		pageutilities.enterTextOnWebElement(userNameField, password);
		pageutilities.ClickOnElement(signInbutton);
	}


public void Clickon_LakshmiNair() {
	// TODO Auto-generated method stub
	Dropdownbutton.click();
}


public void ClickOn_SignOut() {
	// TODO Auto-generated method stub
	Dropdownbutton.click();
}


public void clickOnHomePageEventButton() {
	Dropdownbutton.click();
	
}


public void clickOnHomePageClientButton() {
	// TODO Auto-generated method stub
	
}


public void clickOnHomePageNoteButton() {
	// TODO Auto-generated method stub
	
}


public void clickonHomePageMessageButton() {
	// TODO Auto-generated method stub
	
}


public void clickonHomePageInvoiceButton() {
	// TODO Auto-generated method stub
	
}


public void clickonHomeProjectButton() {
	// TODO Auto-generated method stub
	
}

	
	
}
