#Author: your.email@your.domain.com

Feature: Cucumber Scenarios
	
	@Regression
  Scenario: Cucumber Scenario 1
    Given I am in OrangeHRP Application
    Then Login to Application
    When Dashboard page is available
		And click on Admin menu
	
	@Regression	  
	Scenario: Cucumber Scenario 2
    Given I am in OrangeHRP Application
    Then Login to Application
    When click on Admin menu
    Then Click on Job
		And validate text - Job Title
		
	@Smoke	  
	Scenario: Cucumber Scenario 3
    Given I am in OrangeHRP Application
    Then Login to Application
    When click on Admin menu
    Then Click on Job
		And validate text - Job Title
		
	@Smoke	  
  Scenario: Cucumber Scenario 4
    Given I am in OrangeHRP Application
    Then Login to Application
    When Dashboard page is available
		And click on Admin menu
		
