package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

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

	@Then("^User enters User Name$")
	public void user_enters_User_Name() {
	    driver.findElement(By.name("username")).sendKeys("maddymb");
		
	}

	@Then("^User enters Password$")
	public void user_enters_Password() {
	 
		 driver.findElement(By.name("password")).sendKeys("madhur123");
	}

	@Then("^User clicks on Login Button$")
	public void user_clicks_on_Login_Button()  {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='Login']")));
		
	}

	@Then("^Verify User is on Home Page$")
	public void verify_User_is_on_Home_Page() {
		
		System.out.println(driver.getTitle());
		driver.quit();
	}


	
	
}
