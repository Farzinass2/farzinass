package testScript;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendNoteTest extends Base {
	public WebDriver driver;
	private Object UploadFile;
	@Test
	public void addNote() throws AWTException, InterruptedException {
		loginpage.loginToQALegend(properties.getProperty("username"),properties.getProperty("password"));
		homepage.clickOnHomePageNoteButton();
		notepage.clickAddNoteButton();
		String noteTitle=ExcelUtility.getStringData(1, 0, "Note")+ FakerUtility.randomNumberGenerator(); 
		String noteDescription=ExcelUtility.getStringData(1,1,"Note");
		UploadFile.click();
		notepage.clickOnAddNoteSaveButton();
		Assert.assertEquals(notepage.getNoteTitle(),true);
		
	}
	@Test
	public void editNote() throws AWTException, InterruptedException
	
	{
		loginpage.loginToQALegend(properties.getProperty("username"),properties.getProperty("password"));
		notepage.clickEditNoteButton();
		String noteTitle=ExcelUtility.getStringData(1, 0, "Note")+ FakerUtility.randomNumberGenerator(); 
		String noteDescription=ExcelUtility.getStringData(1,1,"Note");
		Thread.sleep(2000);
		Assert.assertEquals(notepage.getNoteTitle(),true);
		
		
	}
	@Test
	public void deleteNote() throws InterruptedException
	{
		loginpage.loginToQALegend(properties.getProperty("username"),properties.getProperty("password"));
        notepage.clickon_delete();
        Thread.sleep(4000);
        Assert.assertEquals(notepage.getNoteTitle(),true);
        
        
	}
	
	}


