Feature: OrangeHRM Login

  Scenario: Logo presence on OrangeHRM home page
    Given I launch chrome browser
    When I open orange hrm homepage
    Then I verifny that the logo present on page
    And Close browser