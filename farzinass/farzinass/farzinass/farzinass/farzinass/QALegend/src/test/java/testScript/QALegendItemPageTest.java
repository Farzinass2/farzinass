package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.FakerUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class QALegendItemPageTest extends Base {
		public WebDriver driver;
		private String item_title;
		
		@Test
		public void addItem() throws InterruptedException {
			// pass email and pswd stored in ppty file
			loginpage.loginToQALegend(properties.getProperty("username"), properties.getProperty("password"));  	
			itempage.clickAddItemButton();
			
               // clk Add item btn
			String item_title = itempage.addItem(properties.getProperty("item_title") + FakerUtility.randomNumberGenerator(), 
					properties.getProperty("item_description") + FakerUtility.randomNumberGenerator(),properties.getProperty("item_Unit_type") + FakerUtility.randomNumberGenerator()+  properties.getProperty("item_rate") + FakerUtility.randomNumberGenerator()); 
//			//pass values to item form to add new item
//			
		Thread.sleep(4000);
//		
//			itemspage.searchItem(item_title);
		Assert.assertEquals(itempage.getItemTitle(), item_title);                                            //for assertion compare 2 string values, title passed from testdata and value fetchd from added item title
		}
		@Test
		public void editItem() throws InterruptedException
		{
			loginpage.loginToQALegend(properties.getProperty("username"), properties.getProperty("password"));  	
			itempage.ClickOnEditItemButton();
			String item_title = itempage.addItem(properties.getProperty("item_title") + FakerUtility.randomNumberGenerator(), 
					properties.getProperty("item_description") + FakerUtility.randomNumberGenerator(),properties.getProperty("item_Unit_type") + FakerUtility.randomNumberGenerator()+  properties.getProperty("item_rate") + FakerUtility.randomNumberGenerator()); 
//			//pass values to item form to add new item
//			
		Thread.sleep(4000);
//		
//			itemspage.searchItem(item_title);
		Assert.assertEquals(itempage.getItemTitle(), item_title);                                            //for assertion compare 2 string values, title passed from testdata and value fetchd from added item title
		}
		@Test
		public void deleteItem() throws InterruptedException
		{
			loginpage.loginToQALegend(properties.getProperty("username"),properties.getProperty("password"));
	        itempage.clickon_delete();
	        Thread.sleep(4000);
	        Assert.assertEquals(itempage.getItemTitle(), item_title);                                            //for assertion compare 2 string values, title passed from testdata and value fetchd from added item title
			
		}
			
			
		}
		


