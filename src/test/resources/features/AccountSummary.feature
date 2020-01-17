@Account_Summary
 Feature: Account Summary

   Background:
     Given user is on the login page
     Then user clicks on 'Sign in' button
     Then user logs in as 'username'
     And user navigates to 'Account Summary' tab

     Scenario: Page title
       Then Account Activity page should have the title Zero-Account Summary

       Scenario: Account dropdown options
         Then Account Summary page should displayed the following options
         | Cash Accounts   |
         | Credit Accounts |
         | Loan Accounts   |
         | Cash Accounts   |

         Scenario: Credit Accounts table
           Then the 'Credit Accounts table' should displayed the columns
             | Accounts    |
             | Credit Card |
             | Balance     |


