/**
 * 
 */
package test.SeleniumEasy.BaseTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;


/**
 * @author Ahammed Sorif
 *
 */
public class TestBase {
	protected static WebDriver Driver;
	public static final Logger logger = Logger.getLogger(TestBase.class.getName());
	@BeforeTest
	public void log4jConfig(){
		String log4jcon = System.getProperty("user.dir")+"//Properties//log4j.properties";
		PropertyConfigurator.configure(log4jcon);
		
	}


	private void LaunchBrowser(String Browser) {
		logger.info("");
		switch(Browser) {
		
		case "fireFox":
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Browser2//geckodriver.exe");
			Driver = new FirefoxDriver();
			logger.info("=====FirefoxBrowser is Launch=====");
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Browser//chromedriver.exe");
			Driver = new ChromeDriver();
			logger.info("=====ChromeBrowser is Launch=====");
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Browser//IEDriverServer.exe");
			Driver = new InternetExplorerDriver();
		
			logger.info("=====IE Browser is Launch=====");
			break;
		case "Opera":
			System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+"//Browser//operadriver.exe");
			Driver = new OperaDriver();
			
			logger.info("===== Opera Browser is Launch=====");
			break;
		default:
			System.out.println("Browser Lauching Have Problem");
			logger.info("=====Browser is not  Launch=====");
			break;
		}
		
	}
	
	private void getUrl(String URL) {
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.get(URL);
		logger.info("=====URL is Launch=====");
		
	}
	
	public void getIt(String Browser,String URL) {
		this.LaunchBrowser(Browser);
		this.getUrl(URL);
	}
	public void closeIt() {
		Driver.close();
		Driver = null;
	logger.info("=====Browser is Close=====");	
	}
	
	private void selectNevBar(String NevBarName) {
		String navBarPath ="//div[@id='navbar-brand-centered']/ul/li/a[contains(text(),'"+NevBarName+"')]";
		WebElement NavBar = Driver.findElement(By.xpath(navBarPath));
		NavBar.click();
		logger.info("===== Navigation Main Bar is Clicked =====");
	}
	private void selectManueBar(String ManBarName) {
		String manPath ="//div[@id='navbar-brand-centered']/ul/li/ul/li/a[contains(text(),'"+ManBarName+"')]";
		WebElement manBar = Driver.findElement(By.xpath(manPath));
		manBar.click();
		logger.info("===== Navigation ManuBar is Clicked ===== ");
	}
	public void navManue(String NavBarName,String ManBarName) {
		selectNevBar(NavBarName);
		selectManueBar(ManBarName);
	}
	
	public void takeScreenShoot(ITestResult result) {
		Calendar xDate = Calendar.getInstance();
		SimpleDateFormat xFormate = new SimpleDateFormat("mm-dd-yyyy_hh-mm-ss");
		String xDestin=System.getProperty("user.dir")+"//ScreenShot//";
		
		File sourceF =  ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		File DesTinF = new File((String) xDestin +" "+xFormate.format(xDate.getTime())+" "+result.getClass().getName()+".png");
		try {
			FileUtils.copyFile(sourceF, DesTinF);
			logger.info("===== Screen Shot is Taken =====");
			Reporter.log("<a href='"+DesTinF.getAbsolutePath()+"'><img src='"+DesTinF.getAbsolutePath()+"' height = '100' width='100'/></a>");
			logger.info("===== Screen Shot is Associate with report =====");
		} catch (IOException e) {
			logger.info("===== Taking Screen Shot have problem =====");
			e.printStackTrace();
		}
	}
	public String[][] getExData(String FileName,int SheetNumber) {
	String	xPath =System.getProperty("user.dir")+"//ScreenShot//"+FileName;
		
		ExcelConnector EC = new ExcelConnector(xPath);
	String[][] xData =	EC.getExcelData(SheetNumber);
	return xData;
	}

}
