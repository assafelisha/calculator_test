package com.ilad.calctest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

	public void onFinish(ITestContext arg0) {
		
	}

	public void onStart(ITestContext arg0) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("test "+arg0.getName()+" Test Failed !!!");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("test "+arg0.getName()+" Starting...");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("test "+arg0.getName()+" Finishing!");
		
	}

}
