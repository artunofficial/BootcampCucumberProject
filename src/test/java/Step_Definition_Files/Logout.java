package Step_Definition_Files;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.LogoutPage;
import driver_factory.DriverFactory_Code;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Logout {
        public WebDriver driver;
        public HomePage homePage;
        public LoginPage loginPage;
        public AccountPage accountPage;
        public LogoutPage logoutPage;

        @Given ("User navigating to login page")
        public void user_navigating_to_login_page() {
                driver = DriverFactory_Code.getDriver();
                homePage = new HomePage(driver);
                homePage.clickOnMyAccount();
                loginPage = new LoginPage(driver);
                loginPage = homePage.selectLoginOption();
        }

        @When ("^user enters valid email address (.+)$")
        public void user_enters_valid_email_address(String emailText){
                loginPage = new LoginPage(driver);
                loginPage.enterEmail(emailText);
        }

        @And ("^User enters a valid password (.+)$")
        public void user_enters_a_valid_password(String passwordText) {
                loginPage = new LoginPage(driver);
                loginPage.enterPassword(passwordText);
        }

        @And ("User clicks on the login button")
        public void user_clicks_on_the_login_button(){
                loginPage = new LoginPage(driver);
                accountPage = new AccountPage(driver);
                accountPage = loginPage.clickOnLoginButton();
        }

        @And ("User directed to the Account Page")
        public void user_directed_to_the_Account_Page() {
                accountPage = new AccountPage(driver);
                Assert.assertTrue(accountPage.validateDisplayStatusOfLogoutLink());
        }

        @And ("User clicks on Logout linktext")
        public void user_clicks_on_Logout_linktext() {
                logoutPage = new LogoutPage(driver);
                logoutPage.clickingOnLogout();
        }

        @Then ("User gets logout alert")
        public void user_gets_logout_alert(){
                logoutPage = new LogoutPage(driver);
                Assert.assertTrue(logoutPage.getLogoutAlert().contains("Account Logout"));
        }

        @And ("User clicks on My Account dropdown")
        public void User_clicks_on_My_Account_dropdown() {
                homePage = new HomePage(driver);
                homePage.clickOnMyAccount();
        }

        @And ("User clicks on Logout dropdown")
        public void User_clicks_on_Logout_dropdown() {
                logoutPage = new LogoutPage(driver);
                logoutPage.clickingOnLogoutDropdown();
        }




}
