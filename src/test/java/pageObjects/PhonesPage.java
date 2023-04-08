package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhonesPage {

	public WebDriver driver;
	
	public PhonesPage(WebDriver driverObject){
		this.driver = driverObject;
		PageFactory.initElements(driverObject, this);
	}
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']//a[contains(text(),'Phones & PDAs')]")
	@CacheLookup
	WebElement phoneLink;
	
	@FindBy(xpath="//div[@class='image']//img[@title='iPhone']")
	@CacheLookup
	WebElement iphoneView;
	
    public void clickPhoneLink() {
    	phoneLink.click();
    }
    
	public Boolean isIphoneViewVisible() {
		clickPhoneLink();
		return iphoneView.isDisplayed();
	}
	
}