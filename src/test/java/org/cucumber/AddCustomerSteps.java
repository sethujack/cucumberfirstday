package org.cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps {
	static WebDriver driver;
	@Given("the user is in telecom homepage")
	public void the_user_is_in_telecom_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sethujack\\eclipse-workspace\\Cucum\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("the user click on add customer")
	public void the_user_click_on_add_customer(){
	driver.findElement(By.xpath("//a[text()='Add Customer'][1]")).click();  
	}

	@When("the user in filling all details")
	public void the_user_in_filling_all_details() {
driver.findElement(By.xpath("//label[@for='done']")).click();
driver.findElement(By.id("fname")).sendKeys("sethu");
driver.findElement(By.id("lname")).sendKeys("jack");
driver.findElement(By.id("email")).sendKeys("abc_sethu@email.com");
driver.findElement(By.name("addr")).sendKeys("thoraipakkam");
driver.findElement(By.id("telephoneno")).sendKeys("1234567890");
	}

	@When("the user click on submit button")
	public void the_user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("the user id should be displayed to customer id")
	public void the_user_id_should_be_displayed_to_customer_id() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
		
	}



}
