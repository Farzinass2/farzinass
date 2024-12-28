package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendClientPage {
	public WebDriver driver;
	public PageUtilities pageutilities;
	@FindBy(xpath="//input[@id='company_name']")
	WebElement client_companyname;
	@FindBy(xpath="//input[@id='city']")
	WebElement client_city;
	@FindBy(xpath="//input[@id='state']")
	WebElement client_state;
	@FindBy(xpath="//input[@id='country']")
	WebElement client_country;
	@FindBy(xpath="//input[@id='website']")
	WebElement client_website;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement savebutton;
	@FindBy(xpath="//button[@class='btn btn-default'])[1]")
	WebElement closebutton;
	private QALegendLoginPage s;
	private WebElement client_address;
	private WebElement addclientsaveButton;
	private WebElement editclientsaveButton;
	
	
	
	public QALegendClientPage(WebDriver driver)
	{
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
		
	}
	public  String addClient(String companyname,String address,String city,String state,int zip,String country,int phone,String website,int vatnumber,String clientgroups,int currency,int currencysymbol)
	{
		pageutilities.enterTextOnWebElement(client_companyname,companyname);
		pageutilities.enterTextOnWebElement(client_address, address);
		pageutilities.enterTextOnWebElement(client_city, city);
		pageutilities.enterTextOnWebElement(client_state, state);
		
		pageutilities.enterTextOnWebElement(client_country, country);
		
		pageutilities.enterTextOnWebElement(client_website, website);
		
		

		pageutilities.ClickOnElement(addclientsaveButton);
		return companyname;
		}
	public String editClient(String companyname,String address,String city,String state,int zip,String country,int phone,String website,int vatnumber,String clientgroups,int currency,int currencysymbol)
	{
		pageutilities.enterTextOnWebElement(client_companyname,companyname);
		pageutilities.enterTextOnWebElement(client_address, address);
		pageutilities.enterTextOnWebElement(client_city, city);
		pageutilities.enterTextOnWebElement(client_state, state);
		
		pageutilities.enterTextOnWebElement(client_country, country);
		
		pageutilities.enterTextOnWebElement(client_website, website);
		
		
		pageutilities.ClickOnElement(editclientsaveButton);
		return companyname;
	}
	public void clickon_delete() {
		// TODO Auto-generated method stub
		
	}
	public void clickAddClientButton() {
		// TODO Auto-generated method stub
		
	}
	public String addClient(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8, String string9, String string10, String string11) {
		// TODO Auto-generated method stub
		return null;
	}
	public byte[] getClientCompanyName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void clickEditClientButton() {
		// TODO Auto-generated method stub
		
	}
		
	}
	
		
	