package com.org.tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.org.Utils.TestUtil;
import com.org.client.Restclient;
import com.org.restapi.TestBase;

public class Getapitest extends TestBase {
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
		apiUrl = prop1.getProperty("getUrl");
		
		url=serviceUrl+apiUrl;
	}
	@Test
	public void getAPITest() throws ClientProtocolException, IOException
	{
	    restClient = new Restclient();
	    closebaleHttpResponse=restClient.get(url);
		
		//a. Status Code:
				int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
				System.out.println("Status Code--->"+ statusCode);
				
				Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status code is not 200");

				//b. Json String:
				String responseString = EntityUtils.toString(closebaleHttpResponse.getEntity(), "UTF-8");
				
				JSONObject responseJson = new JSONObject(responseString);
				System.out.println("Response JSON from API---> "+ responseJson);
				
				//single value assertion:
				//per_page:
				String perPageValue = TestUtil.getValueByJPath(responseJson, "/per_page");
				System.out.println("value of per page is-->"+ perPageValue);
				Assert.assertEquals(Integer.parseInt(perPageValue), 6);
				
				//total:
				String totalValue = TestUtil.getValueByJPath(responseJson, "/total");
				System.out.println("value of total is-->"+ totalValue);		
				//Assert.assertEquals(Integer.parseInt(totalValue), 12);
				
				//get the value from JSON ARRAY:
				String lastName = TestUtil.getValueByJPath(responseJson, "/data[0]/last_name");
				String id = TestUtil.getValueByJPath(responseJson, "/data[1]/id");
				String avatar = TestUtil.getValueByJPath(responseJson, "/data[2]/avatar");
				String firstName = TestUtil.getValueByJPath(responseJson, "/data[3]/first_name");

				System.out.println(lastName);
				System.out.println(id);
				System.out.println(avatar);
				System.out.println(firstName);
				
				
				//c. All Headers
				Header[] headersArray =  closebaleHttpResponse.getAllHeaders();
				HashMap<String, String> allHeaders = new HashMap<String, String>();	
				for(Header header : headersArray){
					allHeaders.put(header.getName(), header.getValue());
				}	
				System.out.println("Headers Array-->"+allHeaders);
						
			}
		
	}



	