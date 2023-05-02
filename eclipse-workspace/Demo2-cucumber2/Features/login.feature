Feature: Login

 @smoke 
Scenario: Successful Login with vlaid credentials 
    Given User launch Chrome browser 
    When user opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title should be "Your store. Login"
    And Close browser 
    
