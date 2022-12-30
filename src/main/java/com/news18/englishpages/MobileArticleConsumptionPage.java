package com.news18.englishpages;

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
 * This Class contains webelements and business logic for Mobile Article Consumption Page
 */

public class MobileArticleConsumptionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt =new SoftAssert();

	public MobileArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* Outbrain present in bottom of article consumption page */
	@FindBy(xpath = "//div[@class='ob_what ob_what_resp']/a/span [contains(@title,'Outbrain')]")
	private WebElement outbrain;

	/* Robot tag present in Meta */
	@FindBy(xpath = "//*[contains(text(),'robots')]/following-sibling::span[contains(text(),'max-image-preview:large')]")
	private WebElement robotsInSourceCode;

	/* Outbrain box present in bottom of article consumption page */
	@FindBy(xpath = "//div[@class='OUTBRAIN']")
	private List<WebElement> outbrainBox;

	/*Promoted Content All Article List present inside Outbrain in Homepage*/
	@FindBy(xpath ="//div[@class='ob-widget-items-container']//section/span[1]")
	private List<WebElement> promotedContentArticleList;

	/*Promoted Content image is present inside Promoted Content Section in Homepage*/
	@FindBy(xpath ="//div[@class='ob-widget-items-container']//span[@class='ob-unit ob-rec-image-container']")
	private List<WebElement> promotedContentImg;

	/*Outbrain Text  is present in the above the Footer and Rhs of Promoted Content*/
	@FindBy(xpath ="//div[contains(@class,'ob_what ob_what_resp')]//span[@class='ob_logo']")
	private List<WebElement> outbrainTxt;

	/*Homepage List of article Link for news18 home Page*/
	@FindBy(xpath ="(//ul[contains(@class,'story_listing')])[1]/li/a[not(contains(@href,'live'))]")
	private List<WebElement> homePageArticleLnk;

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "(//div[contains(@class,'top_story')]//a) ")
	private List<WebElement> latestArtcleLnk;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "//div[contains(@class,'published_date')]")
	private WebElement firstPublishedDate;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'article_main')]//ul[contains(@class,'article_socials')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'article_main')]//ul[contains(@class,'article_socials')]")
	private WebElement allShareIcons;

	public List<WebElement> getSocialShareIconsLnk() {
		return socialShareIconsLnk;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

	public List<WebElement> getLatestArtcleLnk() {
		return latestArtcleLnk;
	}

}
