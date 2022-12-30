package com.news18.tamilpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;

/**
 *@author SanjeebKumarPati
 *This Class Contains elements and business logics for Tamil Article Consumption Page
 */
public class MobileTamilArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();

	public WebDriver driver;
	public MobileTamilArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'chmpntpnwshd')]/h2/a")
	private List<WebElement> latestArtcleLst;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "(//div[contains(@class,'artcl_byline_sec')]//time)[1]")
	private WebElement firstPublishedDate;
	
	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'social_share_sec')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'social_share_sec')]")
	private WebElement allShareIcons;
	
	/*slider Button Present in latest section*/
	@FindBy(xpath = "(//div[contains(@class,'swiper-container-android')]//div[contains(@class,'swiper-pagination-bullets')]/span)[1]")
	private WebElement sliderBtn;

	public List<WebElement> getSocialShareIconsLnk() {
		return socialShareIconsLnk;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}
	
	public List<WebElement> getLatestArtcleLst() {
		return latestArtcleLst;
	}

	public WebElement getFirstPublishedDate() {
		return firstPublishedDate;
	}
}
