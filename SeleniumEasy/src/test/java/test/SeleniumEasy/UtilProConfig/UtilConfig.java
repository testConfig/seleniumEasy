package test.SeleniumEasy.UtilProConfig;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.apache.log4j.Logger;

public class UtilConfig {
	
		static Logger logger = Logger.getLogger(UtilConfig.class.getName());
			private static  String HomeNav;
			private static String Firefox;
			private static  String Chrom ;
			private static String IE;
			private static String Opera;
			static Properties property;
			
			private static void loadUtilConfig()
			{
				property = new Properties();
				File proFile = new File(System.getProperty("user.dir")+"//Properties//UtilityFile.properties");
				try {
					FileReader fread = new FileReader(proFile);
					property.load(fread);
				} catch (Exception e) {
					logger.warn("====Util property Connection have problem ====="+e.getMessage());
				}
				
				
			}
			
			
			static public final String getHomeNavURL() {
				setHomeNav();
				return HomeNav;
			}
			private final static void setHomeNav() {
				loadUtilConfig();
				HomeNav = property.getProperty("HomeURL");
				
			}
			
			
			static public final String getFirefox() {
				setFirefox();
				return Firefox;
			}
			private final static void setFirefox() {
				loadUtilConfig();
				Firefox = property.getProperty("Firefox");
			}
			static public final String getChrom() {
				setChrom();
				return Chrom;
			}
			private final static void setChrom() {
				loadUtilConfig();
				Chrom =property.getProperty("Chrom");
			}
			static public final String getIE() {
				setIE();
				return IE;
			}
			private final static void setIE() {
				loadUtilConfig();
				IE = property.getProperty("IE");
			}
			static public final String getOpera() {
				setOpera();
				return Opera;
			}
			private final static void setOpera() {
				loadUtilConfig();
				Opera = property.getProperty("Opera");
			}

}
