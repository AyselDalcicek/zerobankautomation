@Account_Activity_Navigation
Feature:Navigating to specific accounts	in	Accounts Activity

  Scenario: Saving account redirect
    Given the user is logged in
    When the user clicks on Saving link on the Account Summary page
    Then the "Account Activity" page should displayed
    And Account drop down should have "Saving" selected

  Scenario: Brokerage account redirect
    Given the user is logged in
    When the user clicks on Brokerage link on the Account Summary page
    Then the "Account Activity" page should displayed
    And Account drop down should have "Brokerage" selected


  Scenario: Checking account redirect
    Given the user is logged in
    When the user clicks on Checking link on the Account Summary page
    Then the "Account Activity" page should displayed
    And Account drop down should have "Checking" selected

  Scenario: CreditCard account redirect
    Given the user is logged in
    When the user clicks on Credit Card link on the Account Summary page
    Then the "Account Activity" page should displayed
    And Account drop down should have "Credit Card" selected

  Scenario: Loan account redirect
    Given the user is logged in
    When the user clicks on Loan link on the Account Summary page
    Then the "Account Activity" page should displayed
    And Account drop down should have "Loan" selected