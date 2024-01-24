package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAccount {

	WebDriver driver = new ChromeDriver();

	@Given("Launch the Browser")
	public void launch_the_Browser() {
		driver.get("https://www.verizon.com/");

	}

	@Given("Open the WebApplication")
	public void open_the_WebApplication() {
		driver.manage().window().maximize();
	}

	@When("click on signin button")
	public void click_on_signin_button() {
		System.out.println(driver.getTitle());
	}

	@When("signin to open account")
	public void signin_to_open_account() {

	}

	@When("select account type of postpaid")
	public void select_account_type_of_postpaid() {

	}

	@Then("enter the username and password")
	public void enter_the_username_and_password() {

	}

	@Then("click on submit button")
	public void click_on_submit_button() {

	}

}
