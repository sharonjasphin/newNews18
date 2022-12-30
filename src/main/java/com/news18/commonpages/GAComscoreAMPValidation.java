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



/**
 * @author AnupamGupta ,Abhishek Raj & VipinKumarGawande
 * This class contains WebElements and Business Logics which is used to verify the GA and Comscore is 
 * present in Desktop and Mobile Mode which is common for All the Languages 
 */
public class GAComscoreAMPValidation {

	public WebDriver driver;
	public LogEntries logs =null;
	public String pageURL;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();

	public GAComscoreAMPValidation(WebDriver driver) {
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
				if(entry.toString().contains("collect?") && entry.toString().contains("\"Network.requestWillBeSent\"") && entry.toString().contains(pageURL)  ) {
					f.write(genericUtility.parseToJSONObject(entry.getMessage()).get("message").toString()+","+"\n");
				}
			}
			f.write("{}]");
			f.close();
		} catch (IOException e) {
			Logs.error(getClass()," File not Found");
		}
		Assert.assertTrue((genericUtility.fileContainText(IPath.gaComscorePath, "collect?")),"GA not present "+webDriverActions.getCurrentPageUrl());
		
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
				if(entry.toString().contains("score") && entry.toString().contains("c2=6683813") && entry.toString().contains("\"Network.requestWillBeSent\"") && entry.toString().contains("\"GET\"") && entry.toString().contains(pageURL) ) {
					f.write(genericUtility.parseToJSONObject(entry.getMessage()).get("message").toString()+","+"\n");
				} 
			}
			f.write("{}]");
			f.close();
		} catch (IOException e) {
			Logs.error(getClass()," File not Found");
		}
		Assert.assertTrue((genericUtility.fileContainText(IPath.gaComscorePath, "score")) && (genericUtility.fileContainText(IPath.gaComscorePath, "c2=6683813")),"Comscore not present "+webDriverActions.getCurrentPageUrl());
		
	}
}




