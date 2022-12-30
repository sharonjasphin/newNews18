package com.news18.gujaratipages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 *@author SanjeebKumarPati
 *This Class Contains Elements and Business Logics For Desktop Gujurati Article Consumption Page
 */
public class DesktopGujaratiArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	String metaTagTitleTxt;
	String metaTagTextcontentLnk;
	String metaTagdescriptionLnk;
	String metaTagdescriptioncontentTxt;
	String metaTagKeywordtLnk;
	String metaTagKeywordcontentLnk;

	public WebDriver driver;
	public DesktopGujaratiArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[not (contains(@href,'videos'))]")
	private List<WebElement> latestArtcleLst;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "(//div[contains(@class,'artclbyeline')]//time)[1] | (//ul[contains(@class,'phtartcl-newbyeline-agency')]//time)[1]")
	private WebElement firstPublishedDate;
	
	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'artclbyeline')]//ul[contains(@class,'share')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'artclbyeline')]//ul[contains(@class,'share')]")
	private WebElement allShareIcons;
	
	/*metatag title present inside the view page source*/
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='title']")
	private WebElement  metaTagTitle;

	/*metatag text present inside the view page source*/
	@FindBy(xpath = "(//td[contains(@class,'line-content')]//span[text()='<meta ']//span[contains(text(),'title')])")
	private WebElement  metaTagText;

	/*Metatag text content present inside the view page source*/
	@FindBy(xpath = "(//td[contains(@class,'line-content')]//span[text()='<meta ']//span[contains(text(),'title')]//following-sibling::span//following-sibling::Span)[1]")
	private WebElement  metaTagTextContent;

	/*metatag description present inside the view page source*/
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='description']")
//	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='og:description']")
	private WebElement  metaTagDescription;

	/*Metatag text content present inside the view page source*/
	@FindBy(xpath = "(//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='og:description']//following-sibling::span//following-sibling::Span)[1]")
	private WebElement  metaTagDescriptionContent;

	/*metatag keywords present inside the view page source*/
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='keywords']")
	private WebElement  metaTagKeyword;

	/*Metatag keywords content present inside the view page source*/
	@FindBy(xpath = "(//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='keywords']//following-sibling::span//following-sibling::Span)[1]")
	private WebElement  metaTagKeywordContent;

	/*Homepage artice headline1 Link*/
	@FindBy(xpath = "//* [contains(text(),'h1')]/parent::td")
	private WebElement  headline1Lnk;

	/*Homepage article headline2 text*/
	//		@FindBy(xpath = "//* [contains(text(),'h2')]/parent::td")
	@FindBy(xpath = "(//* [contains(text(),'<h2')]/parent::td)[2]")//td//span[contains(text(),'h2')]/parent::td
	private WebElement  headline2Lnk;
	
	
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
	
	/**
	 * @author DanishR
	 * This method is used to validate the meta tags content present in the view page source
	 */
	public void verifyGujaratiMetatagcontent() {
		
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.viewPageSource();
			metaTagTitleTxt = webDriverActions.getTextFromElement(metaTagText);
			Logs.info(getClass(),metaTagTitleTxt);
			metaTagTextcontentLnk = webDriverActions.getTextFromElement(metaTagTextContent).replace("&#x27;", "'");
			Logs.info(getClass(),metaTagTextcontentLnk);
			metaTagdescriptionLnk = webDriverActions.getTextFromElement(metaTagDescription);
			Logs.info(getClass(),metaTagdescriptionLnk);
			metaTagdescriptioncontentTxt = webDriverActions.getTextFromElement(metaTagDescriptionContent).replace("&#x27;", "'");
			Logs.info(getClass(),metaTagdescriptioncontentTxt);
			metaTagKeywordtLnk = webDriverActions.getTextFromElement(metaTagKeyword);
			Logs.info(getClass(),metaTagKeywordtLnk);
			metaTagKeywordcontentLnk = webDriverActions.getTextFromElement(metaTagKeywordContent);
			Logs.info(getClass(),metaTagKeywordcontentLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(),"Content is blank ", e);
			Assert.fail("Meta tag Content is blank in this Url "+webDriverActions.getCurrentPageUrl());
		}

		if(metaTagTitleTxt.contains("title"))
		{ 
			Logs.info(getClass(), "MetaTag Title content is present " + metaTagTextcontentLnk );
		}
		else
		{
			Logs.error(getClass(), metaTagTextcontentLnk  + "MetaTag Title content is not present  " );
			Assert.fail("MetaTag Title content is not present  "+ metaTagTextcontentLnk+" "+webDriverActions.getCurrentPageUrl());
		}

		if(metaTagdescriptionLnk.contains("description")) 
		{ 

			Logs.info(getClass(), "MetaTag description  is  present  " + metaTagdescriptioncontentTxt );
		}
		else
		{
			Logs.error(getClass(), metaTagdescriptioncontentTxt  + "  MetaTag description is not present  " );
			Assert.fail("MetaTag description is not present "+metaTagdescriptioncontentTxt+" "+webDriverActions.getCurrentPageUrl());
		}

		if(metaTagKeywordtLnk.contains("keywords")) 
		{ 
			Logs.info(getClass(), "MetaTag keywords is  present  "  +metaTagKeywordcontentLnk );
		}
		else
		{
			Logs.error(getClass(), metaTagKeywordcontentLnk  + "MetaTag keywords is not present  " );
			Assert.fail("MetaTag keywords is not present  "+metaTagKeywordcontentLnk+" "+webDriverActions.getCurrentPageUrl());
		}

		//H1 Validation
		String heading = webDriverActions.getTextFromElement(headline1Lnk).replace("&#x27;", "'");
		Logs.info(getClass(),"H1 tag is Present "+ metaTagTextcontentLnk);
		Assert.assertTrue(webDriverActions.compareTwoStrings(heading,metaTagTextcontentLnk)," H1 tag content is not same in view source page meta title tag content "+" "+webDriverActions.getCurrentPageUrl());


		//H2 Validation
		String heading2 =webDriverActions.getTextFromElement(headline2Lnk).replace("&#x27;", "'");
		Logs.info(getClass(),"H2 tag is Present "+ metaTagdescriptioncontentTxt);
		Assert.assertTrue(webDriverActions.compareTwoStrings(heading2,metaTagdescriptioncontentTxt)," H2 tag content is not same in view source page meta description tag content "+" "+webDriverActions.getCurrentPageUrl());
	}

}
