package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagefactory.FlipkartPage;

public class StepDefinition {


	WebDriver driver;
    FlipkartPage flipkartPage;

@BeforeTest
	@Given("Navigate to Flipkart page")
	public void navigate_to_flipkart_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M\\eclipse-workspace\\Sample\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		flipkartPage = PageFactory.initElements(driver, FlipkartPage.class);
	}


	@When("Close login popup")
	public void close_login_popup() {
	    
        
        WebElement close = flipkartPage.getClose();
		
		close.click();
		
	}

	@When("Click any banner on display")
	public void click_any_banner() throws Throwable {

		Thread.sleep(3000);
				
		flipkartPage.getBanner().click();
		
	}

	@When("Mouse hover on Electronics Tab")
	public void mouse_hover_on_electronics() throws Throwable {
		
        Actions actions = new Actions(driver);
		
		Thread.sleep(5000);
				
		WebElement mouse = flipkartPage.getElectronicsTab();
		
		actions.moveToElement(mouse).perform();
		
		Thread.sleep(5000);
	    
	}

	@Then("Print all Mobile brand under Mobiles Tab")
	public void print_all_Mobile_brand_under_Mobiles() {
		
		// find all the sub-menu items and store them in a List	
		
		  List<WebElement> m = flipkartPage.getMobilesTab();

	    // iterate through the List and print each sub-menu item with a number before it, starting from 1
	    
		  for(int i = 1; i< m.size(); i++) {
		         //obtain text
		         String s = m.get(i).getText();
		         System.out.println(i +". " + s);		   
	      }
		  
		  driver.quit();

	    
	}



}