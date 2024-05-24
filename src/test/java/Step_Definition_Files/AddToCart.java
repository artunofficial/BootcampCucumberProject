package Step_Definition_Files;

import Pages.AddToCartPage;
import Pages.HomePage;
import Pages.ProductPage;
import driver_factory.DriverFactory_Code;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddToCart {
    public WebDriver driver;
    public ProductPage productPage;
    public AddToCartPage addToCartPage;
    public HomePage homePage;

    @Given("User opens the browser")
    public void user_opens_the_browser() {
        driver = DriverFactory_Code.getDriver();
    }

    @When("User enters a valid product {string}")
    public void user_enters_a_valid_product(String validProductText) {
            homePage = new HomePage(driver);
            homePage.enterProductName(validProductText);
//        driver.findElement(By.name("search")).sendKeys(validProductText);
    }


    @And("User clicks on the search button")
    public void user_clicks_on_the_search_button() {
        homePage = new HomePage(driver);
        homePage.clickOnSearchButton();
    }
    @And ("User clicks add to cart button on product page")
    public void user_clicks_add_to_cart_button_on_product_page() {

        productPage = new ProductPage(driver);
        productPage.setAddValidProductToCart();
    }
    @And ("User clicks add to cart button again")
    public void user_clicks_add_to_cart_button_again(){
        addToCartPage = new AddToCartPage(driver);
        addToCartPage.ClickOnAddToCartOption();
    }
    @Then ("User gets added product alert display in product page")
    public void user_gets_added_product_alert_display_in_product_page() {
        Assert.assertTrue(addToCartPage.verifyAddedProductWarningMessage());
    }

}
