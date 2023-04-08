package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabletsPage {

	public WebDriver driver;
	
	public TabletsPage(WebDriver driverObject){
		this.driver = driverObject;
		PageFactory.initElements(driverObject, this);
	}
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']//a[contains(text(),'Tablets')]")
	@CacheLookup
	WebElement tabletsLink;
	
	@FindBy(xpath="//img[@title='Samsung Galaxy Tab 10.1']")
	@CacheLookup
	WebElement samsungGalaxyView;
	
    public void clickTabletsLink() {
    	tabletsLink.click();
    }
    
	public Boolean isSamsungGalaxyViewVisible() {
		clickTabletsLink();
		return samsungGalaxyView.isDisplayed();
	}
	
}
