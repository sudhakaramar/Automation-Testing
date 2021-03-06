package org.cucumber.framework.Cucumber_BDD;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Function;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	  
    			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
    	          WebDriver driver=new ChromeDriver();
    	          driver.get("https://www.flipkart.com");
    	          System.out.println(driver.getPageSource());
    	          List<String> element=new ArrayList<String>(driver.getWindowHandles());
    	         driver.manage().timeouts().pageLoadTimeout(500,TimeUnit.SECONDS);
    	        WebDriverWait wai=new WebDriverWait(driver, 10);
    	        wai.until(ExpectedConditions.alertIsPresent());
    	        
    	        Actions a=new Actions(driver);
    	        
    	      
    	        
    	        WebDriverWait wait=new WebDriverWait(driver, 5);
    	        
    	        wait.until(new java.util.function.Function<WebDriver, WebElement>() {
    	        	public WebElement apply(WebDriver driver)
    	        	{
    	        		return null;
    	        	}
				});
    	       
    	       
    	        WebElement e2=driver.findElement(By.xpath(""));
    	        Actions a1=new Actions(driver);
    	        a1.moveToElement(e2).click().keyDown(e2,Keys.SHIFT)
    	        .sendKeys(e2,"")
    	        .keyUp(e2,Keys.SHIFT)
    	        .contextClick().build().perform();
    	        System.out.println("adding to merge");
                


    }
}
