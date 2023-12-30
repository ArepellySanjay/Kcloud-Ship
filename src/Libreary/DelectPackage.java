package Libreary;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import AppUtils.UtilsDemo;

public class DelectPackage extends UtilsDemo
{
      
	public void Dltpackage() 
	{
		driver.findElement(By.xpath("(//mat-card[@class='mat-card mat-focus-indicator count-card'])[7]")).click();
		
		Actions act = new Actions(driver);   //(driver.findElement(By.xpath("(//mat-icon[text()='delete'])[3]")));
		act.moveToElement(driver.findElement(By.xpath("(//mat-icon[text()='delete'])[3]")));
		act.build().perform();
		
		driver.findElement(By.xpath("(//mat-icon[text()='delete'])[3]")).click();
		
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[15]")).click();
		
		//span[text()=' Delete Package Type']
	
	     
	}
	
	
}
