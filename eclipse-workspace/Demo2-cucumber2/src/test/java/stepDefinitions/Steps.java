package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pageObjects.Loginpage;

public class Steps {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;
	public Loginpage lp;
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
		driver=new ChromeDriver();
		lp=new Loginpage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.alertIsPresent());
	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	lp.getTxtemail().clear();
	lp.getTxtemail().sendKeys(email);
	lp.getTxtpassword().clear();
	lp.getTxtpassword().sendKeys(password);
	}

	@When("Click on Login")
	public void click_on_login() {
		lp.getBtnLogin().click();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String Title) {
		if(driver.getPageSource().contains("Login was unsuccesful")) {
			driver.close();
			Assert.assertTrue(false);
		}else
		{
			Assert.assertEquals(Title, driver.getTitle());
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		lp.getBtnLogout().click();
		Thread.sleep(3000);
	}

	@Then("Close browser")
	public void close_browser() {
		driver.close();
	}
}
