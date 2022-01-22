package org.test.pages;

public interface SpokeoHomePage {
	
	public void goToHomePageURL();
	
	public String getHeader();
	
	public void clickOnLinkWithText(final String text);
	
	public boolean isLoggedIn();
	
}
