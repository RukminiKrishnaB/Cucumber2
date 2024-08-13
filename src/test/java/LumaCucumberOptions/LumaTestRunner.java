package LumaCucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features", glue = "stepDefinitions", tags = "@lumaTest", plugin = {"pretty", "html:target/cucumber-reports.html"}
			)

public class LumaTestRunner {

}
