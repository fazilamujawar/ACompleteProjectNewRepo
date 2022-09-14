package com.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	
	public WebDriver driver;
	
	public void chromeSetup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Soft stuff\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public void UrlOpen()
	{
		driver.get("https://login.iqoption.com/en/login");
		driver.manage().window().maximize();
	}
}
