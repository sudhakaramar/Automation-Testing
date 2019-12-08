package org.cucumber.framework.Cucumber_BDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;


public class TestBase {

	
public	static WebDriver driver;
	@Before
	public void init()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
}
