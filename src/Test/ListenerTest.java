package Test;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

//ITestListener which implements TestNG listeners
public class ListenerTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("SUCCESS");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED, " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
