Feature: Add Cart

  @addCart
  Scenario: Add car for rent with valid data
    Given User launches Chrome Browser
    When User opens ilcarro Home Page
    And User clicks on the Log in Link
    And User enter valid data
    And User click on the Yalla button
    And User click on the Let the car work
    And User enter a pickUpPlace
    And User enter a make
    And User enter a model
    And User enter year
    And User selects fuel
    And User enter number if seats
    And User enter car class
    And User enter registration number
    And User enter price
    And User upload car photo
    And User click on the submit button