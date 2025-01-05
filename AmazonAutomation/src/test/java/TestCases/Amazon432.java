package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseClass.Base;

public class Amazon432 extends Base {
WebDriver driver;
@BeforeMethod
public void initialization() throws Exception
{
driver=browserintialization("chrome");
driver.get("https://www.amazon.in/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
driver.findElement(By.id("nav-search-submit-button")).click();
driver.findElement(By.name("field-keywords")).clear();
}

@Test
public void tc01()
{
System.out.println("tc01");
}
}

