package testScript;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;

import Constants.Constants;
import Utilities.ScreenShotUtility;
import pages.QALegendAddEvent;
import pages.QALegendAddProject;
import pages.QALegendClientPage;
import pages.QALegendEstimateTest;
import pages.QALegendHomePage;
import pages.QALegendItemTest;
import pages.QALegendMessageTest;
import pages.QALegendNotePage1;
import pages.QALegendNotesPage;
import pages.QALegendTicketPage;
import pages.QALegendLoginPage;
import pages.QALegendLoginPage1;

public class Base {
	
	public WebDriver driver;
	public Properties properties;
	public FileInputStream fis;
	
	QALegendHomePage homepage;
	QALegendLoginPage loginpage;
	
    QALegendNotesPage notepage;
	QALegendClientPage clientpage;
	QALegendAddProject addprojectpage;
	QALegendItemTest itempage;
	QALegendEstimateTest estimatepage;
	QALegendTicketPage ticketpage;
	QALegendMessageTest messagepage;
	QALegendLoginPage1 loginpage1;
	QALegendNotePage1 notepage1;
	QALegendAddEvent eventpage;
	
	@BeforeMethod(alwaysRun =true)
	@Parameters({"browser"})
	public void browserintialization(String browserName) throws Exception {
		properties = new Properties();
		fis = new FileInputStream(Constants.CONFIGFILE);
		properties.load(fis);
		if (browserName.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("FireFox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			throw new Exception("Invalid name Exception");
		}
		
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		homepage=new QALegendHomePage(driver);
		loginpage=new QALegendLoginPage(driver);

	    notepage=new QALegendNotesPage(driver);
		messagepage=new QALegendMessageTest(driver);
 	addprojectpage=new QALegendAddProject(driver);
	estimatepage=new QALegendEstimateTest(driver);
	ticketpage=new QALegendTicketPage(driver);
	loginpage1=new QALegendLoginPage1(driver);
	notepage1=new QALegendNotePage1(driver);
	eventpage=new QALegendAddEvent(driver);
	
	}
	@AfterMethod
	public void afterMethod(ITestResult itresult) throws IOException {
		if(itresult.getStatus()==ITestResult.FAILURE)
		{
			ScreenShotUtility sc = new ScreenShotUtility();
			sc.captureFailureScreenShot(driver, itresult.getName());
		}
		if(driver!=null)
		{
			driver.quit();
		}
	}
		
	}

	



	

