package org.test.core;

public abstract class WebBrowser implements DeskTop, Phone, Tablet {
	
	protected SeleniumWebDriver driver;
	
	public SeleniumWebDriver getSeleniumWebDriver() {
		return driver;
	}
	
}
