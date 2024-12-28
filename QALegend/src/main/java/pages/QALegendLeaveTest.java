package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendLeaveTest {
	public WebDriver driver;
	private PageUtilities pageutilities;
	@FindBy(xpath="(//a[@class='btn btn-default'])[1]")
	WebElement applyleavebutton;
	@FindBy(xpath="//a[@title='Assign leave']")
	WebElement assignleavebutton;
	@FindBy(xpath="(//a[@title='Application details'])[1]")
	WebElement clickonapplicationdetailsbutton;
	@FindBy(xpath="(//a[@class='delete'])[1]")
	WebElement clickondeletebutton;
	
	
	public  QALegendLeaveTest(WebDriver driver)
	{
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
		
	}

public void ApplyLeaveButton() {
	applyleavebutton.click();
}

public void AssignLeaveButton() {
	assignleavebutton.click();

}




}



