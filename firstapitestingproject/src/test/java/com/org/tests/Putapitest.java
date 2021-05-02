package com.org.tests;

import java.io.File;
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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.client.Restclient;
import com.org.data.Users;
import com.org.restapi.TestBase;

public class Putapitest extends TestBase{
	
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
	    HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");
		
		//jackson API:
		ObjectMapper mapper = new ObjectMapper();
		Users users = new Users("morpheus", "Hero"); //expected users obejct
		
		//object to json file:
		mapper.writeValue(new File("C:\\Users\\SUBHASH KALVAKOLU\\eclipse-workspace\\firstapitestingproject\\src\\main\\java\\com\\org\\data\\users.json"), users);
		
		//java object to json in String:
		String usersJsonString = mapper.writeValueAsString(users);
		System.out.println(usersJsonString);
		
		closebaleHttpResponse = restClient.put(url, usersJsonString, headerMap); //call the API
		
		//validate response from API:
		//1. status code:
		int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status code is.."+statusCode);
		Assert.assertEquals(statusCode, testBase.RESPONSE_STATUS_CODE_200);
		System.out.println(closebaleHttpResponse.getProtocolVersion());
		
		//2. JsonString:
		String responseString = EntityUtils.toString(closebaleHttpResponse.getEntity(), "UTF-8");
		System.out.println("response String is..."+responseString);
		
		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("The response from API is:"+ responseJson);
		
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
		
		//json to java object:
		Users usersResObj = mapper.readValue(responseString, Users.class); //actual users object
		System.out.println(usersResObj);
		
		Assert.assertTrue(users.getName().equals(usersResObj.getName()));
		
		Assert.assertTrue(users.getJob().equals(usersResObj.getJob()));
		
		
		System.out.println(usersResObj.getUpdatedAt());
		
	}
	    
	

}
