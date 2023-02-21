package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
public WebDriver driver;
	
	public AccountPage(WebDriver driverObject){
		this.driver = driverObject;
		PageFactory.initElements(driverObject, this);
	}
	
	@FindBy(xpath="//div[@id='account-account']")
	@CacheLookup
	WebElement accountContainer;
	
	@FindBy(xpath="//a[normalize-space()='Edit your account information']")
	@CacheLookup
	WebElement editAccountLink;
	
	@FindBy(xpath="//a[normalize-space()='Change your password']")
	@CacheLookup
	WebElement changePasswordLink;
	
	@FindBy(xpath="//a[normalize-space()='Modify your address book entries']")
	@CacheLookup
	WebElement modifyAddressLink;
	
	@FindBy(xpath="//a[normalize-space()='Modify your wish list']")
	@CacheLookup
	WebElement modifyWishListLink;
	
	public boolean isAccountContainerVisible() {
		return accountContainer.isDisplayed();
	}
	
	public boolean isEditAccountLinkVisible() {
		return editAccountLink.isDisplayed();
	}
	
	public boolean isChangePasswordLinkVisible() {
		return changePasswordLink.isDisplayed();
	}
	
	public boolean isModifyAddressLinkVisible() {
		return modifyAddressLink.isDisplayed();
	}
	
	public boolean isModifyWishLinkVisible() {
		return modifyWishListLink.isDisplayed();
	}

}
