package com.news18.punjabipages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 *This Class Contains Elements And Business logics For Desktop Punjab Article Consumption Page
 */
public class DesktopPunjabArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();

	public WebDriver driver;
	public DesktopPunjabArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'hotTopic')]/div[contains(@class,'section-blog')]//a")
	private List<WebElement> latestArtcleLst;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "//div[contains(@class,'newbyeline')]//time | //ul[contains(@class,'newbyeline') or contains(@class,'artclbyeline-agency') ]//time | (//div[contains(@class,'newdscrtcardbox_date')])[1]")
	private WebElement firstPublishedDate;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'artclbyeline')]//li/a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'artclbyeline')]")
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
