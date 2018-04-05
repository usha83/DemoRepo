package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.TestBase.BaseClass;
import com.qa.restclient.restapiclient;

public class restApi extends BaseClass


{

	

	BaseClass BC;
	String testURL;
	String testapi;
	String url;
	
	@BeforeMethod
	public void setup() throws IOException
	{
		BaseClass BC=new BaseClass();
	   testURL=pr.getProperty("URLS");
	   
	   testapi=pr.getProperty("ServiceURL");
	   url=testURL+testapi;
		
	}
	
	@Test
	public void getcall() throws ClientProtocolException, IOException
	{
		restapiclient rac=new restapiclient();
		rac.getmethod(url);
	}
	

}
