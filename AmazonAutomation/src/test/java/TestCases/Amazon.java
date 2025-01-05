package TestCases;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
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
import org.testng.annotations.Test;
import BaseClass.Base;
public class Amazon extends Base {
WebDriver driver;
@BeforeMethod
public void intialization() throws Exception{
	System.out.println("beforeMethod");
	driver=browserintialization("chrome");
    driver.get("https://www.amazon.in/");}
@Test
public void tc01() throws InterruptedException{
// TODO Auto-generated method stub
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toy");
Thread.sleep(2000);
driver.findElement(By.id("nav-search-submit-button")).click();
WebElement dropDown = driver.findElement(By.id("s-result-sort-select"));
Select drp = new Select(dropDown);
drp.selectByValue("review-rank");
Actions action = new Actions(driver);
action.sendKeys(Keys.ENTER).build().perform();//just to click
//action.sendKeys(Keys.CONTROL).build().perform();
//action.keyDown(Keys.CONTROL);//to click and hold
//action.keyUp(Keys.CONTROL);// release hold key
//action.build().perform();
//Handling Multiple Windows
driver.findElement(By.xpath("//span[@class = 'a-size-medium a-color-base a-text-normal']")).click();
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
Thread.sleep(2000);
driver.findElement(By.name("submit.add-to-cart")).click();
Thread.sleep(2000);
Wait<WebDriver> wait2=new FluentWait<>(driver)
              .withTimeout(Duration.ofSeconds(40))
              .pollingEvery(Duration.ofSeconds(5))
              .ignoring(NoSuchElementException.class);
}
}
driver.switchTo().window(parentWindow);
driver.navigate().refresh();
driver.findElement(By.id("//span[@class='a-size-medium a-color-base a-text-normal'])[16]"));
driver.findElement(By.id("(//span[@class='nav-line-2'])[3]"));}

@BeforeSuite
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
}
}

	
