package org.test.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.test.core.SeleniumWebDriver;

/**
 * Implementation for Spokeo Home page.
 * For the next version, Xpath string can be moved to a map as key value pair so changes in the webelement path can 
 * be updated only one time. Some constant values could be abstracted to a common file. 
 * 
 */
public class SpokeoHomePageWebDriverImpl implements SpokeoHomePage, SpokeoSearchPage {
	
	private WebDriver webDriver;
	
	public SpokeoHomePageWebDriverImpl(final SeleniumWebDriver driver) {
		webDriver = driver.getWebDriver();
	}
	
	public void goToHomePageURL() {
		webDriver.navigate().to("https://www.spokeo.com");
	}
	
	public String getHeader() {
		return webDriver.findElement(By.xpath("//h1[contains(@class, 'hero-search-title')]")).getText();
	}
	
	public void clickOnLinkWithText(final String text) {
		WebElement element = this.webDriver.findElement(By.xpath("//a[contains(text(), '" + text + "')]"));
		element.click();
		element.click();
		
	}
	
	public void enterSearchKey(final String key) {
		List<WebElement> searchElement = this.webDriver.findElements(By.xpath("//form[@id='homepage_hero_form']//input[@name='q']"));
		Actions action = new Actions(this.webDriver);
		action.click(searchElement.get(0)).sendKeys(key).perform();
	
	}

	/**
	 * Thread.sleep() needs to be moved to utilities and the logic to wait for search functionality 
	 * should be reviewed and changed based on search functionality performance
	 */
	public void clickOnSearch() {
		this.webDriver.findElement(By.xpath("//button[@id='search']")).click();
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String searchResultResponse() {
		return this.webDriver.findElement(By.xpath("//div[@id='profile_summary']")).getText();
	}

	@Override
	public boolean isLoggedIn() {
		try {
		 this.webDriver.findElement(By.xpath("//div[@class='toggle-avatar']")).isDisplayed();
		} catch (WebDriverException e){
			return false;
		}
		return true;
	}

}
