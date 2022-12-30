package com.news18.commonpages;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Danishr
 *This class contains webelements and business logic for the verification of metatag title,description,keywords and
 *headline1 and headline2 of an article present inside the view page source
 */
public class MetaTagContentValidation {
	String metaTagTitleTxt;
	String metaTagTextcontentLnk;
	String metaTagdescriptionLnk;
	String metaTagdescriptioncontentTxt;
	String metaTagKeywordtLnk;
	String metaTagKeywordcontentLnk;
	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MetaTagContentValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*metatag title present inside the view page source*/
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='title']")
	private WebElement  metaTagTitle;

	/*metatag text present inside the view page source*/
	@FindBy(xpath = "(//td[contains(@class,'line-content')]//span[text()='<meta ']//span[contains(text(),'title')])")
	private WebElement  metaTagText;
	
	/*metatag text present inside the view page source*/
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='<title>']")
	private WebElement  metaNameTitle;

	/*Metatag text content present inside the view page source*/
	@FindBy(xpath = "(//td[contains(@class,'line-content')]//span[text()='<meta ']//span[contains(text(),'title')]//following-sibling::span//following-sibling::Span)[1]")
	private WebElement  metaTagTextContent;
	
	/*Metatag text content present inside the view page source*/
	@FindBy(xpath = "(//td[contains(@class,'line-content')]//span[text()='<title>']//parent::td/text())[1]")
	private WebElement  metaTitleTextContent;

	/*metatag description present inside the view page source*/
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='description']")
	private WebElement  metaTagDescription;

	/*Metatag text content present inside the view page source*/
	@FindBy(xpath = "(//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='description']//following-sibling::span//following-sibling::Span)[1]")
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
	@FindBy(xpath = "//* [contains(text(),'h2')]/parent::td")
	private WebElement  headline2Lnk;

	/*Homepage article headline2 text*/
	@FindBy(xpath = "(//* [contains(text(),'<h2')]/parent::td)[1]")
	private WebElement  headler2Lnk;

	/*Homepage article headline2 Link*/
	@FindBy(xpath  = "//td[contains(@value,'37')]/..//span[contains(text(),'<h2 ')]")
	private WebElement  headline2txt;

	/*Homepage article headline1 Text*/
	@FindBy(xpath  = "//div/h1")
	private WebElement  headline1;

	/*Homepage article headline1 Text*/
	@FindBy(xpath  = "//div[contains(@class,'art')]//h2[@style]")
	private WebElement headline2;

	/*Metatag text content present inside the view page source*/
	@FindBy(xpath = "(//td[contains(@class,'line-content')]//span[text()='<meta ']//span[text()='og:description']//following-sibling::span//following-sibling::Span)[1]")
	private WebElement  metaTagDescriptionContentTxt;

	/*Homepage artice headline1 Link*/
	@FindBy(xpath = "//* [contains(text(),'h1')]/parent::td")
	private WebElement  header1Lnk;

	/*Homepage article headline2 text*/
	//		@FindBy(xpath = "//* [contains(text(),'h2')]/parent::td")
	@FindBy(xpath = "(//* [contains(text(),'<h2')]/parent::td)[1]")//td//span[contains(text(),'h2')]/parent::td
	private WebElement  header2Lnk;

	/**
	 * @author Danishr
	 * This method is used to validate the meta tags content present in the view page source
	 */
	public void verifyMetatagcontent() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.viewPageSource();
			metaTagTitleTxt = webDriverActions.getTextFromElement(metaTagTitle);
			Logs.info(getClass(),metaTagTitleTxt);
			metaTagTextcontentLnk = webDriverActions.getTextFromElement(metaTagTextContent).replace("&#x27;", "'");
			Logs.info(getClass(),metaTagTextcontentLnk);
			metaTagdescriptionLnk = webDriverActions.getTextFromElement(metaTagDescription);
			Logs.info(getClass(),metaTagdescriptionLnk);
			metaTagdescriptioncontentTxt = webDriverActions.getTextFromElement(metaTagDescriptionContent).replace("&#x27;", "'");
			Logs.info(getClass(),metaTagdescriptioncontentTxt);
			metaTagKeywordtLnk = webDriverActions.getTextFromElement(metaTagKeyword);
			Logs.info(getClass(),metaTagKeywordtLnk);
			metaTagKeywordcontentLnk = webDriverActions.getTextFromElement(metaTagKeywordContent).replace("&#x27;", "'");
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
		String[] str = heading.split("-->");
		String[] s = str[1].split("</h1>");
		heading = s[0];
		Logs.info(getClass(),"H1 tag is Present "+ heading);
		Assert.assertTrue(webDriverActions.compareTwoStrings(metaTagTextcontentLnk,heading)," H1 tag content is not same in view source page meta title tag content "+" "+webDriverActions.getCurrentPageUrl());


		//H2 Validation
		String heading2 =webDriverActions.getTextFromElement(headline2Lnk).replace("&#x27;", "'");
		String[] str1 = heading2.split("<h2");
		String[] st = str1[1].split(">");
		String[] s1 = st[1].split("</h2");
		heading2 = s1[0];
		Logs.info(getClass(),"H2 tag is Present "+ heading2);
		Assert.assertTrue(webDriverActions.compareTwoStrings(heading2,metaTagdescriptioncontentTxt)," H2 tag content is not same in view source page meta description tag content "+" "+webDriverActions.getCurrentPageUrl());

	}


	/**
	 * @author DanishR
	 * This method is used to validate the meta tags content present in the view page source
	 */
	public void verifyHeaderAndMetatagcontent() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.viewPageSource();
			metaTagTitleTxt = webDriverActions.getTextFromElement(metaNameTitle);
			Logs.info(getClass(),metaTagTitleTxt);
			metaTagTextcontentLnk = webDriverActions.getTextFromElement(metaTagTextContent).replace("&#x27;", "'");
			Logs.info(getClass(),metaTagTextcontentLnk);
			metaTagdescriptionLnk = webDriverActions.getTextFromElement(metaTagDescription);
			Logs.info(getClass(),metaTagdescriptionLnk);
			metaTagdescriptioncontentTxt = webDriverActions.getTextFromElement(metaTagDescriptionContentTxt).replace("&#x27;", "'");
			Logs.info(getClass(),metaTagdescriptioncontentTxt);
			metaTagKeywordtLnk = webDriverActions.getTextFromElement(metaTagKeyword);
			Logs.info(getClass(),metaTagKeywordtLnk);
			metaTagKeywordcontentLnk = webDriverActions.getTextFromElement(metaTagKeywordContent).replace("&#x27;", "'");
			Logs.info(getClass(),metaTagKeywordcontentLnk);

		}  catch (NoSuchElementException e) {
			Logs.error(getClass(),"Content is blank ", e);
			Assert.fail("Meta tag Content is blank in this Url "+webDriverActions.getCurrentPageUrl()+" "+webDriverActions.getCurrentPageUrl());
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
		String heading = webDriverActions.getTextFromElement(header1Lnk).replace("&#x27;", "'");
		String[] str1 = heading.split("<h1");
		String[] st = str1[1].split(">");
		String[] s1 = st[1].split("</h1");
		heading = s1[0];
		Logs.info(getClass(),"H1 tag is Present "+ heading);
		Assert.assertTrue(webDriverActions.compareTwoStrings(heading,metaTagTextcontentLnk)," H1 tag content is not same in view source page meta title tag content  "+" "+webDriverActions.getCurrentPageUrl());


		//H2 Validation
		String heading2 =webDriverActions.getTextFromElement(headler2Lnk).replace("&#x27;", "'");
//		String[] str = heading2.split("<h2");
//		String[] s = str[1].split(">");
//		String[] s2 = s[1].split("</h2");
//		heading2 = s2[0];
		Logs.info(getClass(),"H2 tag is Present "+ metaTagdescriptioncontentTxt);
		Assert.assertTrue(webDriverActions.compareTwoStrings(heading2,metaTagdescriptioncontentTxt)," H2 tag content is not same in view source page meta description tag content "+" "+webDriverActions.getCurrentPageUrl());
	}
	/*Metatag text content present inside the view page source*/
	@FindBy(xpath = "(//td[contains(@class,'line-content')]//span[text()='<meta ']//following-sibling::span[contains(text(),'<title>')]//parent::td)[1]")
	private WebElement  metaTagTextContentLokmat;

	/**
	 * @author DanishR
	 * This method is used to validate the meta tags content present in the view page source
	 */
	public void verifLokmatMetatagcontent() {

		webDriverActions.waitForPageToLoad();
		webDriverActions.viewPageSource();
		String metaTagTitleTxt = webDriverActions.getTextFromElement(metaNameTitle);
		Logs.info(getClass(),metaTagTitleTxt);
		String metaTagTextcontentLnk = webDriverActions.getTextFromElement(metaTagTextContent).replace("&#x27;", "'");
		Logs.info(getClass(),metaTagTextcontentLnk);
		String metaTagdescriptionLnk = webDriverActions.getTextFromElement(metaTagDescription);
		Logs.info(getClass(),metaTagdescriptionLnk);
		String metaTagdescriptioncontentTxt = webDriverActions.getTextFromElement(metaTagDescriptionContentTxt).replace("&#x27;", "'");
		Logs.info(getClass(),metaTagdescriptioncontentTxt);
		String metaTagKeywordtLnk = webDriverActions.getTextFromElement(metaTagKeyword);
		Logs.info(getClass(),metaTagKeywordtLnk);
		String metaTagKeywordcontentLnk = webDriverActions.getTextFromElement(metaTagKeywordContent).replace("&#x27;", "'");
		Logs.info(getClass(),metaTagKeywordcontentLnk);

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
		String heading = webDriverActions.getTextFromElement(header1Lnk).replace("&#x27;", "'");
		String[] str1 = heading.split("<h1");
		String[] st = str1[1].split(">");
		String[] s1 = st[1].split("</h1");
		heading = s1[0];
		Logs.info(getClass(),"H1 tag is Present "+ heading);
		Assert.assertTrue(webDriverActions.compareTwoStrings(heading,metaTagTextcontentLnk)," H1 tag content is not same in view source page meta title tag content "+" "+webDriverActions.getCurrentPageUrl());


		//H2 Validation
		String heading2 =webDriverActions.getTextFromElement(headler2Lnk).replace("&#x27;", "'");
		Logs.info(getClass(),"H2 tag is Present "+ metaTagdescriptioncontentTxt);
		Assert.assertTrue(webDriverActions.compareTwoStrings(heading2,metaTagdescriptioncontentTxt)," H2 tag content is not same in view source page meta description tag content "+" "+webDriverActions.getCurrentPageUrl());
	}

	/**
	 * @author DanishR
	 * This method is used to validate the meta tags content present in the view page source
	 */
	public void verifOdiaMetatagcontent() {


		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.viewPageSource();
			metaTagTitleTxt = webDriverActions.getTextFromElement(metaNameTitle);
			Logs.info(getClass(),metaTagTitleTxt);
			metaTagTextcontentLnk = webDriverActions.getTextFromElement(metaTagTextContent).replace("&#x27;", "'");
			Logs.info(getClass(),metaTagTextcontentLnk);
			metaTagdescriptionLnk = webDriverActions.getTextFromElement(metaTagDescription);
			Logs.info(getClass(),metaTagdescriptionLnk);
			metaTagdescriptioncontentTxt = webDriverActions.getTextFromElement(metaTagDescriptionContentTxt).replace("&#x27;", "'");
			Logs.info(getClass(),metaTagdescriptioncontentTxt);
			String metaTagKeywordtLnk = webDriverActions.getTextFromElement(metaTagKeyword);
			Logs.info(getClass(),metaTagKeywordtLnk);
			String metaTagKeywordcontentLnk = webDriverActions.getTextFromElement(metaTagKeywordContent).replace("&#x27;", "'");
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
		String heading = webDriverActions.getTextFromElement(header1Lnk).replace("&#x27;", "'");
		String[] str1 = heading.split("<h1");
		String[] st = str1[1].split(">");
		String[] s1 = st[1].split("</h1");
		heading = s1[0];
		Logs.info(getClass(),"H1 tag is Present "+ heading);
		Assert.assertTrue(webDriverActions.compareTwoStrings(metaTagTextcontentLnk,heading)," H1 tag content is not same in view source page meta title tag content "+" "+webDriverActions.getCurrentPageUrl());


		//H2 Validation
		String heading2 =webDriverActions.getTextFromElement(headler2Lnk).replace("&#x27;", "'");
		Logs.info(getClass(),"H2 tag is Present "+ metaTagdescriptioncontentTxt);
		Assert.assertTrue(webDriverActions.compareTwoStrings(heading2,metaTagdescriptioncontentTxt)," H2 tag content is not same in view source page meta description tag content "+" "+webDriverActions.getCurrentPageUrl());
	}
}













