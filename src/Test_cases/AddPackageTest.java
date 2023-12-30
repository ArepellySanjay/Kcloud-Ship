package Test_cases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Libreary.AdminUtils;
import Libreary.Packages;

public class AddPackageTest extends AdminUtils
{

	@Test
	public void packages() 
	{
  
		
		Packages ps = new Packages();
	   ps.Addpackage("Lastname", "3", "5", "2");
	 boolean res=  ps.isPackageDisplayed();
	  Assert.assertTrue(res);	
	 
	 //ps.Addpackage(url, Adminuid, Adminpwd, url);
	
	
	}
	
	
		
	
	
	
}
