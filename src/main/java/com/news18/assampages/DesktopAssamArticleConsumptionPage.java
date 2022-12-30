package com.news18.assampages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 *This Class Contains elements and business logics for Desktop Assam Article Consumption Page
 */
public class DesktopAssamArticleConsumptionPage {

	public WebDriver driver;
	

	public DesktopAssamArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'hotTopic')]//a[not (contains (@href,'/videos/'))]")
	private List<WebElement> latestArtcleLst;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "(//div[contains(@class,'newbyeline')]//time)[1] | (//ul[contains(@class,'phtartcl-newbyeline-agency')]//time)[1]")
	private WebElement firstPublishedDate;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="(//div[contains(@class,'article_content_row')])[1]//ul[contains(@class,'newbyeline-share')]//li/a")
	private List<WebElement> socialShareIconsLnk;
	
	/*All share icons division*/
	@FindBy(xpath = "(//div[contains(@class,'article_content_row')])[1]//ul[contains(@class,'newbyeline-share')]")
	private WebElement allShareIcons;
	
	public WebElement getAllShareIcons() {
		return allShareIcons;
	}
	
	public List<WebElement>getSocialShareIconsLnk() {
		return socialShareIconsLnk;
	}
	
	public List<WebElement> getLatestArtcleLst() {
		return latestArtcleLst;
	}

	public WebElement getFirstPublishedDate() {
		return firstPublishedDate;
	}

}
