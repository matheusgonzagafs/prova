package provaTecnica.runnerTests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber.json"},
        features = "src/test/resources/provaTecnica/features",
        glue = "provaTecnica.runnerTests",
        monochrome = true
)
public class RunCucumberTest {
}