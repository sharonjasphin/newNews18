package com.news18.commonpages;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.devtools.v102.network.Network;
import org.openqa.selenium.devtools.v102.network.model.Request;
import org.openqa.selenium.devtools.v102.network.model.Response;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;



public class IzootoValidatorPage  {

	public WebDriver driver;
	public DevTools devTools;
	public  ArrayList<String> liststr=new ArrayList<String>();	
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	public LogEntries logs =null;

	public IzootoValidatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * @author AbhishekRaj
	 * This method used to validate Izooto is present in desktop, mobile and Amp
	 * @throws InterruptedException 
	 */
	public void getNetworkLogs(String url) throws InterruptedException{
		int countIzooto=0;
		devTools= ((ChromeDriver)driver).getDevTools();
		webDriverActions.waitForSecond(2000);
		liststr.clear();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(),Optional.empty(), Optional.empty()));
		webDriverActions.waitForSecond(20000);
		webDriverActions.waitForSecond(40000);
		devTools.addListener(Network.requestWillBeSent(),request->
		{

			Request req=request.getRequest();
			if(req.getUrl().contains("https://cdn.izooto.com/scripts/sdk/izooto.js")) 
			{

				liststr.add(req.getUrl());
				System.out.println("Izooto url: "+req.getUrl());
			}
		});

		webDriverActions.navigateToUrl(url);
		webDriverActions.waitForSecond(15000);
		devTools.send(Network.disable());
		devTools.clearListeners();
		devTools.close();
		for (int i = 0; i < liststr.size(); i++)
		{
			if(liststr.get(i).contains("https://cdn.izooto.com/scripts/sdk/izooto.js"))
			{
				countIzooto++;
			}
		}
		liststr.clear();


		if(countIzooto==1)
		{
			System.out.println(countIzooto+" izooto.js present");
		}
		else if(countIzooto==0)
		{
			System.out.println(countIzooto+" izooto.js present");
			Assert.assertTrue("Failure in izootoValidation "+countIzooto+" izooto.js present "+ webDriverActions.getCurrentPageUrl(), false);
		}
		else
		{
			System.out.println(countIzooto+" izooto.js present");
			Assert.assertTrue("Izooto present but No. of count of izooto : "+countIzooto+"  "+ webDriverActions.getCurrentPageUrl(), false);
		}
	} 


	/**
	 * @author AbhishekRaj
	 * This method used to validate Izooto is present in desktop, mobile and Amp
	 * @throws InterruptedException 
	 */
	public void getGtm(){
		webDriverActions.waitForSecond(2000);
		DevTools devTools= ((ChromeDriver)driver).getDevTools();
		devTools.createSession();
		webDriverActions.waitForSecond(15000);
		devTools.send(Network.enable(Optional.empty(),Optional.empty(), Optional.empty()));
		webDriverActions.waitForSecond(20000);
		devTools.addListener(Network.responseReceived(),response->
		{
			Response res= response.getResponse();
			String url = res.getUrl();
			if(url.contains("gtm.js?")  && url.contains("id=GTM-") && url.contains("googletagmanager.com")) {
				System.out.println(url);
			}
		});
	}

	/**
	 * @author AbhishekRaj
	 * This method used to validate Izooto is present in desktop, mobile and Amp
	 * @throws InterruptedException 
	 */
	public void getGtm(String urls){
		webDriverActions.waitForSecond(2000);
		devTools= ((ChromeDriver)driver).getDevTools();
		devTools.createSession();
		webDriverActions.waitForSecond(15000);
		devTools.send(Network.enable(Optional.empty(),Optional.empty(), Optional.empty()));
		webDriverActions.waitForSecond(20000);
		devTools.addListener(Network.responseReceived(),response->
		{
			Response res= response.getResponse();
			String url = res.getUrl();
			if(url.contains("gtm.js?")  && url.contains("id=GTM-") && url.contains("googletagmanager.com")) {
				System.out.println("gtm.js is present "+ url);

			}

		});

		webDriverActions.navigateToUrl(urls);
		webDriverActions.waitForSecond(15000);
		devTools.send(Network.disable());
		devTools.clearListeners();
		devTools.close();

	}
}
