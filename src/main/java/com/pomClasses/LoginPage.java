package com.pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//a[@data-test-id='header-logo-link']") private WebElement logo;
	@FindBy(xpath="//input[@type='text']") private WebElement username;
	@FindBy(xpath="//input[@type='password']") private WebElement password;
	@FindBy(xpath="//button[@data-test-id='login-submit-button']") private WebElement loginButton;
	
	public void logoCheck()
	{
		boolean res=logo.isDisplayed();
		if(res==true)
		{
			System.out.println("Logo displayed successfully.");
		}
		else
		{
			System.out.println("Logo is not display.");
		}
	}
	public void UName(String u)
	{
		username.sendKeys(u);
	}
	public void Paswd(String p)
	{
		password.sendKeys(p);
	}
	public void Login()
	{
		loginButton.click();
	}
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
