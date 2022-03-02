package runner;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@CucumberOptions(
		features = "src/test/java/features/CreateLead.feature",
		glue = "createleadsteps",
		monochrome = true,
		publish = true)

public class CreateLeadRunner extends AbstractTestNGCucumberTests{
      
}
