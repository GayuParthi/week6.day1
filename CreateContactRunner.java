package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features/CreateContact.feature",
		glue = "createcontactsteps",
		monochrome = true,
		publish = true)
public class CreateContactRunner extends AbstractTestNGCucumberTests {

}
