package com.pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAlignClass {
	
	public void CheckHeading(WebDriver driver)
	{
		String expHeading="stocks, forex"
				+ "aur crypto trade karen";
		String actHeading=driver.getTitle();
		if(expHeading.equals(actHeading))
			System.out.println("Heading on the page is: "+actHeading);
		else
			System.out.println("Incorrect heading on the page");	
	}
	public PageAlignClass(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
