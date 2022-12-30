package com.news18.apifeedurls;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

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

public class DesktopAllVideoUrlsTest extends DesktopCommonConfig  {

	GenericUtility glib=new GenericUtility();
	protected static List<String> videoUrlLinks;
	public List<String> videoUrl = null;


	@BeforeClass
	public void beforeClassConfig() throws Throwable {
		/* passing section to db as Stream_urls */
		videoUrlLinks=dbGetUrls("Stream_Urls");

	}


	@Test(dataProvider ="videoUrlDataProvider")
	public void videoUrlTest(String url) {

		RequestSpecification httprequest=given();
		Response resp=
				when()
				.get(url);


		videoUrl=glib.getJsonPath(resp.jsonPath(),"videoUrl");
		for (int i = 0; i <videoUrl.size(); i++) {
			Logs.info(DesktopAllVideoUrlsTest.class,"VideoUrl is :"+videoUrl.get(i));
			navigateToUrl("https://players.akamai.com/players/hlsjs");
			pages.akamaipage.validateAkamaiPlayer(videoUrl.get(i));

		}

	}


	@DataProvider(name = "videoUrlDataProvider")
	public static Object[] streamUrlData()
	{
		try{
			Object data[]= new Object[videoUrlLinks.size()];
			for (int i = 0; i < videoUrlLinks.size(); i++) 
			{
				data[i] = videoUrlLinks.get(i);
			}
			Logs.info(DesktopAllVideoUrlsTest.class,"Stream urls from db : "+videoUrlLinks);
			return data;
		}
		catch(Exception e)
		{
			return new Object[] {};
		}
	}

}
