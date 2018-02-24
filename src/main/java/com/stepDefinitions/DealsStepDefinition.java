/*
  package com.stepDefinitions;
 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsStepDefinition {

	WebDriver driver;
	
	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page() {
	  
System.setProperty("webdriver.chrome.driver", "/Users/maddy/Documents/Selenium/Jars/chromedriver");
		
		driver=new ChromeDriver();
		driver.get("https://freecrm.com");
		driver.manage().window().maximize();
	    
	}

	@When("^Title of Login Page is FreeCRM$")
	public void title_of_Login_Page_is_FreeCRM() {
	    
		
		System.out.println(driver.getTitle());
		
		
	}

	@Then("^User enters Uname and password$")
	public void user_enters_Uname_and_password(DataTable credentials) {
	   
		List<List<String>> value= credentials.raw();
		driver.findElement(By.name("username")).sendKeys(value.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(value.get(0).get(1));
	}
 	

	@Then("^User clicks on Login Button$")
	public void user_clicks_on_Login_Button()  {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='Login']")));
		
	}

	@Then("^Verify User is on Home Page$")
	public void verify_User_is_on_Home_Page() throws InterruptedException {
		
		System.out.println(driver.getTitle());
		String t=driver.getTitle();
		Assert.assertEquals("CRMPRO",t );
		Thread.sleep(3000);
		
		
	}


	@Then("^User goes to Deals Page$")
	public void user_goes_to_Deals_Page() throws InterruptedException {
		driver.switchTo().frame("mainpanel");
	    Actions as=new Actions(driver);
	    as.moveToElement(driver.findElement(By.xpath("//a[@title=\"Deals\"]")));
	    as.build().perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@title='New Deal']")).click();
	}

	@Then("^user enters deals details$")
	public void user_enters_deals_details(DataTable dealsValue)  {
		
		List<List<String>> value=dealsValue.raw();
		
		driver.findElement(By.id("title")).sendKeys(value.get(0).get(0));
		driver.findElement(By.id("amount")).sendKeys(value.get(0).get(1));
		driver.findElement(By.id("probability")).sendKeys(value.get(0).get(2));
		driver.quit();
		
	}
	
	
	
	
	
}
*/
