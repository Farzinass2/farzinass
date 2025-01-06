package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ExcelUtility;
import Utilities.FakerUtility;

public class QALegendAddProjectTest extends Base {
	public WebDriver driver;
	@Test
	public void addProject()
	{
		loginpage.loginToQALegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickonHomeProjectButton();
		projectpage.clickonAddProjectButton();
		String addProject_title=ExcelUtility.getStringData(1,0,"Project")+FakerUtility.randomNumberGenerator();
		String addProject_description=ExcelUtility.getStringData(1, 1, "Project")+FakerUtility.randomNumberGenerator();
		projectpage.addproject(addProject_title, addProject_description);
		Assert.assertEquals(projectpage.addProjectSaveButtonStatusChecker(),true);
		
	}

}
