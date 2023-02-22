#Author: dasari.jayalakshmi17@gmail.com

@Account
Feature: Account Page
  I want to test everything working in Account Page

  @IntegrationTest @UnitTest @SanityTest
   Scenario: I can able to see AccountSection
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see account container

  @IntegrationTest @UnitTest
    Scenario: Account page should have Edit your account information
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see Edit your account information link
    
    @IntegrationTest @UnitTest
    Scenario: Account page should have Change your password
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see Change your password link
    
    @IntegrationTest @UnitTest
    Scenario: Account page should have Modify your address book entries
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see Modify your address book entries link
    
    @IntegrationTest @UnitTest
    Scenario: Account page should have Modify your wish list
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see Modify your wish list link
    
    @IntegrationTest @UnitTest @SanityTest
    Scenario: First tab name should be Desktops
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see first tab name as "Desktops"
    
    @IntegrationTest @UnitTest
    Scenario: It should have Newsletter link
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see Newsletter link
    
    
    @IntegrationTest @UnitTest
    Scenario: It should have Returns link
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see Returns link
    
    
    @IntegrationTest @UnitTest
    Scenario: It should have Logout link
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see Logout link
    
    @IntegrationTest @UnitTest @UAT
    Scenario: validate logout link
    Given User Launch Chrome browser
    When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enters Email as "dasari.jayalakshmi17@gmail.com" and Password as "Test12345"
    And Click on Login
    Then I can able to see Logout link
    And Click on Logout
    Then I can able to see Confirm Message
    And Click on continue
    Then I can not see logout link
    

