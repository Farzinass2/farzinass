package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.PageUtilities;

public class QALegendLoginPage {
	
	public WebDriver driver;
	private PageUtilities pageutilities;
	
	@FindBy(id="email")
	WebElement userNameField;
	
	@FindBy(id="password")
	WebElement passwordField;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-primary btn-block mt15']")
	WebElement signInButton;
	
	@FindBy(xpath="//span[text()='Authentication failed!']")
	WebElement authenticationfailed;
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-exclamation-sign']//following::span")
	WebElement authentication_msg;
	
//	private Object element;

	public QALegendLoginPage(WebDriver driver)
	{
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);		
	}
		
	public void loginToQALegend(String email, String password) {			 		
		pageutilities.enterTextOnWebElement(userNameField, email);             
		pageutilities.enterTextOnWebElement(passwordField, password);
		pageutilities.ClickOnElement(signInButton);                             		
	}
	
	
	public  void loginWithInvalidCredentials(String username,String password) {
		pageutilities.enterTextOnWebElement(userNameField, username);
		pageutilities.enterTextOnWebElement(passwordField, password);
		pageutilities.ClickOnElement(signInButton);
	}
	
	public boolean checkAuthentication() {
		return authentication_msg.isDisplayed();	 // assertn method 
	}
	
	
//	public boolean isdisplyed() {
//		return Return ((QALegentLoginPage) element).isdisplyed();
//		
//	}
	
	
//	private QALegentLoginPage Return(QALegentLoginPage element2) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
