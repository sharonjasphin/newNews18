package com.news18.tamilpages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 *This Class Contains Elements and Business Logics for Desktop Tamil Article Consumption Page
 */
public class DesktopTamilArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();

	public WebDriver driver;
	public DesktopTamilArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'hotTopic')]/div[contains(@class,'section-blog')]//a")
	private List<WebElement> latestArtcleLst;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "//ul[contains(@class,'artclbyeline-agency')]//time | //ul[contains(@class,'phtartcl-newbyeline')]//time")
	private WebElement firstPublishedDate;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'article_content_row')]//ul[contains(@class,'share')]//a | //div[contains(@class,'pht-artcl-hd')]//div[contains(@class,'pht-artcl-share')]/a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'article_content_row')]//ul[contains(@class,'share')] | //div[contains(@class,'pht-artcl-hd')]//div[contains(@class,'pht-artcl-share')]")
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
