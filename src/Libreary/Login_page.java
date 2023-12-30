package Libreary;

import org.openqa.selenium.By;

import AppUtils.UtilsDemo;

public class Login_page extends UtilsDemo
{

 public void Login(String uid,String pwd) 
 {
	 
	driver.findElement(By.id("login-email")).sendKeys(uid);
	driver.findElement(By.id("login-password")).sendKeys(pwd);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}	

 
 public void Logout() throws Throwable 
 {
	 
	 driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[11]")).click();
	Thread.sleep(2000);
	 driver.findElement(By.xpath("(//button[@role='menuitem'])[8]")).click();
	 
	 
	 
	
}
 
 public boolean isAdminDisplayed()
 {
	
	 if(driver.findElement(By.xpath("//mat-chip[@role='option']")).isDisplayed())
	 {
		 return true;
	 }else
	 {
		 return false;
	 }
	 
	 
}
 
 public boolean isErrMesgDisplyed() 
 {
	
	 String errmsg;
	 errmsg = driver.findElement(By.className("error-message")).getText();
	 if(errmsg.toLowerCase().contains("invalid"))
	 {
		 return true;
	 }else
	 {
		 return false;
	 }
	 
	 
	 
	 
}
 
 
	
}
