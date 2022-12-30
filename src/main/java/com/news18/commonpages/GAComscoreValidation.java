package com.news18.commonpages;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.news18.init.GenericUtility;
import com.news18.init.IPath;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


/**
 * @author AnupamGupta ,Abhishek Raj & VipinKumarGawande
 * This class contains WebElements and Business Logics which is used to verify the GA and Comscore is 
 * present in Desktop and Mobile Mode which is common for All the Languages 
 */
public class GAComscoreValidation {

	public WebDriver driver;
	public LogEntries logs =null;
	public String pageURL;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();

	public GAComscoreValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/**
	 * @author AnupamGupta , Abhishek Raj & VipinKumarGawande
	 * This method used to validate GA is present in desktop and mobile
	 */
	public void verifyGA() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(3000);
		pageURL = webDriverActions.getCurrentPageUrl();
		logs = webDriverActions.getAllNetworkLog();
		Logs.info(getClass(), pageURL);
		FileWriter f =genericUtility.fileWriter(IPath.gaComscorePath);
		try {
			f.write("[");
			for (LogEntry entry : logs) {
				if(entry.toString().contains("collect?") && entry.toString().contains("analytics.js") && entry.toString().contains("\"Network.requestWillBeSent\"") && entry.toString().contains(pageURL)  ) {
					f.write(genericUtility.parseToJSONObject(entry.getMessage()).get("message").toString()+","+"\n");
				}
			}
			f.write("{}]");
			f.close();
		} catch (IOException e) {
			Logs.error(getClass()," File not Found");
		}
		Assert.assertTrue(((genericUtility.fileContainText(IPath.gaComscorePath, "collect?")) && (genericUtility.fileContainText(IPath.gaComscorePath, "analytics.js"))),"GA not present "+webDriverActions.getCurrentPageUrl());
		String url=genericUtility.getTextFromJsonFiles(IPath.gaComscorePath, "/0/params/request/url");
		Logs.info(getClass(),"Response URL ---- " +url);
		if(url=="") {

			Assert.fail("GA url not found");
			Logs.error(getClass(), "GA URL not found");

		} else {
			RestAssured.baseURI = url;
			RequestSpecification httpRequest = RestAssured.given().contentType(ContentType.JSON).config(RestAssuredConfig.newConfig().sslConfig(new SSLConfig().relaxedHTTPSValidation("SSL")));
			Response response = httpRequest.post();
			int gaStatusCode = response.getStatusCode();
			Logs.info(getClass(), "GA status Code is "+gaStatusCode);
			Assert.assertEquals(gaStatusCode , 200 , "status code is not 200 " +webDriverActions.getCurrentPageUrl());
		}
	}


	/**
	 * @author AnupamGupta , Abhishek Raj & VipinKumarGawande
	 * This method used to validate Comscore is present in desktop and mobile 
	 */
	public void verifyComscore() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(3000);
		pageURL = webDriverActions.getCurrentPageUrl();
		logs = webDriverActions.getAllNetworkLog();
		Logs.info(getClass(), pageURL);
		try {
			FileWriter f =genericUtility.fileWriter(IPath.gaComscorePath);
			f.write("[");
			for (LogEntry entry : logs){
				if(entry.toString().contains("b?c1") && entry.toString().contains("\"Network.requestWillBeSent\"") && entry.toString().contains("\"GET\"") && entry.toString().contains(pageURL) ) {
					f.write(genericUtility.parseToJSONObject(entry.getMessage()).get("message").toString()+","+"\n");
				} 
			}
			f.write("{}]");
			f.close();
		} catch (IOException e) {
			Logs.error(getClass()," File not Found");
		}
		Assert.assertTrue(genericUtility.fileContainText(IPath.gaComscorePath, "b?c1"),"Comscore not present "+webDriverActions.getCurrentPageUrl());
		String url=genericUtility.getTextFromJsonFiles(IPath.gaComscorePath, "/0/params/request/url");
		Logs.info(getClass(),"Response URL ---- " +url);
		if(url=="") {

			Assert.fail("ComScore url not found");
			Logs.error(getClass(), "ComScore url not found");

			
		} else {
			RestAssured.baseURI = url;
			RequestSpecification httpRequest = RestAssured.given().config(RestAssuredConfig.newConfig().sslConfig(new SSLConfig().relaxedHTTPSValidation("SSL")));
			Response response = httpRequest.get();
			int comscoreStatusCode = response.getStatusCode();
			Logs.info(getClass(), "Comscore status Code is "+comscoreStatusCode);
			Assert.assertEquals(comscoreStatusCode , 204 , "status code is not 204 " +webDriverActions.getCurrentPageUrl());
		}
	}
	
