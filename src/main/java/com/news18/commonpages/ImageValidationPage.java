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
import com.news18.init.MobileCommonConfig;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek Raj
 *This class contains WebElements and business logics of an article Image validation 
 *For Desktop, Mobile and Amp mode  
 */
public class ImageValidationPage extends MobileCommonConfig {

	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public ImageValidationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*Width of an article image taken from page source*/
	@FindBy(xpath ="(//span[text()='og:image:width']//following-sibling::span[contains(@class,'html-attribute-value')])[1]")
	private WebElement widthOfArticleImage;

	/*height of an article image taken from page source*/
	@FindBy(xpath ="(//span[text()='og:image:height']//following-sibling::span[contains(@class,'html-attribute-value')])[1]")
	private WebElement heightOfArticleImage;


	/**
	 * @author Abhishek Raj
	 * This method is used to verify the size of an article image for both Desktop, Mobile and Amp view source code page
	 */
	public void verifyImageDimension(){
		String actualwidth="";
		String actualheight="";
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.viewPageSource();
			String textFromwidth = webDriverActions.getTextFromElement(widthOfArticleImage);
			actualwidth=textFromwidth;
			Logs.info(getClass(),textFromwidth);
			String textFromheight = webDriverActions.getTextFromElement(heightOfArticleImage);
			actualheight=textFromheight;
			Logs.info(getClass(),textFromheight);
			if(textFromwidth.equals("1600") && textFromheight.equals("900") ) {
				Logs.info(getClass(), textFromwidth  + "widhth of an article image is present ");
				Logs.info(getClass(), textFromheight + " height of an article image is present ");	
			}	
			else if(textFromwidth.equals("1200") && textFromheight.equals("900") ) {
				Logs.info(getClass(), textFromwidth  + "widhth of an article image is present ");
				Logs.info(getClass(), textFromheight + " height of an article image is present ");	
			}
			else {
				Logs.info(getClass(), "Invalid Image Dimension");
				Assert.fail("This Url has Invalid Image Dimension "+webDriverActions.getCurrentPageUrl()+"Width is: "+actualwidth+" and Height is: "+actualheight);

			}
		}
		catch (NoSuchElementException | IndexOutOfBoundsException e) {

			Assert.fail("Unable to Fetch Width and Height of Image Article in View Page Source Page"+webDriverActions.getCurrentPageUrl());
		}

	}
}








