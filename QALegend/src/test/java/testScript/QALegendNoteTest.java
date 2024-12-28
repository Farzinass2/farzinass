package testScript;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.FakerUtility;

public class QALegendNoteTest extends Base {
	public WebDriver driver;
	@Test
	public void addNote() throws AWTException, InterruptedException {
		loginpage.loginToQALegend(properties.getProperty("username"),properties.getProperty("password"));
		notepage.clickAddNoteButton();
		String noteTitle=notepage.addNote(properties.getProperty("title")+FakerUtility.randomNumberGenerator(), properties.getProperty("description")+FakerUtility.randomNumberGenerator()); 
		Thread.sleep(2000);
		Assert.assertEquals(notepage.getNoteTitle(),true);
		
	}
	@Test
	public void editNote() throws AWTException, InterruptedException
	
	{
		loginpage.loginToQALegend(properties.getProperty("username"),properties.getProperty("password"));
		notepage.clickEditNoteButton();
		String noteTitle=notepage.addNote(properties.getProperty("title")+FakerUtility.randomNumberGenerator(), properties.getProperty("description")+FakerUtility.randomNumberGenerator()); 
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


