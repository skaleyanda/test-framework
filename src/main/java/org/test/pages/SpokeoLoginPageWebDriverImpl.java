package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.test.core.SeleniumWebDriver;

public class SpokeoLoginPageWebDriverImpl implements SpokeoLoginPage {

private WebDriver webDriver;
	
	public SpokeoLoginPageWebDriverImpl(final SeleniumWebDriver driver) {
		webDriver = driver.getWebDriver();
	}
	
	public void enterEmail(final String emailId) {
		this.webDriver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(emailId);
	}
	
	public void enterPassword(final String password) {
		this.webDriver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}
	
	public void clickLogin() {
		this.webDriver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	public void clickOnForgotPassword() {
		
		
	}
}
