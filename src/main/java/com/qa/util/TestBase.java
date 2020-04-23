package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\52001551\\eclipse-workspace\\POMCucumberBDD\\src\\main\\java\\com\\qa\\configprop\\Config.properties");
			
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
			
		}
	
	public static void initialization() {
		
		String BrowserName = prop.getProperty("Browser");
		
		if(BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS); 
		
		
	
	}
}
