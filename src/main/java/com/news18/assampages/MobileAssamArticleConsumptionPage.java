package com.news18.assampages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 *This Class Contains elements and business logics for Urdu Article Consumption Page
 */
public class MobileAssamArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt = new SoftAssert();

	public WebDriver driver;
	public MobileAssamArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'chmpntpnwshd')]/h1/a")
	private List<WebElement> latestArtcleLst;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "(//ul[contains(@class,'newbyeline')]//time)[1]")
	private WebElement firstPublishedDate;
	
	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="(//div[contains(@class,'share-icon')])/a")
	private List<WebElement> socialShareIconsLnk;
	
	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'share-icon')]")
	private WebElement allShareIcons;
	
	public List<WebElement> getLatestArtcleLst() {
		return  latestArtcleLst;
	}

	public WebElement getFirstPublishedDate() {
		return firstPublishedDate;
	}
	
	public WebElement getAllShareIcons() {
		return allShareIcons;
	}
	
	public List<WebElement>getSocialShareIconsLnk() {
		return socialShareIconsLnk;
	}


}
