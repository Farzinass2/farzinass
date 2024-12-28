package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendInvoiceTest {
	public WebDriver driver;
	private PageUtilities pageutilities;
	
	@FindBy(xpath="(//a[@class='btn btn-default mb0'])[1]")
	WebElement addinvoicebutton;
	@FindBy(xpath="(//a[@title='Add payment'])[1]")
	WebElement addpaymentbutton;
	@FindBy(xpath="(//i[@class='fa fa-cogs'])[1]")
	WebElement clickonsettingsbutton;
	@FindBy(xpath="(//a[@title='Edit invoice'])[1]")
	WebElement editinvoicebutton;
	@FindBy(xpath="(//a[@class='delete'])[1]")
	WebElement deleteinvoicebutton;
	
	
	
	public QALegendInvoiceTest(WebDriver driver) {
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);

	}
	public void AddInvoiceButton() {
		addinvoicebutton.click();
	}

	public void ClickOnSettingsButton() {
		clickonsettingsbutton.click();
	}
	public void EdiInvoiceButton() {
		editinvoicebutton.click();
	}
	public void DeleteInvoicetButton() {
		deleteinvoicebutton.click();
	}
	

}

	



