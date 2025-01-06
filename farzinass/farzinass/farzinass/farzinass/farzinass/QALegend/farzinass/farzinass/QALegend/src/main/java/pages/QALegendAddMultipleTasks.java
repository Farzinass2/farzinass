package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendAddMultipleTasks {
	
	private WebDriver driver;
	private PageUtilities pageutilities;
	
	@FindBy(xpath="//a[@class='btn btn-default'])[1])")
    WebElement addMutipleTask;
	@FindBy(id="title")
	WebElement Title;
	@FindBy(id="description")
	WebElement Description;
	@FindBy(id="select2-drop-mask")
	WebElement Project;
	@FindBy(id="select2-drop-mask")
	WebElement Points;
	@FindBy(id="s2id_autogen1832")
	WebElement Collaborators;
	@FindBy(id="select2-drop-mask")
	WebElement Status;
	@FindBy(xpath="//input[@class=\"select2-input select2-default\"])[1]")
	WebElement Labels;
	@FindBy(id="start_date")
	WebElement startdate;
	@FindBy(id="deadline")
	WebElement DeadLine;
	@FindBy(id="save-and-add-button")
	WebElement Saveandaddmore;
	@FindBy(xpath="//span[@class='fa fa-close']\")")
	WebElement close;
	@FindBy(xpath="//button[@class='btn btn-default upload-file-button pull-left btn-sm round dz-clickable']")
	WebElement UploadFile;

	public QALegendAddMultipleTasks(WebDriver driver) {
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);

	}
	public void AddProject(String title,String description) {
		pageutilities.enterTextOnWebElement(Title, title);
		pageutilities.enterTextOnWebElement(Description, description);
		pageutilities.ClickOnElement(addMutipleTask);
		pageutilities.enterKeyPress();
		return;
	}
		



		
	}


	
	
	
	
	

