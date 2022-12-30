package com.news18.desktopregressionhomepagebodyvalidation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.WebDriverActions;

/**
 * @author VipinKumarGawande
 *	This class contains Testfiles to Validate the Webstories Widget Article ,Image , Slider and Title Navigation in Homepage
 */
public class DesktopLokmatWebstoriesWidgetTest extends DesktopCommonConfig {

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Article Navigation in Homepage
	 */
	@Test
	public void webstoriesArticleNavigation()
	{
		pages.desktopLokmatLandingPage.verifyWebstoriesArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Image Navigation in Homepage
	 */
//	@Test
	public void webstoriesImageNavigation()
	{
		pages.desktopLokmatLandingPage.verifyWebstoriesImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Slider in Homepage
	 */
	@Test
	public void webstoriesSliderNavigation()
	{
		pages.desktopLokmatLandingPage.verifyWebstoriesSliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Title Navigation in Homepage
	 */
	@Test
	public void webstoriesTitleNavigation()
	{
		pages.desktopLokmatLandingPage.verifyWebstoriesTitleNavigation(serverType);
	}
}
