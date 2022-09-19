package org.example.runners;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "org.example.steps"
        ,features = "src/test/resources/features/MiPrimerFeature.feature"
)
public class MiPrimerFeatureRunner {
}
