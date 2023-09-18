package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "F:/folder/shopping-application/cucumber_practice/src/main/java/features/Login.feature",
        glue = {"stepDefinations"}
)
public class TestRunner {

}
