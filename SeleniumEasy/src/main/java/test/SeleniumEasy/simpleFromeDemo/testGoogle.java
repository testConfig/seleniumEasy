package test.SeleniumEasy.simpleFromeDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import test.SeleniumEasy.BaseTest.TestBase;

public class testGoogle extends TestBase {
	@Test
	void google() {
		getIt("IE", "http://www.google.com");
		Driver.findElement(By.cssSelector("#gs_htif0")).sendKeys("Hello Wrold");
	}

}
