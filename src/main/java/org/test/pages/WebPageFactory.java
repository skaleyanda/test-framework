package org.test.pages;

import org.test.core.SeleniumWebDriver;

public class WebPageFactory implements PageFactory {
	
	private static SeleniumWebDriver driver;
	
	public WebPageFactory(SeleniumWebDriver webDriver) {
		driver = webDriver;
	}
	
	private static SpokeoHomePage spokeoHomePage;
	private static SpokeoLoginPage spokeoLoginPage;
	private static SpokeoSearchPage spokeoSearchPage;
	
	public SpokeoHomePage getSpokeoHomePage() {
		return (spokeoHomePage == null)? new SpokeoHomePageWebDriverImpl(driver):spokeoHomePage;
	}
	
	public SpokeoLoginPage getSpokeoLoginPage() {
		return (spokeoLoginPage == null)? new SpokeoLoginPageWebDriverImpl(driver):spokeoLoginPage;
	}

	public SpokeoSearchPage getSpokeoSearchPage() {
		return (spokeoSearchPage == null)? new SpokeoHomePageWebDriverImpl(driver):spokeoSearchPage;
	}

}
