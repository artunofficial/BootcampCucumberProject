package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public WebDriver driver;

    @FindBy(linkText = "Logout")
    private WebElement logoutLinktext;

    @FindBy(xpath = "//h1[text() = 'Account Logout']")
    private WebElement logoutAlert;

    @FindBy(css = "ul.dropdown-menu.dropdown-menu-right>li+li+li+li+li")
    private WebElement logoutDropdown;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickingOnLogout() {
        logoutLinktext.click();
    }

    public String getLogoutAlert() {
        String logoutWarning = logoutAlert.getText();
        return logoutWarning;
    }

    public void clickingOnLogoutDropdown() {
        logoutDropdown.click();
    }


}
