package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPage {

	public DemoPage(WebDriver rDriver) {
		PageFactory.initElements(rDriver, this);
	}

	// Syntax
	// @FindBy(locator="value")
	// WebElement ref_name;
	// @FindAll(@FindBy(xpath="")

	@FindBy(id = "divLogo")
	WebElement Logo;

	@FindBy(id = "txtUsername")
	WebElement UsernameInput;

	@FindBy(id = "txtPassword")
	WebElement PasswordInput;

	@FindBy(id = "btnLogin")
	WebElement LoginButton;

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement AdminLink;

	@FindBy(id = "menu_admin_UserManagement")
	WebElement UserManagmentLink;

	@FindBy(xpath = "//a[@id='menu_admin_Job']")
	WebElement JobLink;

	@FindBy(id = "menu_admin_viewJobTitleList")
	WebElement JobTitlesLink;

	@FindBy(id = "menu_admin_Organization")
	WebElement OrganizationLink;

	@FindBy(id = "menu_admin_Qualifications")
	WebElement QualificationsLink;

	@FindBy(id = "menu_dashboard_index")
	WebElement DashboardLink;

	@FindBy(css = "#menu_pim_viewPimModule")
	WebElement PIMLink;

	@FindBy(xpath = "//input[@id='empsearch_employee_name_empName']")
	WebElement EmployeeNameInput;

	@FindBy(css = "#menu_time_viewTimeModule")
	WebElement TimeLink;

	@FindBy(css = "#menu_maintenance_purgeEmployee")
	WebElement MaintenanceLink;

	@FindBy(css = "div.quickLaunge a[href='/index.php/leave/assignLeave']")
	WebElement AssignLeaveLink;

	@FindBy(css = "div.quickLaunge a[href='/index.php/time/viewEmployeeTimesheet']")
	WebElement TimesheetsLink;

	@FindBy(css = "#div_graph_display_emp_distribution")
	WebElement EmployeeGraph;

	@FindBy(xpath = "//span[text()='Leave List']")
	WebElement LeaveListButton;

	@FindBy(xpath = "//input[@id='MP_link']")
	WebElement MarketPlaceLink;

	@FindBy(xpath = "//a[@id='welcome']")
	WebElement WelcomeLink;

	public WebElement getLogo() {
		return Logo;
	}

	public WebElement getUsernameInput() {
		return UsernameInput;
	}

	public WebElement getPasswordInput() {
		return PasswordInput;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getAdminLink() {
		return AdminLink;
	}

	public WebElement getUserManagmentLink() {
		return UserManagmentLink;
	}

	public WebElement getJobLink() {
		return JobLink;
	}

	public WebElement getJobTitlesLink() {
		return JobTitlesLink;
	}

	public WebElement getOrganizationLink() {
		return OrganizationLink;
	}

	public WebElement getQualificationsLink() {
		return QualificationsLink;
	}

	public WebElement getDashboardLink() {
		return DashboardLink;
	}

	public WebElement getPIMLink() {
		return PIMLink;
	}

	public WebElement getEmployeeNameInput() {
		return EmployeeNameInput;
	}

	public WebElement getTimeLink() {
		return TimeLink;
	}

	public WebElement getMaintenanceLink() {
		return MaintenanceLink;
	}

	public WebElement getLeaveListButton() {
		return LeaveListButton;
	}

	public WebElement getMarketplaceLink() {
		return MarketPlaceLink;
	}

	public WebElement getWelcomeLink() {
		return WelcomeLink;
	}
}
