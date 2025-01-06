package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {
public void captureFailureScreenShot(WebDriver driver,String Name) throws IOException
{
	TakesScreenshot scrshot=(TakesScreenshot)driver;
	File screenshot =scrshot.getScreenshotAs(OutputType.FILE);
	File f1=new File(System.getProperty("user.dir")+"\\OutputScreenShots");
	if(!f1.exists())
	{
		f1.mkdirs();
	}
	File finaldestination=new File(System.getProperty("user.dir")+"\\\\OutputScreenShots\\"+Name+".png");
	org.openqa.selenium.io.FileHandler.copy(screenshot, finaldestination);
}
}


