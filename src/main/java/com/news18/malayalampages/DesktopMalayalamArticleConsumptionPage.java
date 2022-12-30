package com.news18.malayalampages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;
public class DesktopMalayalamArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt = new SoftAssert();

	public WebDriver driver;
	public DesktopMalayalamArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'hotTopic')]//a[not (contains (@href,'/videos/'))]")
	private List<WebElement> latestArtcleLst;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "(//div[contains(@class,'newbyeline')]//time)[1] | (//ul[contains(@class,'phtartcl-newbyeline')]//time)[1]  ")
	private WebElement firstPublishedDate;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'newbyeline')]//ul[contains(@class,'share')]//a | //div[contains(@class,'pht-artcl-share fright')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'newbyeline')]//ul[contains(@class,'share')] | //div[contains(@class,'pht-artcl-share fright')]")
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
