package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id = "Email")
	WebElement txtemail;
	
	@FindBy(id = "Password")
	WebElement txtpassword;
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement btnLogin;
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement btnLogout;
	
	public Loginpage(WebDriver driver) {
    	PageFactory.initElements(driver, this);  	
    }

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}

	
}
