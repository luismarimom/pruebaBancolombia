package co.com.bancolombia.prueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registroUtest.feature",
        glue = {"co.com.bancolombia.prueba.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {



}
