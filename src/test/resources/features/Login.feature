Feature: Login

  As user, I should be able to login to the zerobank.

  @positive_test
  Scenario: Login with valid credentials
    Given user is on the login page
    Then user logs in as user
    And user verifies that "Account Summary" page should be displayed

  @negative_test
  Scenario: Verify that warning message is displayed when password is not correct
    Given user is on the login page
    Then user enters "username" username and "wrong" password
    And user verifies that "Login and/or password are wrong." message is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when username is not correct
    Given user is on the login page
    Then user enters "wrong_username" username and "password" password
    And user verifies that "Login and/or password are wrong." message is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when password is blank
    Given user is on the login page
    Then user enters "username" username and "" password
    And user verifies that "Login and/or password are wrong." message is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when username is blank
    Given user is on the login page
    Then user enters "" username and "password" password
    And user verifies that "Login and/or password are wrong." message is displayed