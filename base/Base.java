package com.keyword.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_Driver(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
			  
			  if(prop.getProperty("headless").equals("yes")) {
				  ChromeOptions options = new ChromeOptions();
				  options.addArguments("--headless");
				  driver = new ChromeDriver(options);
			  }
			  else {
				  driver = new ChromeDriver();
			  }
		}
		return driver;
	}
	
	public Properties init_Proiperties()  {
		prop = new Properties();
		try {
		FileInputStream ip = new FileInputStream("C:\\Users\\VINAYAK\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\TestNgExamples\\src\\test\\java\\com\\keyword\\properties\\config.properties");
	    prop.load(ip);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	    
	    return prop;
	}

}
