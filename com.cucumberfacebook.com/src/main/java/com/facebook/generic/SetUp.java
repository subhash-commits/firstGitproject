package com.facebook.generic;

	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import cucumber.api.testng.AbstractTestNGCucumberTests;

	public class SetUp extends AbstractTestNGCucumberTests{

		public static String parameters = "./src/main/resources/Input-data/BDD-facebook.xlsx"; // Parameters WorkBook path
		public static String appDetails = "details"; // SheetName where Parameters exists
		String url="https://www.facebook.com";
		
		public static WebDriver driver;
		public static WebDriverWait wait;
		

		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		}
	}


