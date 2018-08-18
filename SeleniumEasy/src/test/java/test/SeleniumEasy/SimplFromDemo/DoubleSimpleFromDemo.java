package test.SeleniumEasy.SimplFromDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import test.SeleniumEasy.BaseTest.TestBase;

public class DoubleSimpleFromDemo extends TestBase{
	WebDriver Driver;
	@FindBy(how=How.XPATH, using="//input[@id='sum1']")
	WebElement firstTextField;
	@FindBy(how=How.XPATH,using="//input[@id='sum2']")
	WebElement secondField;
	@FindBy(how=How.XPATH,using="//form[@id='gettotal']//button[@class='btn btn-default']")
	WebElement button;
	@FindBy(how=How.XPATH,using="//span[@id='displayvalue']")
	WebElement getTotal;
	public DoubleSimpleFromDemo(WebDriver driver) {
		this.Driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	private void DoubleFormDemo(int firstNum,int secNum) {
		String xF = String.valueOf(firstNum);
		String xS = String.valueOf(secNum);
		firstTextField.clear();
		firstTextField.sendKeys(xF);
		secondField.clear();
		secondField.sendKeys(xS);
		logger.info("===== All data is inserted =====");
		button.click();
		
	}
	private void verifyTheAdding(int firstNum,int secNum) {
		String actual =getTotal.getText();
		try {
		int total =(firstNum+secNum);
		String xtotal =String.valueOf(total);
			
			Assert.assertEquals(actual, xtotal);
			logger.info("===== Booth Number is Equal =====");
		} catch (Exception e) {
			logger.info("===== Booth Number is not Equal =====");
			e.printStackTrace();
		}
	}
	
	public void FinalDoubleForm(int firstNum,int secNum) {
		DoubleFormDemo( firstNum, secNum);
		verifyTheAdding( firstNum, secNum);
	}
	
}
