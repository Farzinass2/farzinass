package testScript;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Constants.Constants;
import Utilities.ExcelUtility;
import Utilities.FakerUtility;
public class QALegendClientPageTest1 extends Base {
		public WebDriver driver;
		private byte[] companyname;

		
	@Test
	public void addClient(String companyname) throws InterruptedException, IOException{
				
		loginpage.loginToQALegend(properties.getProperty("username"), properties.getProperty("password"));
		homepage.clickOnHomePageClientButton();
		 clientpage.clickAddClientButton();	
		 String add_client_companyname=ExcelUtility.getStringData(1,0,Constants.EXCELFILEPATH1,"sheet4");
			String add_client_companyaddress=ExcelUtility.getStringData(1, 1,Constants.EXCELFILEPATH1,"sheet4");
			
			String add_client_city=ExcelUtility.getStringData(1,2,Constants.EXCELFILEPATH1,"sheet4");
			String add_client_state=ExcelUtility.getStringData(1,3,Constants.EXCELFILEPATH1,"sheet4");
			String add_client_zip=ExcelUtility.getStringData(1,4,Constants.EXCELFILEPATH1,"sheet4");
			clientpage.addClient(add_client_companyname, add_client_companyaddress, add_client_city, add_client_state, add_client_zip);
	          
		//String client_companyname = clientpage.addClient(properties.getProperty("client_companyname") + FakerUtility.randomNumberGenerator(), 
						//properties.getProperty("client_city")+FakerUtility.randomNumberGenerator(),
							//properties.getProperty("client_state")+FakerUtility.randomNumberGenerator() ,
						//properties.getProperty("client_zip") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_country")+ FakerUtility.randomNumberGenerator(),properties.getProperty("client_phone") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_website") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_vatnumber") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_clientgroups") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_currency") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_currencysymbol") + FakerUtility.randomNumberGenerator()); 		
		//Thread.sleep(4000);
		Assert.assertEquals(clientpage.getClientCompanyName(), companyname);     
	}
	@Test
		
	public void editClient() throws InterruptedException, IOException
	{
		loginpage.loginToQALegend(properties.getProperty("username"), properties.getProperty("password")); 
		clientpage.clickEditClientButton();
		String edit_client_companyname=ExcelUtility.getStringData(1,0,Constants.EXCELFILEPATH1,"sheet4")+FakerUtility.randomNumberGenerator();
		String edit_client_companyaddress=ExcelUtility.getStringData(1, 1,Constants.EXCELFILEPATH1,"sheet4")+FakerUtility.randomNumberGenerator();
		
		String edit_client_city=ExcelUtility.getStringData(1,2,Constants.EXCELFILEPATH1,"sheet4")+FakerUtility.randomNumberGenerator();
		String edit_client_state=ExcelUtility.getStringData(1,3,Constants.EXCELFILEPATH1,"sheet4")+FakerUtility.randomNumberGenerator();
		String edit_client_zip=ExcelUtility.getStringData(1,4,Constants.EXCELFILEPATH1,"sheet4")+FakerUtility.randomNumberGenerator();
		//String client_companyname = clientpage.addClient(properties.getProperty("client_companyname") + FakerUtility.randomNumberGenerator(), 
				//properties.getProperty("client_city")+FakerUtility.randomNumberGenerator(),
					//properties.getProperty("client_state")+FakerUtility.randomNumberGenerator() ,
				//properties.getProperty("client_zip") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_country")+ FakerUtility.randomNumberGenerator(),properties.getProperty("client_phone") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_website") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_vatnumber") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_clientgroups") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_currency") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_currencysymbol") + FakerUtility.randomNumberGenerator()); 		
Thread.sleep(4000);
Assert.assertEquals(clientpage.getClientCompanyName(), companyname);     
}
	@Test
	public void deleteClient() throws InterruptedException
	{
		loginpage.loginToQALegend(properties.getProperty("username"),properties.getProperty("password"));
        clientpage.clickon_delete();
        Thread.sleep(4000);
        Assert.assertEquals(clientpage.getNoteTitle(),true);
        
        
	}
	
}




	

