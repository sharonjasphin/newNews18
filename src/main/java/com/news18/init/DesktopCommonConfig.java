package com.news18.init;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


/**
 * @author DanishR
 * This class is used to initialize desktop configuration for browser launch
 *
 */
public class DesktopCommonConfig extends WebDriverActions{
	
	public InitializePages pages;
	
	@BeforeSuite(alwaysRun = true)
	public void setupSuite(ITestContext context) {
		for (ITestNGMethod method : context.getAllTestMethods()) {
			method.setRetryAnalyzerClass(RetryTestScript.class);
		}
	}

	@BeforeMethod
	@Parameters({"url","server"})
	public void navigateToHomePageURL(String url, String serverType) {
		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile(url));
	}
	
	@BeforeClass
	public void setUp(){
		launchWebBrowser(chrome, desktop);
		pages = new InitializePages(getDriver());
	}	
	
	
	@AfterClass
	public void afterClassSetup() {
		closeAllDriver();
	}
	
}
