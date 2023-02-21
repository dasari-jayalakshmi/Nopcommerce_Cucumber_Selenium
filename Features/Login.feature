#Author: dasari.jayalakshmi17@gmail.com

@Login
Feature: Login
  I want to use these scenarious for Login Feature

  @IntegrationTest @UnitTest
  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then Page Title should be "My Orders"
    
  @UnitTest
  Scenario: Unsuccessful Login with in valid Credentials
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and wrong Password as "WrongPassword"
    And Click on Login
    Then It should display error message


