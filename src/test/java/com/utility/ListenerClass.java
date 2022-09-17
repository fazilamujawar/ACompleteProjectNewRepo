package com.utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

	public class ListenerClass implements ITestListener {
	
	CaptureWindow cw=new CaptureWindow();
	
	public void onTestStart(ITestResult result) 
	{	
		System.out.println("Test started");
	}

	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test passed successfully");
	}

	public void onTestFailure(ITestResult result,WebDriver driver) throws IOException
	{
		cw.Capture1(driver);
	}

	/*public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout");
	}

	public void onStart(ITestContext context) {
		System.out.println("Test starts");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test finish");
	}*/

}
