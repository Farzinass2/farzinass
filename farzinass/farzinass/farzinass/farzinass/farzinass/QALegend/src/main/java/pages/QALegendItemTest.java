package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class QALegendItemTest {
	public WebDriver driver;
	private PageUtilities pageutilities;
	//input[@id='title']
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement additembutton;
	@FindBy(xpath="//input[@id='title']")
	WebElement additemTitle;
	@FindBy(xpath="//label[text()='Description']")
	WebElement additemdescription;
	@FindBy(xpath="//input[@id='item_rate']")
	WebElement additemRate;
	@FindBy(xpath="(//a[@class='edit'])[1]")
	WebElement edititembutton;
	@FindBy(xpath="(//a[@class='delete'])[1]")
	WebElement deletebutton;
	
	private String Description;
	private WebElement AddProjectButton;
	
	public  QALegendItemTest(WebDriver driver)
	{
		this.driver=driver;
		this.pageutilities=new PageUtilities(driver);
		PageFactory.initElements(driver, this);
		
	}
	public String addItem(String title,String description, String string) {
		pageutilities.enterTextOnWebElement(additemTitle, title);
		pageutilities.enterTextOnWebElement(additemdescription, description);
		pageutilities.ClickOnElement(AddProjectButton);
		pageutilities.enterKeyPress();
		return title;
	}

public void AddItemButton() {
	additembutton.click();
}

public void ClickOnEditItemButton() {
	edititembutton.click();
}
public void DeleteButton() {
	deletebutton.click();
}
public void clickAddItemButton() {
	// TODO Auto-generated method stub
	
}
public String getItemTitle() {
	// TODO Auto-generated method stub
	return null;
}
public void clickon_delete() {
	// TODO Auto-generated method stub
	
}


//public void searchItem(String item_title) {
//	// TODO Auto-generated method stub
//	
//}
//public String getItemTitle(String string, String string2, String string3) {
//	// TODO Auto-generated method stub
//	return null;
//}
//public String getItemTitle() {
//	// TODO Auto-generated method stub
//	return null;
//}
//public String getItemTitle(String string, String property, String string3) {
//	// TODO Auto-generated method stub
//	return null;
//}
//public void searchItem(String item_title) {
//	// TODO Auto-generated method stub
//	
//}
//public String getItemTitle() {
//	// TODO Auto-generated method stub
//	return null;
//}





}




