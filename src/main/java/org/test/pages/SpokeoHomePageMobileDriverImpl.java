package org.test.pages;

import org.test.core.SeleniumMobileDriver;

public class SpokeoHomePageMobileDriverImpl implements SpokeoHomePage {

	SeleniumMobileDriver seleniumMobileDriver;
	
	public SpokeoHomePageMobileDriverImpl(final SeleniumMobileDriver seleniumMobileDriver) {
		this.seleniumMobileDriver = seleniumMobileDriver;
	}
	
	@Override
	public void goToHomePageURL() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getHeader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clickOnLinkWithText(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLoggedIn() {
		// TODO Auto-generated method stub
		return false;
	}

}
