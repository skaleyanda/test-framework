package org.selenium.tests;


import org.selenium.testUtil.TestDriveManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.test.pages.SpokeoHomePage;
import org.test.pages.SpokeoLoginPage;
import org.test.pages.SpokeoSearchPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SpokeoPageTests extends TestDriveManager {
	
	// All the constants can be abstracted to a common file
	
	private static final Logger LOG = LoggerFactory.getLogger(SpokeoPageTests.class); 
	
	private SpokeoHomePage spokeoHomePage;
	private SpokeoLoginPage spokeoLoginPage;
	private SpokeoSearchPage spokeoSearchPage;
	
	@BeforeClass
	public void configure() {
		spokeoHomePage = pageFactory.getSpokeoHomePage();
		spokeoLoginPage = pageFactory.getSpokeoLoginPage();
		spokeoSearchPage = pageFactory.getSpokeoSearchPage();
	}
	
	
	@BeforeMethod
	public void runBeforeTest() {
		spokeoHomePage.goToHomePageURL();
	}
	
	@Test
	public void verifyHeader() {
		
		LOG.info("VERIFY HEADER");
		Assert.assertTrue(spokeoHomePage.getHeader().contains("Spokeo"));
	}
	
	@Test
	public void verifySuccessLogin() {
		
		LOG.info("VERIFY LOGIN FUNCTION");
		spokeoHomePage.clickOnLinkWithText("LOGIN");
		spokeoLoginPage.enterEmail("interviewtesting@spokeo.com");
		spokeoLoginPage.enterPassword("interview1234");
		spokeoLoginPage.clickLogin();
		Assert.assertTrue(spokeoHomePage.isLoggedIn(), "Failed to login");
	}
	
	@Test
	public void verifyFailureLogin() {
		
		LOG.info("VERIFY LOGIN FUNCTION");
		spokeoHomePage.clickOnLinkWithText("LOGIN");
		spokeoLoginPage.enterEmail("interviewtesting@spokeo.com");
		spokeoLoginPage.enterPassword("interview");
		spokeoLoginPage.clickLogin();
		Assert.assertFalse(spokeoHomePage.isLoggedIn(), "Login should not be successful");
	}
	
	@Test
	public void verifySearchFunction() {
		
		LOG.info("VERIFY SEARCH FUNCTION");
		spokeoSearchPage.enterSearchKey("interviewtesting@spokeo.com");
		spokeoSearchPage.clickOnSearch();
		Assert.assertTrue(spokeoSearchPage.searchResultResponse().contains("We Found a Match"));
		
	}
	
	

}
