package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendEstimateTest {
	public WebDriver driver;
	private PageUtilities pageutilities;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement addestimatebutton;
	@FindBy(xpath="//a[@class='edit']")
	WebElement editestimatebutton;
	@FindBy(xpath="//i[@class='fa fa-times fa-fw']")
	WebElement deleteestimatebutton;
	public QALegendEstimateTest(WebDriver driver) {
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);

	}
	public void AddEstimateButton() {
		addestimatebutton.click();
	}
	public void DeleteEstimateButton() {
		deleteestimatebutton.click();
	}

}

	

