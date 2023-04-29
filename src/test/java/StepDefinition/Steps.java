package StepDefinition;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import com.qa.testscripts.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends TestBase{
	
	@Before
	public void initDriver() {
		this.setUp();
		this.startup();

	}

	@After
	public void teardown() {
		this.finish();
	}

	@Given("I am in OrangeHRP Application")
	public void i_am_in_orangehrp_application() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com");
	}
	
	@When("Login to Application")
	public void login_to_application() {
		demoPage.getUsernameInput().sendKeys("Admin");
		demoPage.getPasswordInput().sendKeys("admin123");
		demoPage.getLoginButton().click();
	}

	@Then("Dashboard page is available")
	public void dashboard_page_is_available() {
		assertTrue(driver.getCurrentUrl().contains("dashboard"));

	}

	@And("click on Admin menu")
	public void click_on_admin_menu() {
		demoPage.getAdminLink().click();
	}

	@Then("Click on Job")
	public void click_on_job() {
		demoPage.getJobLink().click();
		demoPage.getJobTitlesLink().click();

	}

	@And("validate text - Job Title")
	public void validate_text_job_title() {
		assertTrue(driver.getCurrentUrl().contains("viewJobTitleList"));
		assertTrue(demoPage.getJobLink().isDisplayed());
		System.out.println("Jobs Title Heading: " + driver.findElement(By.xpath("//h6[text()='Job Titles']")).getText());
	}

}
