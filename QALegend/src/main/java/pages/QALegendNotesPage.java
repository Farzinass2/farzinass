package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendNotesPage {
	
	public WebDriver driver;
	private PageUtilities pageutilities;
	
	@FindBy(xpath="//a[@class= 'btn btn-default']")
	WebElement addNoteButton;
	@FindBy(id="title")
	WebElement noteTitle;
	@FindBy(id="description")
	WebElement noteDescription;
	@FindBy(id="s2id_note_labels")
	WebElement noteLabel;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement addNoteSaveButton;
	@FindBy(xpath="//i[@class='fa fa-camera']")
	WebElement uploadFileButton;
	@FindBy(xpath="(//a[@class='edit'])[1]")
	WebElement tableNoteTitle;
	@FindBy(xpath="//div[@id='note-table_filter']//descendant::input")
	WebElement noteSearchBox;
	private WebElement editNoteSaveButton;
	private Object String;
	public Object clickEditNoteButton;
	
		public QALegendNotesPage(WebDriver driver) {
			this.driver=driver;
			this.pageutilities=new PageUtilities(driver);
			PageFactory.initElements(driver, this);
		}
	
		public void clickAddNoteButton() {
			addNoteButton.click();
		}
	
		public  String getNoteTitle() {
			String noteTitle=tableNoteTitle.getText();
			return noteTitle;
		}
		
		public void searchNote(String noteName) {
			pageutilities.enterTextOnWebElement(noteSearchBox,noteName);					
		}
		
		public String addNote(String title,String description) throws AWTException {
			pageutilities.enterTextOnWebElement(noteTitle, title);
			pageutilities.enterTextOnWebElement(noteDescription, description);
			pageutilities.ClickOnElement(noteLabel);
			pageutilities.enterKeyPress();
			uploadFileButton.click();
			pageutilities.ClickOnElement(addNoteSaveButton);
			return title;
		}
		public String editNote (String title,String description)throws AWTException            {
			{
			pageutilities.enterTextOnWebElement(noteTitle, title);
			pageutilities.enterTextOnWebElement(noteDescription, description);
			pageutilities.ClickOnElement(noteLabel);
			pageutilities.enterKeyPress();
			uploadFileButton.click();
			pageutilities.ClickOnElement(editNoteSaveButton);
			return title;}
	
			
		}

		public void clickEditNoteButton() {
			// TODO Auto-generated method stub
			
		}

		public void clickon_delete() {
			// TODO Auto-generated method stub
			
		}

		public void clickOnAddNoteSaveButton() {
			// TODO Auto-generated method stub
			
		}
			}
		
		
	
	
	
	


