package TestCases;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import BaseClass.Base;

public class Amazon0145 extends Base {
	WebDriver driver;
	private String name;
	@BeforeMethod
	public void intialization() throws Exception{
		driver=browserintialization("chrome");
		//driver.get("https://www.amazon.in/");
		}
	/*@Test(priority=1)
	public void tc01() throws InterruptedException{
	String value=driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
	System.out.println(value);
	String value1=driver.findElement(By.id("field-keywords")).getAttribute("placeholder");
	System.out.println(value1);
	//System.out.println("tc01");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.id("twotabsearchtextbox")).clear();
	driver.findElement(By.name("field-keywords")).sendKeys("Brush");
	driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.className("a-button-input"));
		//driver.findElement(By.linkText("Conditions of Use"));
		//driver.findElement(By.partialLinkText("Conditions"));
	//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
	//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("smart tv");
	//driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
	//String ValueText=driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
	//System.out.println(ValueText);
	//String ValueAttribute=driver.findElement(By.id("twotabsearchtextbox")).getAttribute("placeholder");
	//System.out.println(ValueAttribute);
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart tv");
	//driver.findElement(By.id("nav-search-submit-button")).click();
	//WebElement dropDown=driver.findElement(By.id("s-result-sort-select"));
	//Select drp=new Select(dropDown);
	//drp.selectByVisibleText("Price: Low to High");
	//drp.deselectByIndex(0);
	//driver.navigate().to("https://www.makemytrip.com/");
	//driver.findElement(By.xpath("//div[@id='react-autowhatever-1']//preceding::input)[2]")).sendKeys("Mumbai");
	//driver.findElement(By.xpath("//span[text()='Mumbai']")).click();
	//driver.findElement(By.xpath("fromCity")).click();
	driver.findElement(By.id("field-keywords")).sendKeys("smart Tv");
	driver.findElement(By.id("nav-search-submit-button")).click();
	List<WebElement>products=driver.findElements(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[24]"));
	System.out.println(products.size());
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[23]")).click();
	driver.findElement(By.xpath("//div[text()='EN']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//(//i[@class='a-icon a-icon-checkbox'])[22]")).click();
	Thread.sleep(2000);
	boolean status=driver.findElement(By.id(value1)).isDisplayed();
	System.out.println(status);
	boolean status1=driver.findElement(By.id(value1)).isDisplayed();
	System.out.println(status1);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
	driver.navigate().to("https://demo.guru99.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("cusid")).sendKeys("8761");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	String alertMsg=driver.switchTo().alert().getText();
	System.out.println(alertMsg);}
	@Test(priority=2)
	public void tc02() {
		driver.findElement(By.id(null)).click();
		SoftAssert softassert=new SoftAssert();
        softassert.assertEquals(driver.findElement(By.id("Continue")).isDisplayed(),true);
        System.out.println("Testcase 3-tc03");
        softassert.assertEquals(driver.findElement(By.xpath("//h1[@class='a-spacing-small']")).getText(),"\r\nSign in\r\n");
	    softassert.assertAll();}
  
      		//driver.navigate().to("https://www.flipkart.com/");
		//driver.navigate().to("https://www.ajio.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();*/
	@Test(dataProvider="data")
	    public void tc05(String username,String password) {
	    	System.out.println("tc05");
	    	driver.navigate().to("http://demo.guru99.com/V1/index.php\r\n");
	    	driver.findElement(By.name("uid")).sendKeys(username);
	    	driver.findElement(By.name("password")).sendKeys(password);
	    	driver.findElement(By.name("btnLogin")).click();
	    	
	    }
	public void tc06()
	{
		System.out.println("tc06");
	}
	    /*@BeforeSuite
	    public void beforeSuiteMethodx()
	    {
	    	System.out.println("Before Suite");
	    }
	    @AfterSuite
	    public void afterSuiteMethodx()
	    {
	    	System.out.println("After Suite");
	    }

	    @BeforeTest
	    public void beforeTestEx()
	    {
	    	System.out.println("Before Test");
	    }
	    @AfterTest
	    public void afterTestEx()
	    {
	    	System.out.println("After Test");
	    }
	    public void tc03()
	    {
	    	System.out.println("Test case 3 - tc03");}
	    @AfterMethod
	    public void teardown()
	    {
	    	driver.quit();
	    	System.out.println("After Method Example");
	    }
	    @BeforeClass
	    public void beforeclassx()
	    {
	    	System.out.println("before class example");
	    }
	    @AfterClass
	    public void afterclassx()
	    {
	    	System.out.println("before class example");
	    }
	    @BeforeGroups
	    public void beforeGroup()
	    {
	    	System.out.println("before group");
	    }
	    @AfterGroups
	    public void afterGroup()
	    {
	    	System.out.println("after group");
	    }*/
	@DataProvider (name="data")
	public Object[][]getUserData(){
		return new Object[][] {
			{"margret James","1234"},
			{"Farzina","qwerty"},
			{"Anisha","asdfg"},
		};
	}
}







