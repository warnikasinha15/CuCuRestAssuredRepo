package com.basic.allfilesinsamefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.SendKeysAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneFolderStepDefs{

	WebDriver driver;
	
@Given("the user is on facebook login page")
public void the_user_is_on_facebook_login_page()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\warni\\Downloads\\Selenium\\chromedriver_win32_B45\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}

@When("^he enters \"([^\"]*)\" as user name$") // the special chars given will map the "anil" from OneFolder here
public void he_enters_as_user_name(String userName) {
	driver.findElement(By.id("email")).sendKeys(userName);
	}

@When("^he enters \"([^\"]*)\" as password$")
public void he_enters_as_password(String pswd) throws Throwable {
	driver.findElement(By.id("pass")).sendKeys(pswd);
}

//@When("^he enters \"([^\"]*)\" as user name also \"([^\"]*)\" as password$")
//public void he_enters_as_password(String userName, String pwd) throws Throwable {
//	driver.findElement(By.id("email")).sendKeys(userName);
//	driver.findElement(By.id("pass")).sendKeys(pwd);
//}

@Then("^check username is presesnt in textbox$")
public void check_username_is_presesnt_in_textbox() throws Throwable {
  
}

@Then("^I am valid user$")
public void i_am_valid_user() throws Throwable {
   
}




}


