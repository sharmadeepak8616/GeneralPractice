package module3;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LogReport_TestNGListener_Helper implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart for - "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess for - "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure for - "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped for - "+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage for - "+result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart for - "+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish for - "+context.getName());
		
	}

}
