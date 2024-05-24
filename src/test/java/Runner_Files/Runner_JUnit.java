package Runner_Files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = {"src/test/resources/feature_files"},
        glue = {"Step_Definition_Files", "Hooks"},
        plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json"},
        tags = "@TutorialsNinjaLogin or @TutorialsNinjaRegistration or @TutorialsNinjaSearchProduct or @TutorialsNinjaAddToCart or @TutorialsNinjaLogout")

public class Runner_JUnit {

}


//@TutorialsNinjaLogin or @TutorialsNinjaRegistration or @TutorialsNinjaSearchProduct or @TutorialsNinjaAddToCart or @TutorialsNinjaLogout