//	**********************************************************//
	/**
	 * @author AnupamGupta , Abhishek Raj & VipinKumarGawande
	 * This method used to validate GA is present in desktop and mobile
	 */
	public void verifyMobileGA() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(40000);
		pageURL = webDriverActions.getCurrentPageUrl();
		LogEntries mobileLogs = webDriverActions.getAllNetworkLog();
		Logs.info(getClass(), pageURL);
		FileWriter f =genericUtility.fileWriter(IPath.gaComscorePath);
		try {
			f.write("[");
			for (LogEntry entry : mobileLogs) {
				if(entry.toString().contains("collect?") && entry.toString().contains("analytics.js") && entry.toString().contains("\"Network.requestWillBeSent\"") && entry.toString().contains(pageURL)  ) {
					f.write(genericUtility.parseToJSONObject(entry.getMessage()).get("message").toString()+","+"\n");
				}
			}
			f.write("{}]");
			f.close();
		} catch (IOException e) {
			Logs.error(getClass()," File not Found");
		}
		Assert.assertTrue(((genericUtility.fileContainText(IPath.gaComscorePath, "collect?")) && (genericUtility.fileContainText(IPath.gaComscorePath, "analytics.js"))),"GA not present "+webDriverActions.getCurrentPageUrl());
		String url=genericUtility.getTextFromJsonFiles(IPath.gaComscorePath, "/0/params/request/url");
		Logs.info(getClass(),"Response URL ---- " +url);
		if(url=="") {

			Assert.fail("GA url not found");
			Logs.error(getClass(), "GA URL not found");

		} else {
			RestAssured.baseURI = url;
			RequestSpecification httpRequest = RestAssured.given().contentType(ContentType.JSON).config(RestAssuredConfig.newConfig().sslConfig(new SSLConfig().relaxedHTTPSValidation("SSL")));
			Response response = httpRequest.post();
			int gaStatusCode = response.getStatusCode();
			Logs.info(getClass(), "GA status Code is "+gaStatusCode);
			Assert.assertEquals(gaStatusCode , 200 , "status code is not 200 " +webDriverActions.getCurrentPageUrl());
		}
	}


	/**
	 * @author AnupamGupta , Abhishek Raj & VipinKumarGawande
	 * This method used to validate Comscore is present in desktop and mobile 
	 */
	public void verifyMobileComscore() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(40000);
		pageURL = webDriverActions.getCurrentPageUrl();
		LogEntries mobileLogs = webDriverActions.getAllNetworkLog();
		Logs.info(getClass(), pageURL);
		try {
			FileWriter f =genericUtility.fileWriter(IPath.gaComscorePath);
			f.write("[");
			for (LogEntry entry : mobileLogs){
				if(entry.toString().contains("b?c1") && entry.toString().contains("\"Network.requestWillBeSent\"") && entry.toString().contains("\"GET\"") && entry.toString().contains(pageURL) ) {
					f.write(genericUtility.parseToJSONObject(entry.getMessage()).get("message").toString()+","+"\n");
				} 
			}
			f.write("{}]");
			f.close();
		} catch (IOException e) {
			Logs.error(getClass()," File not Found");
		}
		Assert.assertTrue(genericUtility.fileContainText(IPath.gaComscorePath, "b?c1"),"Comscore not present "+webDriverActions.getCurrentPageUrl());
		String url=genericUtility.getTextFromJsonFiles(IPath.gaComscorePath, "/0/params/request/url");
		Logs.info(getClass(),"Response URL ---- " +url);
		if(url=="") {

			Assert.fail("ComScore url not found");
			Logs.error(getClass(), "ComScore url not found");

			
		} else {
			RestAssured.baseURI = url;
			RequestSpecification httpRequest = RestAssured.given().config(RestAssuredConfig.newConfig().sslConfig(new SSLConfig().relaxedHTTPSValidation("SSL")));
			Response response = httpRequest.get();
			int comscoreStatusCode = response.getStatusCode();
			Logs.info(getClass(), "Comscore status Code is "+comscoreStatusCode);
			Assert.assertEquals(comscoreStatusCode , 204 , "status code is not 204 " +webDriverActions.getCurrentPageUrl());
		}
	}
}




