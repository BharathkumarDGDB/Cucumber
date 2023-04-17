package OrangeHrm;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class demo {
	
	static {
//		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}
 WebDriver driver;

	@Given("^I launch chrome browser$")
	public void i_launch_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	driver=new ChromeDriver();
	}

	@When("^I open orange hrm homepage$")
	public void i_open_orange_hrm_homepage() throws Throwable {
		driver.get("https://www.orangehrm.com/blog/web-based-hr-management/");
	}

	@Then("^I verify that the logo present on page$")
	public void i_verify_that_the_logo_present_on_page() throws Throwable {
   boolean status = driver.findElement(By.xpath("//img[@alt='OrangeHRM Logo']")).isDisplayed();
	Assert.assertEquals(true,status);
	}

	@And("^Close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
	}
//	@Given("I launch chrome browser")
//	public void i_launch_chrome_browser() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("I open orange hrm homepage")
//	public void i_open_orange_hrm_homepage() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("I verify that the logo present on page")
//	public void i_verify_that_the_logo_present_on_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Close browser")
//	public void close_browser() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

