package TestCases;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.awt.Window;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import BaseClass.Base;
public class Amazon000 extends Base {
    WebDriver driver;
	@BeforeMethod
	@Parameters({"browser"}) // parameter method nerathe aanel ithu venda 
public void initialization(String browsername) throws Exception // added string browsername for access for class into the method
	{
	      //System.out.println("before Method");
			driver = browserintialization(browsername); // add the browsername here connecting the base class
			driver.get("https://www.amazon.in/");
			//driver.get("https://www.flipkart.com/");
			//driver.get("https://www.meesho.com/");
			//driver.manage().window().maximize();
		}
	@Test
	public void TC01() throws InterruptedException {
		String value = driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
		System.out.println(value);
		String value1 = driver.findElement(By.name("field-keywords")).getAttribute("placeholder");
		System.out.println(value1);
	}
		//findelemets
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart TV");
		//driver.findElement(By.id("nav-search-submit-button")).click(); //checkbox codes
		
		/*List<WebElement> products = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		 * 
		System.out.println(products.size());*/ //collections nokanom 
		
		
		/*code for checkbox 
		driver.findElement(By.xpath("//span[text()='Samsung']//preceding::div[contains(@class,'checkbox')]")).click();*/
		
		/*boolean code
		driver.findElement(By.xpath("//div[text()='EN']")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-radio'])[6]")).click();*/
		
		
		
		//Dropdown
		
		
		/*WebElement Dropdown = driver.findElement(By.id("s-result-sort-select"));
		Select drp = new Select(Dropdown);
		drp.selectByValue("review-rank");
		driver.findElement(By.xpath("//h2[text()='Results']")).click();
		drp.selectByVisibleText("Price: Low to High");
		drp.selectByIndex(0);
		driver.navigate().to("https://www.makemytrip.com/"); //navigate to makemy trip
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Chennai") //input
		driver.findElement(By.xpath("//div[@class='makeFlex column flexOne appendRight10'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Mumbai'][1]")).click();*/
		
		
		//amazon
		//driver.findElement(By.id("twotasearchtextbox")).sendKeys("iphone");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.id("twotabsearchtextbox")).clear();
		//driver.findElement(By.name("field-keywords")).sendKeys("Brush");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Smart Tv");
		//driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
		
		//flipkart
		//driver.findElement(By.xpath("//input[contains(@class,'Pke_EE')]")).sendKeys("Tv");
		//driver.findElement(By.xpath("//button[starts-with(@class,'_2')]")).click();
		//driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Bottle");
		//driver.findElement(By.xpath("//button[starts-with(@type,'s')]")).click();
		//driver.findElement(By.xpath("//input[starts-with(@title,'Search for')]")).sendKeys("Tv");
		//driver.findElement(By.xpath("//button[contains(@class,'_2iLD__')]")).click();
		//driver.findElement(By.xpath("//img[contains(@class,'-dOa_b L_FVxe')]")).click();
		//driver.findElement(By.xpath("//img[starts-with(@class,'-dOa_b L_FVxe')]")).click();
		//driver.findElement(By.xpath("//img[contains(@alt,'Cart')]")).click();
		//driver.findElement(By.xpath("//img[starts-with(@alt,'Ca')]")).click();
		//driver.findElement(By.xpath("//img[starts-with(@alt,'Ca')]")).click();
		//driver.findElement(By.xpath("//input[@font-size='16px'and@placeholder='Try Saree, Kurti or Search by Product Code']")).sendKeys("TV");
		//driver.findElement(By.xpath("//input[@font-size='16px'and@placeholder='Try Saree, Kurti or Search by Product Code']")).sendKeys("watch");
		//driver.findElement(By.xpath("//a[text()='Men']")).click();
		
		
		//Alert Handling
		
		/*driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12323");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();"
		String Alertmessage = driver.switchTo().alert().getText();
		System.out.println(Alertmessage);*/
		
		
		
		//driver.findElement(By.className("a-button-input"));
		
		
		//driver.findElement(By.linkText("Conditions of Use"));//locators using link
		//driver.findElement(By.partialLinkText("Conditions"));// locators using partial link
		//System.out.println("TC01");
		

