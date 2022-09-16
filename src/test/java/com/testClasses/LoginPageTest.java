package com.testClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.pomClasses.LoginPage;
import com.pomClasses.PageAlignClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utility.CaptureWindow;

public class LoginPageTest extends CaptureWindow{
	
	LoginPage obj1;
	PageAlignClass obj2;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeClass
	public void UrlSetup()
	{
		chromeSetup();
	}
	@BeforeMethod
	public void OpenUrl()
	{
		UrlOpen();
	}
	@Test
	public void LoginTest() throws EncryptedDocumentException, IOException
	{
		report=new ExtentReports("Test1.dir"+"\\LoginExtentReport.html");
		test=report.startTest("Login Test");
		obj1= new LoginPage(driver);
		obj1.logoCheck();
		test.log(LogStatus.INFO, "Logo Checked");
		test.log(LogStatus.INFO, "Entered User name ");
		obj1.UName(getDataFromExcel(1,0));
		test.log(LogStatus.INFO, "Entered Password ");
		obj1.Paswd(getDataFromExcel(1,1));
		test.log(LogStatus.INFO, "Click on login button");
		obj1.Login();
		test.log(LogStatus.PASS, "Test One passed");
		test.log(LogStatus.PASS, test.addScreenCapture(Capture1(driver)));
	}
	@Test
	public void PageAlign() throws IOException, InterruptedException
	{
		report=new ExtentReports("Test1.dir"+"\\PageAlignExtentReport.html");
		test=report.startTest("Page Alignment Test");
		obj2=new PageAlignClass(driver);
		test.log(LogStatus.INFO, "Checking the Title of the page");
		obj2.CheckHeading(driver);
		test.log(LogStatus.PASS, "Title is get checked");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, test.addScreenCapture(Capture1(driver)));
	}
	@AfterMethod
	public void GarbageClean()
	{
		report.endTest(test);
		report.flush();
		obj1=null;
	}
	@AfterClass
	public void CloseUrl()
	{
		//driver.close();
	}
}
