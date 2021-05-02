package com.org.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class Restclient {
	CloseableHttpResponse httpResponse;
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
        httpResponse=httpClient.execute(httpGet);
	    return httpResponse;
	}
	
	public CloseableHttpResponse post(String url,String entityString,HashMap<String,String> headersmap) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(new StringEntity(entityString));
		for(Map.Entry<String,String> entry : headersmap.entrySet()){
			httpPost.addHeader(entry.getKey(), entry.getValue());
		}
		
		CloseableHttpResponse closebaleHttpResponse = httpClient.execute(httpPost);
		return closebaleHttpResponse;
		
	}

	public CloseableHttpResponse put(String url,String entityString,HashMap<String,String> headersmap) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPut httpPost = new HttpPut(url);
		httpPost.setEntity(new StringEntity(entityString));
		for(Map.Entry<String,String> entry : headersmap.entrySet()){
			httpPost.addHeader(entry.getKey(), entry.getValue());
		}
	 httpResponse = httpClient.execute(httpPost);
		return httpResponse ;
	}
	
	public CloseableHttpResponse delete(String url) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpDelete httpdelete = new HttpDelete(url);
        httpResponse=httpClient.execute(httpdelete);
	    return httpResponse;
	}
		
	
	
	

}
