package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendMessageTest {
	public WebDriver driver;
	private PageUtilities pageutilities;
	@FindBy(xpath="(//a[@class='list-group-item'])[1]")
	WebElement composebutton;
	@FindBy(xpath="(//a[@class='list-group-item'])[1]")
	WebElement inboxbutton;
	@FindBy(xpath="//a[text()='Sent items']")
	WebElement sentitemsbutton;
	@FindBy(xpath="//i[@class='fa fa-comments font-18']")
	WebElement clickoncommentbutton;
	
	
	
	public  QALegendMessageTest(WebDriver driver)
	{
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
		
	}
	


	public void ComposeButton() {
		composebutton.click();
	}
	
	public void InboxButton() {
		inboxbutton.click();
	}
	public void SentItemsButton() {
		sentitemsbutton.click();
	}
	
	


}




	
	