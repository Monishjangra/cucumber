package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"stepDefination"},
		monochrome = true,
		plugin = {"pretty","html:target/HtmlReports",
		"pretty","json:target/report.json",
		"pretty","junit:target/report.xml"})
public class TestRunner {

}