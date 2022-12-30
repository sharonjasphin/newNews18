package com.news18.hindipages;

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
 *This class contain WebElements and their Business logics of Hindi Article consumption Pages
 */
public class MobileHindiArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt =new SoftAssert();
	public WebDriver driver;
	public MobileHindiArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'tpnews clearfix')]//h2/a")
	private  List<WebElement> latestArtcleLst;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'share_sec')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'share_sec')]")
	private WebElement allShareIcons;

	public List<WebElement> getSocialShareIconsLnk() {
		return socialShareIconsLnk;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}


	public  List<WebElement> getLatestArtcleLst() {
		return latestArtcleLst;
	}

	
}
