package TestdataProFileConfig;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import test.SeleniumEasy.BaseTest.TestBase;

public class TestDataConfig extends TestBase{
	static Properties property;
	private static String TextMassage;

	private static void loadTestData() {
		property =new Properties();
		File fTestData = new File(System.getProperty("user.dir")+"//Properties//TestData.properties");
		
		try {
			FileReader fRead = new FileReader(fTestData);
			property.load(fRead);
		} catch (Exception e) {
			logger.info("===== TestData File Connection have Problem =====");
			e.printStackTrace();
		}
	}
	
	
	public static final String getSingleDemoTextMassage() {
		setTextMassage();
		return TextMassage;
	}

	private static final void setTextMassage() {
		loadTestData();
		TextMassage = property.getProperty("TextMassage");
	}

}
