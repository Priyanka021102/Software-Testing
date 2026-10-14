package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//in hard assertion program this is implemented

public class Itestlistener implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("SUCCESS");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILURE");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("STARTED");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("FINISHED");
	}

}
