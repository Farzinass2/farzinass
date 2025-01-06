package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendLoginPage1 {

	public WebDriver driver;
	private PageUtilities pageutilities;
	
	@FindBy(id="email")
	WebElement usernameField;
	@FindBy(id="password")
	WebElement passwordField;
	@FindBy(xpath="//button[@class=\"btn btn-lg btn-primary btn-block mt15\"])")
	WebElement SigninButton;
	@FindBy(xpath="//span[text()='Authentication failed!']")
	WebElement Authentication_msg;


public QALegendLoginPage1(WebDriver driver) {
	this.driver=driver;//It assigns the passed value (driver) to the object’s variable (this.driver).
	this.pageutilities=new PageUtilities(driver);
	PageFactory.initElements(driver,this);
}
public void logintoQALegend(String username,String password)
{
	pageutilities.enterTextOnWebElement(usernameField, username);
	pageutilities.enterTextOnWebElement(passwordField, password);
	pageutilities.ClickOnElement(SigninButton);
}
public void loginWithInvalidCredentials(String username,String password)
{
	pageutilities.enterTextOnWebElement(usernameField, username);
	pageutilities.enterTextOnWebElement(passwordField,password);
	pageutilities.ClickOnElement(SigninButton);
}
public  boolean checkAuthentication() {
	return Authentication_msg.isDisplayed();
}

}

