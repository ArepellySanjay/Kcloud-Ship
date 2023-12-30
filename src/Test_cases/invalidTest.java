package Test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import AppUtils.UtilsDemo;
import Libreary.AdminUtils;
import Libreary.Login_page;

public class invalidTest extends UtilsDemo
{

	@Test
	public void invalid() 
	{
	
		
     Login_page lp = new Login_page();
     lp.Login("sanju", "1245");
     
    boolean res = lp.isErrMesgDisplyed();
		
	Assert.assertTrue(res);
    
	}
	
	
	
	
}
