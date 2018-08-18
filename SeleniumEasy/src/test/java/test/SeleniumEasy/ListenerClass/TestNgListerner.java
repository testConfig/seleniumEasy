package test.SeleniumEasy.ListenerClass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import test.SeleniumEasy.BaseTest.TestBase;

public class TestNgListerner extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("===== Test Start =====");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("===== Test Success ====");
		takeScreenShoot(result);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("===== Test is Fail =====");
		//takeScreenShoot(result);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("===== Test is Skiped =====");
		takeScreenShoot(result);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		logger.info("===== Test is FailedButWithinSuccessPercentage =====");
		takeScreenShoot(result);
	}

	@Override
	public void onStart(ITestContext result) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
