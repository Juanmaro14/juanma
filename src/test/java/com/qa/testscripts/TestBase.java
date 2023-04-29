package com.qa.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.qa.pages.DemoPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	protected WebDriver driver;
	protected DemoPage demoPage;

	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
	}

	@BeforeMethod
	public void startup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		demoPage = new DemoPage(driver);
		System.out.println("Starting....");
	}

	@AfterMethod
	public void finish() {
		System.out.println("Finishing....");
		driver.close();
	}

	@AfterSuite
	public void tearDown() {
		System.out.println("Finishing Suite....");
	}

	public WebDriver getDriver() {
		return this.driver;
	}

}
