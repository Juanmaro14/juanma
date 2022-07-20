package StepDefinition;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.DemoPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {

	WebDriver driver;
	DemoPage demoPage;

	@Given("I am in OrangeHRP Application")
	public void i_am_in_orangehrp_application() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		demoPage = new DemoPage(driver);
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@Then("Login to Application")
	public void login_to_application() {
		demoPage.getUsernameInput().sendKeys("Admin");
		demoPage.getPasswordInput().sendKeys("admin123");
		demoPage.getLoginButton().click();
	}

	@When("Dashboard page is available")
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

	@Then("validate text - Job Title")
	public void validate_text_job_title() {
		assertTrue(driver.getCurrentUrl().contains("viewJobTitleList"));
		assertTrue(demoPage.getJobLink().isDisplayed());
		System.out.println("Jobs Title Heading: " + driver.findElement(By.xpath("//div[@class='head']")).getText());
	}

}
