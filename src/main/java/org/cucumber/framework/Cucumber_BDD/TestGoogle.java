package org.cucumber.framework.Cucumber_BDD;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestGoogle {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        
        Select s=new Select(driver.findElement(By.xpath("")));
        
        driver.get("https://www.google.com");
        WebElement e=driver.findElement(By.name("q"));
        e.sendKeys("java");
        Actions a=new Actions(driver);
        a.sendKeys(Keys.DOWN).build().perform();
        ExpectedCondition<WebElement> exp=new ExpectedCondition<WebElement>() {
			
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath(""));
			}
		};
        
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(exp);

	}

}
