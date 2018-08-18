package DemoTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.SeleniumEasy.BaseTest.TestBase;

public class DemoTests extends TestBase{
	
	
	@BeforeTest
	private void setUp() {
		logger.info("===== Test Set up Start =====");
		getIt(null, null);//UtilConfig.getChrom(), UtilConfig.getHomeNavURL()
		navManue(null, null);//NavBarConfigaration.getNevInput_Forms(), NavBarConfigaration.getSimple_Form_Demon()
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
