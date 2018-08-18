package testsss;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;

import TestdataProFileConfig.TestDataConfig;
import test.SeleniumEasy.BaseTest.TestBase;
import test.SeleniumEasy.NavProConfig.NavBarConfigaration;
import test.SeleniumEasy.UtilProConfig.UtilConfig;

public class tests extends TestBase{
	@Test
	public static void main() {
		Calendar xDate =Calendar.getInstance();
		SimpleDateFormat xFormate = new SimpleDateFormat("MM-dd-YYYY_HH-mm-ss");
		String xDestin=System.setProperty("user.dir", null);
		
		System.out.println(xDestin);
		
	}

}
