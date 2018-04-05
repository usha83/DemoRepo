package com.qa.restclient;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class restapiclient {
	
	int status;
	
	public void getmethod(String url) throws ClientProtocolException, IOException
	{
		CloseableHttpClient clientconn=HttpClients.createDefault();// creating connection with client
		
		HttpGet request=new HttpGet(url);  //loading request
		
		 CloseableHttpResponse response=clientconn.execute(request);       //hit the request
		 
		 
		 status= response.getStatusLine().getStatusCode();
		 System.out.println(status);
		
		String resStr= EntityUtils.toString(response.getEntity(),"UTF-8");
		
		//JSONObject jason=new JSONObject(resStr);
		System.out.println("Json formatbody is " +resStr);
		
		
		Header[] header=response.getAllHeaders();
		
		HashMap<String,String> hm=new HashMap<String,String>();
		
		for(Header head:header)
		{
			hm.put(head.getName(), head.getValue());
		}
		
		System.out.println("all headers are"+hm);
		
		
		 
		
	}

}
