package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AccountPage;
import pageObjects.CamerasPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Steps {

	WebDriver driver;
	public LoginPage loginPage;
	public HomePage homePage;
	public AccountPage accountPage;
	public CamerasPage camerasPage;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		accountPage = new AccountPage(driver);
		camerasPage = new CamerasPage(driver);
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
		driver.close();
	}

	@When("User enters Email as {string} and wrong Password as {string}")
	public void user_enters_email_as_and_wrong_password_as(String email, String password) {
		loginPage.setUserEmailAddress(email);
		loginPage.setPassword(password);
		driver.close();

	}

	@Then("It should display error message")
	public void it_should_display_error_message() {
		Boolean alertDisplayed = loginPage.isAlertMessageDisplayed();
		Assert.assertTrue(alertDisplayed);
		driver.close();

	}

	// Home feature steps

	@Then("I can able to see {string} Tabs on my Home Page")
	public void i_can_able_to_see_tabs_on_my_home_page(String numberOfTabs) {
		int tabsCount = homePage.getTotalNumberOfTabs();
		Assert.assertEquals(String.valueOf(tabsCount), numberOfTabs);
		driver.close();

	}

	@Then("I can able to see first tab name as {string}")
	public void i_can_able_to_see_first_tab_name_as(String string) {
		String name = homePage.getFirstTabName();
		Assert.assertEquals(name, string);
		driver.close();
	}

	@Then("I can able to see second tab name as {string}")
	public void i_can_able_to_see_second_tab_name_as(String string) {
		String name = homePage.getSecondTabName();
		Assert.assertEquals(name, string);
		driver.close();
	}

	// Account feature steps
	@Then("I can able to see account container")
	public void i_can_able_to_see_account_container() {
		Assert.assertTrue(accountPage.isAccountContainerVisible());
		driver.close();
	}

	@Then("I can able to see Edit your account information link")
	public void i_can_able_to_see_edit_your_account_information_link() {
		Assert.assertTrue(accountPage.isEditAccountLinkVisible());
		driver.close();
	}

	@Then("I can able to see Change your password link")
	public void i_can_able_to_see_change_your_password_link() {
		Assert.assertTrue(accountPage.isChangePasswordLinkVisible());
		driver.close();
	}

	@Then("I can able to see Modify your address book entries link")
	public void i_can_able_to_see_modify_your_address_book_entries_link() {
		Assert.assertTrue(accountPage.isModifyAddressLinkVisible());
		driver.close();
	}

	@Then("I can able to see Modify your wish list link")
	public void i_can_able_to_see_modify_your_wish_list_link() {
		Assert.assertTrue(accountPage.isModifyWishLinkVisible());
		driver.close();
	}

	@Then("I can able to see Newsletter link")
	public void i_can_able_to_see_newsletter_link() {
		Assert.assertTrue(accountPage.isNewsletterLinkVisible());
		driver.close();
	}

	@Then("I can able to see Returns link")
	public void i_can_able_to_see_Returns_link() {
		Assert.assertTrue(accountPage.isReturnsLinkVisible());
		driver.close();
	}

	@Then("I can able to see Logout link")
	public void i_can_able_to_see_Logout_link() {
		Assert.assertTrue(accountPage.isLogoutLinkVisible());
	}

	@Then("Click on Logout")
	public void click_on_logout() {
		accountPage.clickLogout();
	}

	@Then("I can able to see Confirm Message")
	public void i_can_able_to_see_confirm_message() {
		Assert.assertTrue(accountPage.isLogoutConfirmMessageVisible());
	}

	@Then("Click on continue")
	public void click_on_continue() {
		accountPage.clickLogoutContinue();
	}

	@Then("I can not see logout link")
	public void i_can_not_see_logout_link() throws InterruptedException {
		boolean match = accountPage.getUrl()
				.equalsIgnoreCase("http://tutorialsninja.com/demo/index.php?route=common/home");
		Assert.assertTrue(match);
		driver.close();
	}

	@Then("I can able to see Order History link")
	public void i_can_able_to_see_order_history_link() {
		Assert.assertTrue(accountPage.isOrderHistoryLinkVisible());
		driver.close();
	}

	@Then("I can able to see Reward Points link")
	public void i_can_able_to_see_reward_points_link() {
		Assert.assertTrue(accountPage.isRewardPointsLinkVisible());
		driver.close();
	}

	@Then("I can able to see Address Book link")
	public void i_can_able_to_see_address_book_link() {
		Assert.assertTrue(accountPage.isAddressBookLinkVisible());
		driver.close();
	}

	@Then("I can able to see Items Add to cart link")
	public void i_can_able_to_see_items_add_to_cart_link() {
		Assert.assertTrue(accountPage.isItemsAddtocardLinkVisible());
		driver.close();
	}

	@Then("I can able to see Wish List link")
	public void i_can_able_to_see_wish_list_link() {
		Assert.assertTrue(accountPage.isWishListLinkVisible());
		driver.close();
	}

	// Cameras feature

	@Then("Click on Cameras")
	public void click_on_cameras() {
		homePage.clickOnCamerasTab();
	}

	@Then("I can able to see Camera page view")
	public void i_can_able_to_see_camera_page_view() {
		Assert.assertTrue(camerasPage.isCamerasPageViewVisible());
	}

	@Then("Click on Canon EOS 5D")
	public void click_on_canon_eos_5d() {
		camerasPage.clickOnCanon();
	}

	@Then("it should show Camera details view")
	public void it_should_show_camera_details_view() {
		Assert.assertTrue(camerasPage.isCanonViewVisible());
		driver.close();
	}

}
