package DemoTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.SeleniumEasy.BaseTest.TestBase;

public class DemoTests extends TestBase{
	
	
	@BeforeTest
	private void setUp() {
		System.out.println("Frist Branch - 44444");
		System.out.println("Frist Branch - 4444 ");
		System.out.println("Frist Branch - 4444 ");
		System.out.println("Frist Branch - 44444 ");
		System.out.println("Frist Branch - 44444");


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
