package test.SeleniumEasy.simpleFromeDemo;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.SeleniumEasy.BaseTest.TestBase;
import test.SeleniumEasy.NavProConfig.NavBarConfigaration;
import test.SeleniumEasy.SimplFromDemo.DoubleSimpleFromDemo;
import test.SeleniumEasy.UtilProConfig.UtilConfig;


public class TC002_DoubleSimpleFromDemo  extends TestBase{
	Logger logger = Logger.getLogger(TC002_DoubleSimpleFromDemo.this.getClass());

	@BeforeTest
	private void setUp() {
		logger.info("===== Test Set up Start =====");
		getIt(UtilConfig.getChrom(), UtilConfig.getHomeNavURL());//UtilConfig.getChrom(), UtilConfig.getHomeNavURL()
		navManue(NavBarConfigaration.getNevInput_Forms(), NavBarConfigaration.getSimple_Form_Demon());//NavBarConfigaration.getNevInput_Forms(), NavBarConfigaration.getSimple_Form_Demon()
	}
	
	@Test
	private void DemoTest() {
		DoubleSimpleFromDemo DSFD =new DoubleSimpleFromDemo(Driver);
		DSFD.FinalDoubleForm(34, 12);
		
	}
	
	@AfterTest
	private void endTest() {
		closeIt();
		logger.info("===== Test End =====");
	}

}
