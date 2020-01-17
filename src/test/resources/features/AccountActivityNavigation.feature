@Account_Activity_Navigation

Feature: Navigating to Accounts Activity

  Background:
    Given user is on the login page
    Then user clicks on 'Sign in' button
    Then user logs in as 'username'
    
    Scenario Outline:<Type> account redirect
      When user clicks on '<Link>' on the link Account Summary Page
      Then user verifies that the page title is 'Zero - Account Activity'
      And Account drop down should have '<Option>' selected

      Examples:Data
#      | Type         | Link         | Option        |
#      | Savings      | Savings      | Savings       |
#      | Checking     | Checking     | Checking      |
#      | Credit Card  | Credit Card  | Credit Card   |
#      | Loan         | Loan         | Loan          |


          | Link         | Option        |
          | Savings      | Savings       |
          | Checking     | Checking      |
          | Credit Card  | Credit Card   |
          | Loan         | Loan          |