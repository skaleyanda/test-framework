package org.test.core;

import org.openqa.selenium.WebDriver;

public class SeleniumWebDriver implements SeleniumDriver {
	
	private WebDriver webdriver;
	
	SeleniumWebDriver(final WebDriver driver) {
		this.webdriver = driver;
	}
	
	public WebDriver getWebDriver() {
		return webdriver;
	}

}
