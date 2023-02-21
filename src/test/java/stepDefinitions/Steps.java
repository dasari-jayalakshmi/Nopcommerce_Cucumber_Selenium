package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Steps {

	WebDriver driver;
	public LoginPage loginPage;
	public HomePage homePage;
    public AccountPage accountPage;
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		accountPage = new AccountPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		loginPage.setUserEmailAddress(email);
		loginPage.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
		loginPage.clickLogin();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String text) {
		String title = loginPage.getHomePageMyOrdersLabelText();
		Boolean match = title.equalsIgnoreCase(text);
		Assert.assertTrue(match);
	}

	@When("User enters Email as {string} and wrong Password as {string}")
	public void user_enters_email_as_and_wrong_password_as(String email, String password) {
		loginPage.setUserEmailAddress(email);
		loginPage.setPassword(password);
	}

	@Then("It should display error message")
	public void it_should_display_error_message() {
		Boolean alertDisplayed = loginPage.isAlertMessageDisplayed();
		Assert.assertTrue(alertDisplayed);
		driver.quit();
	}

	// Home feature steps

	@Then("I can able to see {string} Tabs on my Home Page")
	public void i_can_able_to_see_tabs_on_my_home_page(String numberOfTabs) {
		int tabsCount = homePage.getTotalNumberOfTabs();
		Assert.assertEquals(String.valueOf(tabsCount), numberOfTabs);
		 
	}

	@Then("I can able to see first tab name as {string}")
	public void i_can_able_to_see_first_tab_name_as(String string) {
		String name = homePage.getFirstTabName();
		Assert.assertEquals(name, string);
	}

	@Then("I can able to see second tab name as {string}")
	public void i_can_able_to_see_second_tab_name_as(String string) {
		String name = homePage.getSecondTabName();
		Assert.assertEquals(name, string);
		driver.quit();
	}
	
	
	//Account feature steps
	@Then("I can able to see account container")
	public void i_can_able_to_see_account_container() {
		Assert.assertTrue(accountPage.isAccountContainerVisible());
	}

	@Then("I can able to see Edit your account information link")
	public void i_can_able_to_see_edit_your_account_information_link() {
		Assert.assertTrue(accountPage.isEditAccountLinkVisible());
	}

	@Then("I can able to see Change your password link")
	public void i_can_able_to_see_change_your_password_link() {
		Assert.assertTrue(accountPage.isChangePasswordLinkVisible());
	}

	@Then("I can able to see Modify your address book entries link")
	public void i_can_able_to_see_modify_your_address_book_entries_link() {
		Assert.assertTrue(accountPage.isModifyAddressLinkVisible());
	}

	@Then("I can able to see Modify your wish list link")
	public void i_can_able_to_see_modify_your_wish_list_link() {
		Assert.assertTrue(accountPage.isModifyWishLinkVisible());
		driver.quit();
	}
}
