package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driverObject){
		this.driver = driverObject;
		PageFactory.initElements(driverObject, this);
	}
	
	@FindBy(id="input-email")
	@CacheLookup
	WebElement inputEmail;
	
	@FindBy(id="input-password")
	@CacheLookup
	WebElement inputPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	@CacheLookup
	WebElement login;
	
	@FindBy(xpath="//h2[normalize-space()='My Orders']")
	WebElement myOrders;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement alertMessage;
	
	public void setUserEmailAddress(String email) {
		inputEmail.clear();
		inputEmail.sendKeys(email);
	}
	
	public void setPassword(String password) {
		inputPassword.clear();
		inputPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public String getHomePageMyOrdersLabelText() {
		return myOrders.getText();
	}
	
	public Boolean isAlertMessageDisplayed() {
		return alertMessage.isDisplayed();
	}
	
}
