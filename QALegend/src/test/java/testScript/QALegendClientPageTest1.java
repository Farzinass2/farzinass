package testScript;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.FakerUtility;
public class QALegendClientPageTest1 extends Base {
		public WebDriver driver;
		private byte[] companyname;

		
	@Test
	public void addClient(String companyname) throws InterruptedException{
				
		loginpage.loginToQALegend(properties.getProperty("username"), properties.getProperty("password")); 
		 clientpage.clickAddClientButton();		
	          
		String client_companyname = clientpage.addClient(properties.getProperty("client_companyname") + FakerUtility.randomNumberGenerator(), 
						properties.getProperty("client_city")+FakerUtility.randomNumberGenerator(),
							properties.getProperty("client_state")+FakerUtility.randomNumberGenerator() ,
						properties.getProperty("client_zip") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_country")+ FakerUtility.randomNumberGenerator(),properties.getProperty("client_phone") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_website") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_vatnumber") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_clientgroups") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_currency") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_currencysymbol") + FakerUtility.randomNumberGenerator()); 		
		Thread.sleep(4000);
		Assert.assertEquals(clientpage.getClientCompanyName(), companyname);     
	}
	@Test
		
	public void editClient() throws InterruptedException
	{
		loginpage.loginToQALegend(properties.getProperty("username"), properties.getProperty("password")); 
		clientpage.clickEditClientButton();
		String client_companyname = clientpage.addClient(properties.getProperty("client_companyname") + FakerUtility.randomNumberGenerator(), 
				properties.getProperty("client_city")+FakerUtility.randomNumberGenerator(),
					properties.getProperty("client_state")+FakerUtility.randomNumberGenerator() ,
				properties.getProperty("client_zip") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_country")+ FakerUtility.randomNumberGenerator(),properties.getProperty("client_phone") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_website") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_vatnumber") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_clientgroups") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_currency") + FakerUtility.randomNumberGenerator(),properties.getProperty("client_currencysymbol") + FakerUtility.randomNumberGenerator()); 		
Thread.sleep(4000);
Assert.assertEquals(clientpage.getClientCompanyName(), companyname);     
}
	@Test
	public void deleteClient() throws InterruptedException
	{
		loginpage.loginToQALegend(properties.getProperty("username"),properties.getProperty("password"));
        notepage.clickon_delete();
        Thread.sleep(4000);
        Assert.assertEquals(notepage.getNoteTitle(),true);
        
        
	}
	
}




	

