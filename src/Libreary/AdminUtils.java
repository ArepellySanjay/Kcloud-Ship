package Libreary;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AppUtils.UtilsDemo;

public class AdminUtils extends UtilsDemo
{
	
	
//public static  Adminuid ="Kloudship.qa.automation@mailinator";
	//Adminpwd ="Password1";

   public static String Adminuid ="Kloudship.qa.automation@mailinator.com";
   public static  String Adminpwd ="Password1";
	
	Login_page lg;
	
	@BeforeTest
	public void Login()
	{
		
		 lg = new Login_page();
		lg.Login(Adminuid,Adminpwd);
		
		
	}
	@AfterTest
	public void logout() throws Throwable 
	{
		
		lg.Logout();
		
		
	}

}
