package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features/EditLead.feature",
		glue = "editleadsteps",
		monochrome = true,
		publish = true)

public class EditLeadRunner extends AbstractTestNGCucumberTests{

}
