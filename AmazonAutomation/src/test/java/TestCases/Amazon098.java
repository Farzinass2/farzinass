package TestCases;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseClass.Base;
public class Amazon098 extends Base {
	private static final Boolean True = null;
	WebDriver driver;
	@BeforeMethod
	public void intialization() throws Exception{
		driver=browserintialization("chrome");
		driver.get("https://www.amazon.in/");}
	@Test
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
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Midnight']")).isDisplayed(),True);
		//driver.findElement(By.className("a-button-input"));
		//driver.findElement(By.linkText("Conditions of Use"));
		//driver.findElement(By.partialLinkText("Conditions"));
	//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
	//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("smart tv");
	//driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
	String ValueText=driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
	System.out.println(ValueText);
	String ValueAttribute=driver.findElement(By.id("twotabsearchtextbox")).getAttribute("placeholder");
	System.out.println(ValueAttribute);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart tv");
	driver.findElement(By.id("nav-search-submit-button")).click();
	WebElement dropDown=driver.findElement(By.id("s-result-sort-select"));
	Select drp=new Select(dropDown);
	drp.selectByVisibleText("Price: Low to High");
	drp.deselectByIndex(0);
	driver.navigate().to("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//div[@id='react-autowhatever-1']//preceding::input)[2]")).sendKeys("Mumbai");
	driver.findElement(By.xpath("//span[text()='Mumbai']")).click();
	driver.findElement(By.xpath("fromCity")).click();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart Tv");
	driver.findElement(By.id("nav-search-submit-button")).click();
	List<WebElement>products=driver.findElements(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[24]"));
	System.out.println(products.size());
	Thread.sleep(2000);
	driver.navigate().to("https://demo.guru99.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("cusid")).sendKeys("8761");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	String alertMsg=driver.switchTo().alert().getText();
	System.out.println(alertMsg);}
	@Test
	public void tc02() {
		//driver.navigate().to("https://www.flipkart.com/");
		//driver.navigate().to("https://www.ajio.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();}
}}




