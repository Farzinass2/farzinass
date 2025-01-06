package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendAddProject {
public WebDriver driver;
private PageUtilities pageUtilities;
@FindBy(xpath="//a[@class='btn btn-default']")
WebElement AddProjectButton;
@FindBy(id="title")
WebElement Title;
@FindBy(id="select2-drop-mask")
WebElement Client;
@FindBy(id="description")
WebElement Description;
@FindBy(xpath="//input[@id='deadline']")
WebElement DeadLine;
@FindBy(xpath="//button[@class='btn btn-primary']")
WebElement Save;
@FindBy(xpath="//span[@class='fa fa-close']")
WebElement Close;
public Object title_addProject;
public QALegendAddProject(WebDriver driver) {
	this.driver=driver;
	this.pageUtilities=new PageUtilities(driver);
	PageFactory.initElements(driver, this);

}
public void AddProject1(String title,String description) {
	pageUtilities.enterTextOnWebElement(Title, title);
	pageUtilities.enterTextOnWebElement(Description, description);
	pageUtilities.ClickOnElement(AddProjectButton);
	pageUtilities.enterKeyPress();
	return;
}
public void searchItem1(String title_addProject) {
	// TODO Auto-generated method stub
	
}
public String AddProject(String string, String property) {
	// TODO Auto-generated method stub
	return null;
}
public void searchItem(String title_addProject) {
	// TODO Auto-generated method stub
	
}
public String addProject(String string, String property, String property2, String string2) {
	// TODO Auto-generated method stub
	return null;
}
	



	
}

