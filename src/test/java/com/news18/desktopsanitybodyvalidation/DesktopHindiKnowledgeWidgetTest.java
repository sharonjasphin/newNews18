package com.news18.desktopsanitybodyvalidation;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;
public class DesktopHindiKnowledgeWidgetTest extends DesktopCommonConfig{

	/**
	 * @author 
	 * This method is used for navigate to Hindi Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}
	@Test
	public void verifyHindiHomePageKnowledgeWidgetArticle() {
		pages.desktopHindiSanityLandingPage.verifyKnowledgeWidgetArticle(serverType);        
	}
	
	

}
