package org.test.core;

public abstract class AbstractClientFactory {
	
	private static FireFoxBrowser ffBrowser;
	private static ChromeBrowser chromeBrowser;
	
	
	/**
	 * Creates a web Browser Object based on the browser type
	 * @param browser
	 * @return
	 */
	public static final WebBrowser getBrowserFactory(Browser browser) {
		switch(browser) {
		case FIREFOX:
			ffBrowser = new FireFoxBrowser();
			return ffBrowser;
		case CHROME:
			return chromeBrowser;
		default:
			return ffBrowser;
		}
		
	}

}
