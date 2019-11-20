package Runners;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith (CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/feature/CreacionCuentaApp.feature",
        glue = {"StepDefinitions"}
)

public class CreacionCuentaAppRunners {
}
