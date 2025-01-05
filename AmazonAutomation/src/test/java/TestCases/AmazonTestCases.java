package TestCases;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.IRetryAnalyzer;
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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import BaseClass.Base;

public class AmazonTestCases extends Base {
	private static final Class<? extends IRetryAnalyzer> retryAnalyzer = null;
	WebDriver driver;
	@BeforeMethod
	
	public void intialization() throws Exception{
		driver=browserintialization("chrome");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("BeforeMethod Example");
	}
	@Test(groups={"regressiontest","smoketest"})
	    public void tc01() throws InterruptedException
	     {
			System.out.println("Test case - tc01"); 
	    	 }
		//String value=driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
		//System.out.println(value);
		//String value1=driver.findElement(By.id("field-keywords")).getAttribute("placeholder");
		//System.out.println(value1);
		//System.out.println("tc01");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.id("twotabsearchtextbox")).clear();
		//driver.findElement(By.name("field-keywords")).sendKeys("Brush");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.className("a-button-input"));
		//driver.findElement(By.linkText("Conditions of Use"));
		//driver.findElement(By.partialLinkText("Conditions"));
	//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
	//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("smart tv");
	//driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
	//String ValueText=driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
	//System.out.println(ValueText);
	//
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
	
	//}

	@Test(retryAnalyzer=TestCases1.retryAnalyzer.class)
	public void tc02() throws InterruptedException {
		System.out.println("Test case-tc02"); 
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to("https://www.ajio.com/");
        driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	@Test(groups={"regressiontest"})
	public void tc04() throws InterruptedException {
		System.out.println("Test case-tc04"); 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("umbrella");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for(String actual:childWindow) {
		if(!actual.equalsIgnoreCase(parentWindow)) {
		driver.switchTo().window(actual);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		WebElement addToCartButton=driver.findElement(By.id("add-to-cart-button"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", addToCartButton);
		}
		}
		driver.switchTo().window(parentWindow);
		driver.navigate().refresh();
	}}

		//Thread.sleep(2000);
		//driver.findElement(By.name("submit.add-to-cart")).click();
		//Thread.sleep(2000);
		//Wait<WebDriver> wait2=new FluentWait<>(driver)
		              //.withTimeout(Duration.ofSeconds(40))
		              //.pollingEvery(Duration.ofSeconds(5))
		              //.ignoring(NoSuchElementException.class);
		//}
		//}
		
			
		//driver.findElement(By.id("twotabsearchtextbox")).clear();
		//driver.findElement(By.name("field-keywords")).sendKeys("Brush");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.className("a-button-input"));
		//driver.findElement(By.linkText("Conditions of Use"));
		//driver.findElement(By.partialLinkText("Conditions"));
	//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
	//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("smart tv");
	//driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
	//String ValueText=driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
	//System.out.println(ValueText);
	//
	


