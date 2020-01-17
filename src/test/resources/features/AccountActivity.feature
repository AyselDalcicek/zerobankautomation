@Account_Activity
Feature:Navigating to specific accounts	in	Accounts Activity


  Background:
    Given the user is logged in
    Then User clicks on 'Sign in' button
    Then user logs in as "username"
    And user navigates to 'Account Activity' tab

  Scenario:Verify page Title
    Then the page title is 'Zero - Account Activity'

  Scenario:Verify dropdown option
    Then Account drop down should have 'Savings' selected

  Scenario:Verify Account drop down
    Then the Account Activity page should displayed the following options
    | Savings     |
    | Checking    |
    | Savings     |
    | Loan        |
    | Credit Card |
    | Brokerage   |

    Scenario: Transactions Table headers
      Then the 'Transactions Table' should displayed the columns
    | Date        |
    | Description |
    | Deposit     |
    | Withdrawal  |

