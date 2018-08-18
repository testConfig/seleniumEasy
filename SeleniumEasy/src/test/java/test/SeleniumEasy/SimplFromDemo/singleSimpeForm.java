package test.SeleniumEasy.SimplFromDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import test.SeleniumEasy.BaseTest.TestBase;

public class singleSimpeForm extends TestBase {
	WebDriver Driver;
	@FindBy(xpath="//div[@class='form-group']//input[@id='user-message']")
	WebElement inputBox;
	@FindBy(how=How.XPATH,using="//form[@id='get-input']/button")
	WebElement showMassButton;
	@FindBy(how=How.XPATH, using="//div[@id='user-message']//span[@id='display']")
	WebElement getMassage;
	public singleSimpeForm(WebDriver Driver){
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
	}
	
	private void enterMessage(String massage) {
		inputBox.sendKeys(massage);
		showMassButton.click();	
	}
	private void checkMassage(String massage) {
		String actualMassage =getMassage.getText();
		if(actualMassage.equals(actualMassage)) {
			logger.info("===== Booth Have Same Text =====");
		}
		else
		{
			logger.info("===== Booth massage doesn't match =====");
		}
		
	}
	public void singelTextFinal(String massage) {
		
		enterMessage(massage);
		checkMassage(massage);
	}
}
