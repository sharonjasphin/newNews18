package com.news18.apifeedurls;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.util.Date;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DesktopAllStreamUrlsTest extends DesktopCommonConfig  {

	GenericUtility glib=new GenericUtility();
	protected static List<String> streamUrlLinks;
	public List<String> date;
	public List<String> streamUrl = null;


	@BeforeClass
	public void beforeClassConfig() throws Throwable {
		streamUrlLinks=dbGetUrls("Stream_Urls");
	}


	@Test(dataProvider ="streamUrlDataProvider")
	public void streamUrlTest(String url) {
		RequestSpecification httprequest=given();
		Response resp=
				when()
				.get(url);

		streamUrl=glib.getJsonPath(resp.jsonPath(),"streamUrl");
		for (int i = 0; i <streamUrl.size(); i++) {
			Logs.info(DesktopAllStreamUrlsTest.class,"StreamUrl is :"+streamUrl.get(i));
			navigateToUrl("https://players.akamai.com/players/hlsjs");
			pages.akamaipage.validateAkamaiPlayer(streamUrl.get(i));
		}
	}

	@Test(dataProvider ="streamUrlDateDataProvider")
	public void streamUrlDateTest(String url) {
		RequestSpecification httprequest=given();
		Response resp=
				when()
				.get(url);

		date=glib.getJsonPath(resp.jsonPath(),"updateDate");
		
		for (int i = 0; i < date.size(); i++) {
			Logs.info(DesktopAllStreamUrlsTest.class,"date format for updateDate: "+date.get(i));
			Assert.assertEquals(date.get(i).substring(0, 10),glib.getStreamUrlDateFormat(),"Date is not matching for updateDate field in json for "+url+"with current Date");
			
		}
		
	}

	@DataProvider(name = "streamUrlDataProvider")
	public static Object[] streamUrlData()
	{
		try{
			Object data[]= new Object[streamUrlLinks.size()];
			for (int i = 0; i < streamUrlLinks.size(); i++) 
			{
				data[i] = streamUrlLinks.get(i);
			}
			Logs.info(DesktopAllStreamUrlsTest.class,"Stream urls from db : "+streamUrlLinks);
			return data;
		}
		catch(Exception e)
		{
			return new Object[] {};
		}
	}
	
	@DataProvider(name = "streamUrlDateDataProvider")
	public static Object[] streamUrlDateData()
	{
		try{
			Object data[]= new Object[streamUrlLinks.size()];
			for (int i = 0; i < streamUrlLinks.size(); i++) 
			{
				data[i] = streamUrlLinks.get(i);
			}
			Logs.info(DesktopAllStreamUrlsTest.class,"Stream urls from db : "+streamUrlLinks);
			return data;
		}
		catch(Exception e)
		{
			return new Object[] {};
		}
	}
}
