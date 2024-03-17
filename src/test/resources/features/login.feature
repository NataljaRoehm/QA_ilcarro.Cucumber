Feature: Login

  @validData
  Scenario: User can log in with valid data
    Given User launches Chrome Browser
    When User opens ilcarro Home Page
    And User clicks on the Log in Link
    And User enter valid data
    And User click on the Yalla button
    Then User verifies Success message is displayed
    And User quites browser

  @invalidPassword
  Scenario Outline: User can't log in with valid email and invalid password
    Given User launches Chrome Browser
    When User opens ilcarro Home Page
    And User clicks on the Log in Link
    And User enter valid email and invalid password
      | email   | password   |
      | <email> | <password> |
    And User click on the Yalla button
    Then User verifies Error message is displayed
    And User quites browser
    Examples:
      | email        | password       |
      | gtfhk@gm.com | IlCaro78!!     |
      | gtfhk@gm.com | ilсro78!$      |
      | gtfhk@gm.com | ILCARO78!$     |
      | gtfhk@gm.com | ILCAROilcaro!$ |
      | gtfhk@gm.com | 3456897665$    |
      | gtfhk@gm.com | @$$$$$$$$$$    |