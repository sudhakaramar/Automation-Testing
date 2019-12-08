package stepdefinition;

import java.util.List;

import org.cucumber.framework.Cucumber_BDD.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage{
	
	TestBase base;
	
	@Given("^Facebook url,id and password$")
	public void facebook_url_id_and_password(DataTable data) throws Throwable {
		List<List<String>> datafields=data.raw();
	      base.driver.get("https://www.facebook.com");
	      base.driver.findElement(By.name("email")).sendKeys(datafields.get(0).get(1));
	     base. driver.findElement(By.name("pass")).sendKeys(datafields.get(1).get(1));
	     	}

	@When("^I login to Facebook$")
	public void i_login_to_Facebook() throws Throwable {
	    
		 base.driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

	@Then("^Facebook Homepage should b displayed$")
	public void facebook_Homepage_should_b_displayed() throws Throwable {

	Assert.assertTrue(base.driver.findElement(By.linkText("Home")).isDisplayed());
	}


}
