package Hooks;

import Utilities.ConfigReader;
import Utilities.Util;
import driver_factory.DriverFactory_Code;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Properties;

public class MyHooks {
    public WebDriver driver;

    @Before
    public void setup() throws Exception{
        Properties prop = ConfigReader.initializePropertiesFile();
        DriverFactory_Code.initializeBrowser(prop.getProperty("browser"));
        driver = DriverFactory_Code.getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Util.IMPLICIT_WAIT_TIME));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Util.PAGE_LOAD_TIME));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Util.SCRIPT_TIME));
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
