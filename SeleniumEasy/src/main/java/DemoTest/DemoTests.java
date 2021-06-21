package DemoTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.SeleniumEasy.BaseTest.TestBase;

public class DemoTests extends TestBase{
	
	
	@BeforeTest
	private void setUp() {
		System.out.println("Second Project Main add something");
		System.out.println("Second Project Main");
		System.out.println("Second Project Main");
		System.out.println("Second Project Main");
		System.out.println("Second Project Main add something");


		System.out.println("Second Project Main");
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
