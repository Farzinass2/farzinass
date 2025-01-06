package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendNotePage1 {
	
	public WebDriver driver;
	public PageUtilities pageUtilities;
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement addNoteButton;
	@FindBy(id="title")
	WebElement noteTitle;
	@FindBy(id="description")
	WebElement noteDescription;
	@FindBy(xpath="//i[@class='fa fa-camera']")
	WebElement UploadFileButton;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement addNoteSaveButton;
	@FindBy(xpath="//div[@id='note-table_filter']//descendant::input")
	WebElement noteSearchBox;
	@FindBy(xpath="//span[@class='fa fa-close']")
	WebElement addNoteCloseButton;
	private WebElement tablenoteTitle;
	public QALegendNotePage1(WebDriver driver) {
		this.driver=driver;
		this.pageUtilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	public  void addNoteButton() {
		addNoteButton.click();
	}
	public String getNoteTitle() {
		String noteTitle=tablenoteTitle.getText();
		return noteTitle;
	}
	public void searchNote(String noteName)
	{
		pageUtilities.enterTextOnWebElement(noteSearchBox,noteName);
	}
	}

