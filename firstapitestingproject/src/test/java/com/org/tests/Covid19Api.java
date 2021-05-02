package com.org.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonValue;
import com.org.client.Restclient;
import com.org.restapi.TestBase;

public class Covid19Api extends TestBase {

	TestBase testBase;
	String serviceUrl;
	Restclient restClient;
	CloseableHttpResponse closebaleHttpResponse;
	String name="Telangana";
	@BeforeMethod
	public void setUp() {
		testBase = new TestBase();
		serviceUrl = prop1.getProperty("covidapi");
	}

	@Test
	public void getAPITest() throws ClientProtocolException, IOException {
		restClient = new Restclient();
		closebaleHttpResponse = restClient.get(serviceUrl);

		// a. Status Code:
		int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code--->" + statusCode);

		Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status code is not 200");

		// b. Json String:
		String responseString = EntityUtils.toString(closebaleHttpResponse.getEntity(), "UTF-8");

		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("Response JSON from API---> " + responseJson);
//				 System.out.println("State wise results : "+responseJson.get("state_meta_data"));
//				 Object result = responseJson.get("state_meta_data");
//				 System.out.println(result);
//				 Object result1 = responseJson.get("district_meta_data");
//				 System.out.println("district meta data is :"+result1);

		JSONArray jsonArray = (JSONArray) responseJson.get("state_meta_data");
		Iterator<Object> iterator = jsonArray.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		String name="T";
//        for(int i=0;i<=jsonArray.length()-1;i++)
//        {
//		JSONObject result = jsonArray.getJSONObject(i);
//		int no = result.getInt("no");
//		String stateut = result.getString("stateut");
//		String abbreviation = result.getString("abbreviation");
//		String population = result.getString("population");
//		if(stateut.startsWith(name))
//		{
//		System.out.println("no is :"+no);
//		System.out.println("stateut is :"+stateut);
//		System.out.println("abbreviation is :"+abbreviation);
//		System.out.println("population is :"+population);
//		System.out.println("----------------------------------");
//		}
//	} 
		for(int i=0;i<=3;i++)
		{
		System.out.println();
		}
		System.out.println("The Districts of Telangana:");
		int count=0;
		JSONArray jsonArray1 = (JSONArray) responseJson.get("district_meta_data");
		 for(int i=0;i<=jsonArray1.length()-1;i++)
	        {
			JSONObject result = jsonArray1.getJSONObject(i);
			String district=result.getString("district");
			String districtkey=result.getString("districtkey");
			String state=result.getString("state");
			String statecode=result.getString("statecode");
			String population=result.getString("population");
			int slno=result.getInt("slno");
            
		    if(state.equals(name))
		    {
		     count++;
			System.out.println("district is :"+district);
			System.out.println("district key is :"+districtkey);
			System.out.println("state is :"+state);
			System.out.println("statecode is :"+statecode);
			System.out.println("population is :"+population);
			System.out.println("slno is :"+slno);
			System.out.println("-----------------------------------");
		    }
			
	        }
		 System.out.println("Total no of districts in Telangana are :"+count);
}
}