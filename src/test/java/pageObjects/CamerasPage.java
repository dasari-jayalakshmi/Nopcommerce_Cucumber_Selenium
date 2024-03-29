package pageObjects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CamerasPage {

	public WebDriver driver;

	public CamerasPage(WebDriver driverObject) throws IOException {
		this.driver = driverObject;
		PageFactory.initElements(driverObject, this);
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[1]")
	@CacheLookup
	WebElement camerasContainer;

	@FindBy(xpath = "//a[normalize-space()='Canon EOS 5D']")
	@CacheLookup
	WebElement canonLink;

	@FindBy(xpath = "(//a[@title='Canon EOS 5D'])[1]")
	@CacheLookup
	WebElement canonUi;

	@FindBy(xpath = "//a[normalize-space()='Nikon D300']")
	@CacheLookup
	WebElement nikonLink;

	@FindBy(xpath = "//img[@title='Nikon D300")
	@CacheLookup
	WebElement nikonUi;

	public Boolean isCamerasPageViewVisible() {
		return camerasContainer.isDisplayed();
	}

	public void clickOnCanon() {
		canonLink.click();
	}

	public Boolean isCanonViewVisible() {
		return canonUi.isDisplayed();
	}

	public void clickOnNikon() {
		nikonLink.click();
	}

	public Boolean isNikonViewVisible() {
		return nikonUi.isDisplayed();
	}
}
