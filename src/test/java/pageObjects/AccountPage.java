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
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Newsletter']")
	@CacheLookup
	WebElement newsLetterLink;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Returns']")
	@CacheLookup
	WebElement returnsLink;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	@CacheLookup
	WebElement logoutLink;
	
	@FindBy(xpath="//p[contains(text(),'Your shopping cart has been saved, the items insid')]")
	@CacheLookup
	WebElement logoutConfirmMessage;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	@CacheLookup
	WebElement continueLogout;
	

	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Order History']")
	@CacheLookup
	WebElement orderhistoryLink;
	

	@FindBy(xpath="//a[normalize-space()='Reward Points']")
	@CacheLookup
	WebElement rewardhistoryLink;
	

	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	@CacheLookup
	WebElement itemsaddtocardLink;
	

	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Address Book']")
	@CacheLookup
	WebElement addressbookLink;
	

	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Wish List']")
	@CacheLookup
	WebElement wishlistLink;
	
	@FindBy(xpath="//a[@class='list-group-item active']")
	@CacheLookup
	WebElement tabletsLink;
	
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
	
	public boolean isNewsletterLinkVisible() {
		return newsLetterLink.isDisplayed();
	}

	public boolean isReturnsLinkVisible() {
		return returnsLink.isDisplayed();
   
}

	public boolean isLogoutConfirmMessageVisible() {
		return continueLogout.isDisplayed();
	}

	public void clickLogout() {
		logoutLink.click();
	}
	

	public boolean isLogoutLinkVisible() {
		return logoutLink.isDisplayed();
	}
	
	public void clickLogoutContinue() {
		continueLogout.click();
	}
	
	public boolean validateLogout() {
		 logoutLink.click();
		 return logoutConfirmMessage.isDisplayed();
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
	
	public boolean isOrderHistoryLinkVisible() {
		return orderhistoryLink.isDisplayed();
	}

	public boolean isRewardPointsLinkVisible() {
		return rewardhistoryLink.isDisplayed();
	}
	public boolean isItemsAddtocardLinkVisible() {
		return itemsaddtocardLink.isDisplayed();
	}
	public boolean isAddressBookLinkVisible() {
		return addressbookLink.isDisplayed();
	}
	public boolean isWishListLinkVisible() {
		return wishlistLink.isDisplayed();
	}
	public boolean isTabletsLinkVisible() {
		return tabletsLink.isDisplayed();
	}
}
