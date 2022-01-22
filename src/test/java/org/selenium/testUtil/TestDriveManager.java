package org.selenium.testUtil;

import org.test.core.AbstractClientFactory;
import org.test.core.Browser;
import org.test.core.DeviceType;
import org.test.core.SeleniumMobileDriver;
import org.test.core.SeleniumWebDriver;
import org.test.core.WebBrowser;
import org.test.pages.MobilePageFactory;
import org.test.pages.PageFactory;
import org.test.pages.WebPageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestDriveManager {
	
	private SeleniumWebDriver seleniumWebDriver;
	private SeleniumMobileDriver seleniumMobileDriver;
	protected PageFactory pageFactory;
	
	/**
	 * Though we have basic structure for Web drive support, some changes to support Mobile drive is 
	 * not completed
	 * @param browser
	 * @param deviceType
	 */
	@Parameters({ "browser", "deviceType" })
	@BeforeTest
	public void loadConfiguration(@Optional("FIREFOX") String browser, @Optional("DESKTOP") String deviceType) {
		WebBrowser webBrowser = AbstractClientFactory.getBrowserFactory(Browser.valueOf(browser));
		seleniumWebDriver = webBrowser.getSeleniumWebDriver();
		if (DeviceType.valueOf(deviceType).equals(DeviceType.DESKTOP)) {
			pageFactory = new WebPageFactory(seleniumWebDriver);
		} else if (DeviceType.valueOf(deviceType).equals(DeviceType.MOBILE)) {
			pageFactory = new MobilePageFactory(seleniumMobileDriver);
		}
	}
	
	
	
	@AfterTest()
	public void cleanUp() {
		seleniumWebDriver.getWebDriver().quit();
	}

}
