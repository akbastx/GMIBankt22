package gmiBank_team22.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "gmiBank_team22/step_Definitions",
        tags = "@Admin_08"

        // dryRun = true
)
public class US_017_Admins_Runner {
}
