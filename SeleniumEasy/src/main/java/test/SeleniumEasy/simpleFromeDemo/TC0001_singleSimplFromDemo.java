package test.SeleniumEasy.simpleFromeDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestdataProFileConfig.TestDataConfig;
import test.SeleniumEasy.BaseTest.TestBase;
import test.SeleniumEasy.NavProConfig.NavBarConfigaration;
import test.SeleniumEasy.SimplFromDemo.singleSimpeForm;
import test.SeleniumEasy.UtilProConfig.UtilConfig;

public class TC0001_singleSimplFromDemo extends TestBase {
	
	@BeforeTest
	private void setUp() {
		logger.info("===== Test Set Up Start =====");
		getIt(UtilConfig.getChrom(), UtilConfig.getHomeNavURL());
		navManue(NavBarConfigaration.getNevInput_Forms(), NavBarConfigaration.getSimple_Form_Demon());
	}
	
	@Test
	private void DemoTest() {
		singleSimpeForm SSF = new singleSimpeForm(Driver);
		SSF.singelTextFinal(TestDataConfig.getSingleDemoTextMassage());
	}
	
	@AfterTest
	private void endTest() {
		closeIt();
		logger.info("===== Test End =====");
	}
	
}
