package com.qa.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.qa.pages.DemoPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	protected WebDriver driver;
	DemoPage DemoPage;

	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DemoPage = new DemoPage(driver);
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@BeforeTest
	public void startup() {
		System.out.println("Starting....");
	}

	@AfterTest
	public void finish() {
		System.out.println("Finishing....");
	}

	@AfterSuite
	public void tearDown() {
		driver.close();

	}

	public WebDriver getDriver() {
		return this.driver;
	}

}
