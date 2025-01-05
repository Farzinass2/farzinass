package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Base1 {
public WebDriver driver;
public WebDriver browserinitialization(String browserName) throws Exception
{
if(browserName.equalsIgnoreCase("chrome"))
{
	driver=new ChromeDriver();
}
if(browserName.equalsIgnoreCase("firefox"))
{
	driver=new FirefoxDriver();
}
if(browserName.equalsIgnoreCase("edge"))
{
	driver=new EdgeDriver();
}
else
{
	throw new Exception("Invalid Exception");
}
return driver;
}
}
