#Author: Juan Manuel Roust

Feature: Cucumber Scenarios
	
	@Regression
  	Scenario: Cucumber Scenario 1
    Given I am in OrangeHRP Application
    When Login to Application
    Then Dashboard page is available
	And click on Admin menu
	
	@Regression	  
	Scenario: Cucumber Scenario 2
    Given I am in OrangeHRP Application
    When Login to Application
    And click on Admin menu
    Then Click on Job
	And validate text - Job Title
		
