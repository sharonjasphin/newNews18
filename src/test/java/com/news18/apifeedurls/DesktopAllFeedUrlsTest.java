package com.news18.apifeedurls;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;

public class DesktopAllFeedUrlsTest extends DesktopCommonConfig  {

	GenericUtility glib=new GenericUtility();
	protected static List<String> streamUrlLinks;
	public List<String> date;
	public List<String> streamUrl = null;


	@BeforeClass
	public void beforeClassConfig() throws Throwable {
		streamUrlLinks=dbGetUrls("Feed_urls");
	}


	
	@Test(dataProvider ="feedUrlDataProvider")
	public void feedUrlDateTest(  ) {
		String url="";
		navigateToUrl(url);
		try {
			glib.findDateTimeDifference(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	@DataProvider(name = "feedUrlDataProvider")
	public static Object[] streamUrlData()
	{
		try{
			Object data[]= new Object[streamUrlLinks.size()];
			for (int i = 0; i < streamUrlLinks.size(); i++) 
			{
				data[i] = streamUrlLinks.get(i);
			}
			Logs.info(DesktopAllFeedUrlsTest.class,"Stream urls from db : "+streamUrlLinks);
			return data;
		}
		catch(Exception e)
		{
			return new Object[] {};
		}
	}
	
	
}
