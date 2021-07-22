package com.ECommerce.AddToCart;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class DemoListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" started", true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" successfully executed", true);
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+" failed", true);
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" skipped", true);
	}

	public void onStart(ITestContext context) {
		Reporter.log("Suite execution started", true);
	}

	public void onFinish(ITestContext context) {
		Reporter.log("Suite execution finished", true);
	}
	
	
	

}
