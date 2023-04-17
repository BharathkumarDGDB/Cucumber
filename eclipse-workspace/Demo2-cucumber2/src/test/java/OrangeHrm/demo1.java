package OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class demo1 {
	WebDriver driver;
	@Given("I launch chrome browser1")
	public void i_launch_chrome_browser1() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
	System.out.println("Chrome successfully logged in");	
	driver.manage().window().maximize();
	}

	@When("I open orange hrm homepage1")
	public void i_open_orange_hrm_homepage1() {
		driver.get("https://www.orangehrm.com/blog/web-based-hr-management/");
	}

	@Then("I verifny that the logo present on page1")
	public void i_verifny_that_the_logo_present_on_page1() {
		  boolean status = driver.findElement(By.xpath("//img[@alt='OrangeHRM Logo']")).isDisplayed();
			Assert.assertEquals(true,status);

	}

	@Then("Close browser1")
	public void close_browser1() {
		driver.quit();
	}

}
