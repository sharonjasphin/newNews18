package com.news18.englishpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;

/**
 * @author Sanjeeb
 *  This class contains WebElements and BusinessLogic of Mobile Liveblog Page
 */

public class MobileLiveblogPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility(); 

	public MobileLiveblogPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Desktop_LiveBlogPage Social share Links*/
	@FindBy(xpath = "//div[contains(@class,'socalWrap')]//a")
	private List<WebElement> socialShareIconsLnks;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'socalWrap')]")
	private WebElement allShareIcons;

}
