package com.qa.testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TC001 extends TestBase {

	@Test(priority = 2)
	public void dashboardVerification() {
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println("Title of the website: " + driver.getTitle());
		demoPage.getUsernameInput().sendKeys("Admin");
		demoPage.getPasswordInput().sendKeys("admin123");
		demoPage.getLoginButton().click();
		assertTrue(driver.getCurrentUrl().contains("dashboard"));
		demoPage.getAdminLink().click();
		assertTrue(demoPage.getUserManagmentLink().isDisplayed());
		assertTrue(demoPage.getJobLink().isDisplayed());
		assertTrue(demoPage.getOrganizationLink().isDisplayed());
		assertTrue(demoPage.getQualificationsLink().isDisplayed());
		demoPage.getDashboardLink().click();
		//Missing validations after click
	}

	@Test(priority = 1)
	public void login() {
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println("Title of the website: " + driver.getTitle());
		demoPage.getUsernameInput().sendKeys("Admin");
		demoPage.getPasswordInput().sendKeys("admin123");
		demoPage.getLoginButton().click();
		//Missing validations after click
	}

	@Test(priority = 3)
	public void pimScenario() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println("Title of the website: " + driver.getTitle());
		demoPage.getUsernameInput().sendKeys("Admin");
		demoPage.getPasswordInput().sendKeys("admin123");
		demoPage.getLoginButton().click();
		demoPage.getPIMLink().click();
		demoPage.getEmployeeNameInput().clear();
		demoPage.getEmployeeNameInput().sendKeys("Linda Anderson");
		demoPage.getSearchButton().click();
		//Missing validations after click
	}

}
