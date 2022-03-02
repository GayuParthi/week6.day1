package createleadsteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import steps.BaseClass;

public class CreateLeadSteps  {
	public ChromeDriver driver;   
	
@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Given("Load the application url as {string}")
	public void load_the_application_url(String url) {
		driver.get(url);
	}
	@Given("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanger(String username) {
		driver.findElement(By.name("USERNAME")).sendKeys(username);	
	}
	@Given("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("Click on Login")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@When("Click on Homepage")
	public void click_on_Homepage() {
		driver.findElement(By.className("crmsfa")).click();
	}
	
	@When("Click on Leads Button")
	public void click_on_leads_button() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("Click on create Lead Button")
	public void click_on_create_lead_button() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter all the fields in CreateLead information")
	public void createLeadForm_companyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	}
	@Given("Enter createLeadForm firstName as {string}")
	public void createLeadForm_firstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	@Given("Enter createLeadForm_lastName as {string}")
	public void createLeadForm_lastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	@Given("Enter createLeadForm_birthDate")
	public void createLeadForm_birthDate() {
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("3/04/1999");
	}
	@Given("Enter createLeadForm_primaryPhoneAreaCode")
	public void createLeadForm_primaryPhoneAreaCode() {
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
	}
	@Given("Enter createLeadForm_primaryPhoneExtension")
	public void createLeadForm_primaryPhoneExtension() {
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("22");
	}
	@Given("Enter createLeadForm_primaryEmail")
	public void enter_all_the_fields_in_create_lead_information() {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
	}
	@Given("Enter createLeadForm_primaryPhoneNumber")
	public void createLeadForm_primaryPhoneNumber() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9457861236");
	}
	@Given("Enter createLeadForm_primaryPhoneAskForName")
	public void createLeadForm_primaryPhoneAskForName() {
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Arith");
	}
	@Given("Enter createLeadForm_primaryWebUrl")
	public void createLeadForm_primaryWebUrl() {
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google.com");
	}
	@Given("Enter createLeadForm_generalToName")
	public void createLeadForm_generalToName() {
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ashwin");
	}
	@Given("Enter createLeadForm_generalAttnName")
	public void createLeadForm_generalAttnName() {
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Alice");
	}
	@Given("Enter createLeadForm_generalAddress1")
	public void createLeadForm_generalAddress1() {
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("123,ECR road");
	}
	@Given("Enter createLeadForm_generalAddress2")
	public void createLeadForm_generalAddress2() {
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("TVK nagar");
	}
	@Given("Enter createLeadForm_generalCity")
	public void createLeadForm_generalCity() {
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
	}
	@Given("Enter createLeadForm_generalStateProvinceGeoId")
	public void createLeadForm_generalStateProvinceGeoId() {
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tennessee");
	}
	@Given("Enter createLeadForm_generalPostalCode")
	public void createLeadForm_generalPostalCode() {
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("640037");
	}
	@Given("Enter createLeadForm_generalPostalCodeExt")
	public void createLeadForm_generalPostalCodeExt() {
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("05");
	}
	@Then("Click on create Lead ButtonSubmit")
	public void click_on_create_lead_button1() {
		driver.findElement(By.name("submitButton")).click();
	}

}