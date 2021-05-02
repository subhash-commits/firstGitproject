package com.org.restapi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public int RESPONSE_STATUS_CODE_200 = 200;
	public int RESPONSE_STATUS_CODE_500 = 500;
	public int RESPONSE_STATUS_CODE_400 = 400;
	public int RESPONSE_STATUS_CODE_401 = 401;
	public int RESPONSE_STATUS_CODE_201 = 201;
	public int RESPONSE_STATUS_CODE_204 = 204;

  public Properties prop1;
	public TestBase(){
		try {
			prop1 = new Properties();
		
			FileInputStream ip = new FileInputStream("C:\\Users\\SUBHASH KALVAKOLU\\eclipse-workspace\\firstapitestingproject\\"
					+ "src\\main\\java\\com\\org\\config\\config.properties");
			prop1.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
