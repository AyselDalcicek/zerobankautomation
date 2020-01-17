@PayBills
  Feature:Pay Bills
    
    Background:
      Given the user is logged in
      Then User clicks on 'Sign in' button
      Then user logs in as "username"
      And user navigates to 'Pay Bills' tab
      
      Scenario:Page Title 
        Then user verifies that 'Zero - Pay Bills' message is displayed

Feature: Add new payee under pay bills
  Scenario:Add new payee
    Given Add New Payee tab
    And creates new payee using following information
      |Payee Name       | The Low Office od Hyde, Price & Scharks |
      |Payee Address    | 100 Same st, Anytown, USA, 10001        |
      |Account          | Checking                                |
      |Payee Details    | XYZ account                             |
    Then message The new payee The Low Office Hyde, Price & Scharks was successfully created should be displayed

  Scenario: positive pay operation
    Then user enters amount of '500.0'
    Then user enters the date of '2020-19-27'
    And user clicks on the 'Pay' button
    Then user verifies that 'The payment was successfully submitted.' message is displayed

    Scenario Outline: negative pay operation
      Then user enters amount of '<Amount>'
      Then user enters the date of '<Date>'
      And user clicks on the 'Pay' button
      Then user verifies that 'Please fill out this field.' message is displayed

    Examples: Data
    | Amount | Date       |
    | null   | 2020-19-27 |
    | 500    | null       |


#  @BUG
#  Scenario Outline: Pay Operation wrong entries
#    Then user enters payment amount of '<Amount>'
#    And user enters date of '<Date>'
#    Then user verifies that 'date' input box is empty
#    Then user verifies that 'amount' input box is empty
#
#    Examples:
#      | Amount  | Date    |
#      | letters | letters |
#      | !@#$%   | @#$$%^  |
