package Runner_Files;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        dryRun = false,
        monochrome = true,
        features = {"src/test/resources/feature_files"},
        glue = {"Step_Definition_Files", "Hooks"},
        plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json"},
        tags = "@TutorialsNinjaLogout")

public class Runner_TestNG extends AbstractTestNGCucumberTests {


}

//tags = "@TutorialsNinjaLogin or @TutorialsNinjaRegistration or @TutorialsNinjaSearchProduct or @TutorialsNinjaAddToCart"