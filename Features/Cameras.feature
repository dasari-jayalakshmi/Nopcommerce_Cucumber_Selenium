#Author: dasari.jayalakshmi17@gmail.com

@Cameras
Feature: Cameras

  @UnitTest @Cameras
  Scenario: Test Camera page view
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see Logout link
    And Click on Cameras
    Then I can able to see Camera page view
  

 @UnitTest @Cameras
  Scenario: Test Camera details view for Canon EOS 5D
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see Logout link
    And Click on Cameras
    Then I can able to see Camera page view
    And Click on Canon EOS 5D
    Then it should show Camera details view