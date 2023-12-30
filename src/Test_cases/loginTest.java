package Test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import AppUtils.UtilsDemo;
import Libreary.AdminUtils;
import Libreary.Login_page;


public class loginTest extends UtilsDemo
{
	
	@Test
	public void CheckAdminLogin() 
	{
		
		Login_page lp = new Login_page();
		lp.Login("Kloudship.qa.automation@mailinator.com", "Password1");
		
	boolean res =	lp.isAdminDisplayed();
	   
	 Assert.assertTrue(res);
	//lp.Logout();
	
	}
    
	
	
	
	
	
}
