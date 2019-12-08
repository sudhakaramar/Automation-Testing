package stepdefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDef {
	
	public static WebDriver driver;
		@Given("^User is on Home Page$")
		public void User_is_on_Home_Page() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/mercurysignon.php");
		}

		@When("^User Navigate to LogIn Page$")
		public void User_Navigate_to_LogIn_Page() throws Throwable {
			// Express the Regexp above with the code you wish you had
			System.out.println("Navigating to Login Page");

		}

		/*
		 @When("^User enters UserName and Password$")
		public void User_enters_UserName_and_Password() throws Throwable {
		    // Express the Regexp above with the code you wish you had


		       driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("pbunny");
		       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("padala");
		}
		 */

		@When("^User enters Credentials to LogIn$")
		public void user_enters_testuser_and_Test(DataTable dt) throws Throwable {

			//Write the code to handle Data Table
		
			
			
			
			
			for (Map<String, String> data : dt.asMaps(String.class,String.class))
			{
				driver.findElement(By.name("userName")).sendKeys(data.get("Username"));;
				
				driver.findElement(By.name("password")).sendKeys(data.get("Password"));
					}
			
			driver.findElement(By.name("login")).click();
			
		}

		/*	@When("^User enters Credentials to LogIn$")
		public void user_enters_testuser_and_Test(List<Credentials>  usercredentials) throws Throwable {
	    //Write the code to handle Data Table
		 * 
			for (Credentials credentials : usercredentials) {			
				driver.findElement(By.id("log")).sendKeys(credentials.getUsername()); 
			    driver.findElement(By.id("pwd")).sendKeys(credentials.getPassword());
			    driver.findElement(By.id("login")).click();}
				}*/		
		@Then("^Message displayed Login Successfully$")
		public void Message_displayed_Login_Successfully() throws Throwable {
			// Express the Regexp above with the code you wish you had

			driver.findElement(By.name("login")).click();

		}

		@When("^User LogOut from the Application$")
		public void User_LogOut_from_the_Application() throws Throwable {
			// Express the Regexp above with the code you wish you had

			Thread.sleep(2000);
			if(driver.getPageSource().contains("SIGN-OFF"))

			{

				System.out.println(" Login test scenario validated");
				driver.findElement(By.partialLinkText("SIGN-OFF")).click();

			}
		}

		@Then("^Message displayed LogOut Successfully$")
		public void Message_displayed_LogOut_Successfully() throws Throwable {
			// Express the Regexp above with the code you wish you had
			System.out.println("Verified log out page");
		}

	}


