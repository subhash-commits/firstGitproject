package com.org.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.org.client.Restclient;
import com.org.restapi.TestBase;

public class Deleteapitest extends TestBase {
	
	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	Restclient restClient;
	CloseableHttpResponse closebaleHttpResponse;
	@BeforeMethod
	public void setUp()
	{
		testBase=new TestBase();
		serviceUrl = prop1.getProperty("URL");
		apiUrl = prop1.getProperty("serviceUrl");
		
		url=serviceUrl+apiUrl;
	}
	@Test
	public void getAPITest() throws ClientProtocolException, IOException
	{
	    restClient = new Restclient();
	    closebaleHttpResponse=restClient.delete(url);
		
		//a. Status Code:
				int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
				System.out.println("Status Code--->"+ statusCode);
				
				Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_204, "Status code is 204");
				Header[] headersArray =  closebaleHttpResponse.getAllHeaders();
				HashMap<String, String> allHeaders = new HashMap<String, String>();	
				for(Header header : headersArray){
					allHeaders.put(header.getName(), header.getValue());	
				}
				 Set entrySet = allHeaders.entrySet();
				 
				    // Obtaining an iterator for the entry set
				    Iterator it = entrySet.iterator();
				 
				    // Iterate through HashMap entries(Key-Value pairs)
				    System.out.println("HashMap Key-Value Pairs : ");
				    while(it.hasNext()){
				       Map.Entry me = (Map.Entry)it.next();
				       System.out.println("Key is: "+me.getKey() + 
				       " & " + 
				       "value is: "+me.getValue());
				   }

}
}
