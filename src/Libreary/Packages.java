package Libreary;

import java.security.PublicKey;

import org.openqa.selenium.By;

import AppUtils.UtilsDemo;

public class Packages extends UtilsDemo
{
	
	public void Addpackage(String name,String lenth,String width,String height) 
	{
		
		/*driver.findElement(By.linkText("Packages")).click();
		driver.findElement(By.linkText("add")).click();
		
		driver.findElement(By.id("mat-input-1")).sendKeys(name);
		
		driver.findElement(By.id("mat-input-6")).clear();
		driver.findElement(By.id("mat-input-6")).sendKeys(lenth);
		
		driver.findElement(By.id("mat-input-7")).clear();
		driver.findElement(By.id("mat-input-7")).sendKeys(width);
		
		driver.findElement(By.id("mat-input-8")).clear();
		driver.findElement(By.id("mat-input-8")).sendKeys(height);
		
		
		driver.findElement(By.xpath("//mat-icon[@role='img']")).click();
		*/
		
		
		driver.findElement(By.xpath("(//span[@class='text-count-card'])[8]")).click();
		
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(name);
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys(lenth);
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(width);
		driver.findElement(By.xpath("(//input[@type='number'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@type='number'])[3]")).sendKeys(height);
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[14]")).click();
	}
		
		
	public boolean isPackageDisplayed() 
	{
		
		if(driver.findElement(By.xpath("//span[@class='padding list-text']")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	
	
	
	}
	}		
	


