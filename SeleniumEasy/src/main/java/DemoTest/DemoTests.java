package DemoTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.SeleniumEasy.BaseTest.TestBase;

public class DemoTests extends TestBase{
	
	
	@BeforeTest
	private void setUp() {
		System.out.println("Second Project support");
		System.out.println("Second Project support");
		System.out.println("Second Project support");
		System.out.println("Second Project support");
		System.out.println("Second Project support");


		System.out.println("Second Project support");
	}
	
	@Test
	private void DemoTest() {
		
	}
	
	@AfterTest
	private void endTest() {
		closeIt();
		logger.info("===== Test End =====");
	}
	

}
