package com.news18.bengalipages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 *This Class Contains elements and business logics for Desktop Bengali Article Consumption Page
 */
public class DesktopBengaliArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();

	public WebDriver driver;
	public DesktopBengaliArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//ul/li[@class='clearfix']/h2/a")
	private List<WebElement> latestArtcleLst;

	//changes done 
	/*First published date mentioned in latest article*/
	@FindBy(xpath = "//div[contains(@class,'artclbyeline')]//time | //ul[contains(@class,'newbyeline')]//time")
	private WebElement firstPublishedDate;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'artclbyeline')]//ul[contains(@class,'share')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'artclbyeline')]//ul[contains(@class,'share')]")
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
