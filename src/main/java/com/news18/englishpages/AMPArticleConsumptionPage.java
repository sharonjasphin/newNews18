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
 * This Class contains webelements and business logic for AMP
 * Article Consumption Page
 */

public class AMPArticleConsumptionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	SoftAssert assrt = new SoftAssert();
	GenericUtility genericUtility= new GenericUtility();

	public AMPArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'newftrshare_in')]/a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'newftrshare_in')]")
	private WebElement allShareIcons;
	
	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'article_main')]//ul[contains(@class,'article_socials')]")
	private WebElement AMPEnglishAllShareIcons;
	
	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'article_main')]//ul[contains(@class,'article_socials')]//a")
	private List<WebElement> AMPEnglishSocialShareIconsLnk;

	public List<WebElement> getAMPEnglishSocialShareIconsLnk() {
		return AMPEnglishSocialShareIconsLnk;
	}

	public WebElement getAMPEnglishAllShareIcons() {
		return AMPEnglishAllShareIcons;
	}

}
