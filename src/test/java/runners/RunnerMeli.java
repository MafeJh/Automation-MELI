package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = "stepdefinitions",
        features = "src/test/resources/features/meli.feature",
        snippets = SnippetType.CAMELCASE)
public class RunnerMeli {
}
