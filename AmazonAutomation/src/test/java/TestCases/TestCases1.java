package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class TestCases1 extends Base {
	WebDriver driver;
	AmazonHomePage homepage;
	@BeforeMethod(groups= {"regresssiontest","smoketest"});
	@Parameters({"browser"})
	public void initialization(String browsername)throws Exception{
		driver=browserInitialization(browsername);
		homepage=new AmazonHomePage(driver);
		listingpage=new AmazonListingPage(driver);
		driver.get("https://www.amazon.in/");
		System.out.println("Before Method");
	}
	@Test
	public void tc01()
	{
		homepage.amazonHomeSearchBox().sendKeys("iphone");
		homepage.clickOn_amazonSearchButton();
		int productCount=listingpage.productFinder.size();
		Assert.assertEquals(productCount, 18);
		
	}
	
	
}
