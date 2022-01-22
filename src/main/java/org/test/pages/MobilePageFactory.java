package org.test.pages;

import org.test.core.SeleniumMobileDriver;

/**
 * 
 * This implementation class is to support Mobile devices. Still in Progress.
 *
 */
public class MobilePageFactory implements PageFactory {
	
private static SeleniumMobileDriver driver;
	
	public MobilePageFactory(SeleniumMobileDriver webDriver) {
		driver = webDriver;
	}

	@Override
	public SpokeoHomePage getSpokeoHomePage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpokeoLoginPage getSpokeoLoginPage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpokeoSearchPage getSpokeoSearchPage() {
		// TODO Auto-generated method stub
		return null;
	}

}
