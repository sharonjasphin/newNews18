package com.news18.urdupages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 *This Class Contains Elements and Business Logics For Desktop Urdu Article Consumption Page
 */
public class DesktopUrduArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();

	public WebDriver driver;
	public DesktopUrduArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'hotTopic')]/div[contains(@class,'section-blog')]//a")
	private List<WebElement> latestArtcleLst;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "//ul[contains(@class,'newbyeline-agency')]//time | //ul[contains(@class,'pht-newbyeline')]//time")
	private WebElement firstPublishedDate;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//ul[contains(@class,'newbyeline-share')]//a | //div[contains(@class,'artcl-share fright')]/a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//ul[contains(@class,'newbyeline-share')] | //div[contains(@class,'artcl-share fright')]")
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
