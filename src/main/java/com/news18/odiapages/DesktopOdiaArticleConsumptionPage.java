package com.news18.odiapages;

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
 *This class Contains Elements and business logics for Desktop Odia Article Consumption Page.
 */
public class DesktopOdiaArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();

	public WebDriver driver;
	public DesktopOdiaArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'leftwrap')]//div[contains(@class,'section-blog')]//a ")
	private List<WebElement> latestArtcleLst;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "//div[contains(@class,'newbyeline')]//time | //ul[contains(@class,'phtartcl-newbyeline')]//time")
	private WebElement firstPublishedDate;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'newbyeline')]//ul[contains(@class,'share')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'newbyeline')]//ul[contains(@class,'share')]")
	private WebElement allShareIcons;

	public List<WebElement> getLatestArtcleLst() {
		return latestArtcleLst;
	}

	public WebElement getFirstPublishedDate() {
		return firstPublishedDate;
	}

	public List<WebElement> getSocialShareIconsLnk() {
		return socialShareIconsLnk;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

}