	@Test()
	public void TC02() throws InterruptedException {
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to("https://www.ajio.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("TC02");
	}
		
	/*Actions Class
		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.id("column-a"));
		WebElement destination = driver.findElement(By.id("column-b"));
		//actions.dragAndDrop(source, destination).build().perform();	
		//actions.doubleClick(driver.findElement(By.xpath("//a[text()='Elemental Selenium']"))).build().perform();
		//actions.contextClick().build().perform();
		driver.navigate().to("https://www.amazon.in/");
		actions.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();*/


		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart TV");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement dropDown = driver.findElement(By.id("s-result-sort-select"));
		Select drp = new Select(dropDown);
		drp.selectByValue("review-rank");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();//just to click
		//action.sendKeys(Keys.CONTROL).build().perform();
	//action.keyDown(Keys.CONTROL);//to click and hold
	//action.keyUp(Keys.CONTROL);// release hold key
	//action.build().perform();*/


	
//Handling Multiple Windows	
		
		/*driver.findElement(By.xpath("//span[@class = 'a-size-medium a-color-base a-text-normal']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for(String actual:childWindow) {
			if(!actual.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(actual);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.findElement(By.name("submit.add-to-cart")).click();
				Thread.sleep(2000);
			}
		}
		driver.switchTo().window(parentWindow);
		driver.navigate().refresh();
		
		
		
	}*/
	
	@Test
	public void TC03() throws InterruptedException {
		
		
		
		//Alert handling
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12323");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		String Alertmessage = driver.switchTo().alert().getText();
		System.out.println(Alertmessage);
		
		/*driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.id("column-a"));
		WebElement destination = driver.findElement(By.id("column-b"));
		//actions.dragAndDrop(source, destination).build().perform();
		//actions.doubleClick(driver.findElement(By.xpath("//a[text()='Elemental Selenium']"))).build().perform();
		actions.contextClick().build().perform();*/
		
	}

	@Test(priority = 1)
	public void TC04() throws InterruptedException {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart Tv");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();	
		
		String parentWindow = driver.getWindowHandle();       // finding parent tab address
		Set<String> childWindow = driver.getWindowHandles();  // here there is many address of tabs, so convert string type to set
		for(String actual:childWindow) {                      // looping child window
			if(!actual.equalsIgnoreCase(parentWindow)) {      // check if parent and child window names are different
				driver.switchTo().window(actual);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				//using java js method to scroll
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,250)");
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5)); // DOUBT 
				WebElement addtocartbutton = driver.findElement(By.id("add-to-cart-button"));
				Thread.sleep(2000);
			}
		}
		driver.switchTo().window(parentWindow);              // switch back to parent window
		driver.navigate().refresh();                         // refresh page
	
	}
	
	@Test
	public void TC05() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3)); 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("AC");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath(("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"))).click();
		String FirstW = driver.getWindowHandle(); //String object created to store the details of the parent window
		Set<String> SecondW = driver.getWindowHandles();// A set with string variables is placed in order o store the various child windows 
		for(String actual : SecondW) { // loop to move through the parent to child windows 
			if (!actual.equalsIgnoreCase(FirstW)) { // if the selected child window is not similar to parent one then 
				driver.switchTo().window(actual);
				driver.manage().window().maximize();
				driver.manage().window().minimize();
		
				JavascriptExecutor J1 = (JavascriptExecutor) driver;
				J1.executeScript("window.scrollBy(0,250)");
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("add-to-cart-button")))); // wait ingane aanu 
			
				driver.findElement(By.id("add-to-cart-button")).click(); 
				
			}
				
		}
		
		driver.switchTo().window(FirstW);
		driver.navigate().refresh();

		driver.findElement(By.id("nav-cart-count-container")).click();
	}
	
	
	/*@BeforeSuite
	public void beforeSuiteMethodEx() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuiteMethodEx() {
		System.out.println("After Suite");
	}
	@BeforeTest 
	public void BeforeTestMethodEx() {
		System.out.println("Br=efore Test");
	}
	
	@AfterTest
	public void afterTestMethodEx() {
	System.out.println("After Test");
	}


//oct29
@AfterMethod
public void teardown() {
	
	driver.quit();
	System.out.println("AfterMethod Example"); //for closing the methods
}
	
@BeforeClass
public void beforeClassExample() {
	System.out.println("Beforeclass");
}
@AfterClass
public void afterClassExample() {
	System.out.println("After class");
}*/


}



