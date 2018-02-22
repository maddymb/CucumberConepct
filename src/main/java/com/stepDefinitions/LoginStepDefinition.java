package com.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

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

	@Then("^User enters Uname \"(.*)\"$")
	public void user_enters_User_Name(String uname) {
	    driver.findElement(By.name("username")).sendKeys(uname);
		
	}

	
	 
	@Then("^User enters Pass \"(.*)\"$")
	public void user_enters_Password(String pass) {
	 System.out.println(pass);
		 driver.findElement(By.name("password")).sendKeys(pass);
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


	@Then("^User goes to Create Contact Page$")
	public void user_goes_to_Create_Contact_Page()  {
	   driver.switchTo().frame("mainpanel");
	    Actions as=new Actions(driver);
	    as.moveToElement(driver.findElement(By.xpath("//a[@title=\"Contacts\"]")));
	    as.build().perform();
	    driver.findElement(By.xpath("//a[@title='New Contact']")).click();
	    
		
	}

	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details_and_and(String fname, String lname, String position) throws Throwable {

		driver.findElement(By.id("first_name")).sendKeys(fname);
		driver.findElement(By.id("surname")).sendKeys(lname);
		driver.findElement(By.id("company_position")).sendKeys(position);
		driver.quit();
	   
	}
	
	
	
	
	
}
