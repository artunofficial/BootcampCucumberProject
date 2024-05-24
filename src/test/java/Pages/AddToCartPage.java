package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
    public WebDriver driver;

    @FindBy(css = "button#button-cart.btn.btn-primary.btn-lg.btn-block")
    private WebElement addToCartOption;

    @FindBy(xpath = "//div[text() ='Success: You have added ']")
    private WebElement addedProductWarningMessage;

    @FindBy(css = "span#cart-total")
    private WebElement cartTotalDropdown;

    @FindBy(linkText = "View Cart")
    private WebElement viewCartText;

    @FindBy(linkText = "Checkout")
    private WebElement checkoutText;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickOnAddToCartOption() {
        addToCartOption.click();

    }

    public boolean verifyAddedProductWarningMessage() {
       boolean displayStatus = addedProductWarningMessage.isDisplayed();
       return displayStatus;
    }

    public void clickOnAddedCart() {
        cartTotalDropdown.click();
    }

    public void clickOnViewCart() {
        cartTotalDropdown.click();
        viewCartText.click();
    }

    public void clickOnCheckout() {
        cartTotalDropdown.click();
        checkoutText.click();
    }



}
