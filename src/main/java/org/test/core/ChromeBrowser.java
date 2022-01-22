package org.test.core;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser extends WebBrowser {
	
	public ChromeBrowser() {
		this.driver = new SeleniumWebDriver(new ChromeDriver());
		this.setupClient();
		
	}

	/**
	 * To set up other capabilities and system properties for driver file.
	 */
	@Override
	public void setupClient() {
		
	}

}
