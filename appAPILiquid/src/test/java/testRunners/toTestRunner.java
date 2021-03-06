package testRunners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/resources/features"},
        glue = {"stepDefinitions"},
        tags = {"@ToTest"})
public class toTestRunner {
}
