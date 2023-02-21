#Author: dasari.jayalakshmi17@gmail.com

@Home
Feature: Home Page
  I want to test Home Page

  @IntegrationTest @UnitTest @SanityTest
  Scenario: My Home Page should have Tabs
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see "4" Tabs on my Home Page

  @IntegrationTest @UnitTest @SanityTest
  Scenario: First tab name should be Desktops
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see first tab name as "Desktops"

  @IntegrationTest @UnitTest @SanityTest
  Scenario: Second tab name should be Laptops & Notebooks
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see second tab name as "Laptops & Notebooks"
