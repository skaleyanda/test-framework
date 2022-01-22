package org.test.core;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser extends WebBrowser {
	
	public FireFoxBrowser() {
		this.driver = new SeleniumWebDriver(new FirefoxDriver());
		this.setupClient();
	}
	
	/**
	 * To set up other capabilities and system properties for driver file. Implicit wait time added is too long 
	 * for now to 10 seconds, but can be changed to match the performance eventually.
	 */
	@Override
	public void setupClient() {
		this.driver.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
