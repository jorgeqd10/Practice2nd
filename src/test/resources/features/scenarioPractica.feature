Feature: smoke testing
  Scenario: Validate use case 015
    Given I am opening sauce page
    When User enters valid credentials
    |standard_user      |     secret_sauce  |
    Then I click on sauce labs backpack add to cart button
    Then I click on sauce labs bike light add to cart button
    Then I click on sauce labs t shirt add to cart button
    Then I click shopping cart button
    Then I validate "Sauce Labs Backpack" is displayed
    Then I validate "29.99" price is displayed
    Then I validate "Sauce Labs Bike Light" is displayed
    Then I validate "9.99" price is displayed
    Then I validate "Sauce Labs Bolt T-Shirt" is displayed
    Then I validate "15.99" price is displayed
    And I click checkout button
    Then I fill out my information "dato1", "dato2", "dato3"
    And I click continue button
    And I validate "Sauce Labs Bike Light" is displayed on overview
    Then I click finish button



