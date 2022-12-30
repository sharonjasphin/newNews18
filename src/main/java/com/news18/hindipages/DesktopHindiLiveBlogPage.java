package com.news18.hindipages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 *This Class Contains Elements and Business Logics For Desktop Hindi Live Blog Page
 */
public class DesktopHindiLiveBlogPage {


	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;

	public DesktopHindiLiveBlogPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="(//div[contains(@class,'articleshare')])/a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "(//div[contains(@class,'articleshare')])[2]")
	private WebElement allShareIcons;

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

	public List<WebElement> getSocialShareIconsLnk() {
		return socialShareIconsLnk;
	}

}
