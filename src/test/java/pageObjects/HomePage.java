package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	
	public HomePage(WebDriver driverObject){
		this.driver = driverObject;
		PageFactory.initElements(driverObject, this);
	}
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']")
	@CacheLookup
	WebElement navBar;
	
	@FindBy(xpath="//a[normalize-space()='Desktops']")
	@CacheLookup
	WebElement firstTab;
	
	@FindBy(xpath="//a[normalize-space()='Laptops & Notebooks']")
	@CacheLookup
	WebElement secondTab;
	
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	@CacheLookup
	WebElement cartButton;
	
	@FindBy(css="ul.navbar-nav li")
	@CacheLookup
	WebElement tabs;

	
	public int getTotalNumberOfTabs() {
	    List<WebElement> buttons = driver.findElements(By.cssSelector(".navbar ul.navbar-nav li.dropdown"));
		return buttons.size();
	}
	
	public String getFirstTabName() {
		return firstTab.getText();
	}
	

	public String getSecondTabName() {
		return secondTab.getText();
	}
}
