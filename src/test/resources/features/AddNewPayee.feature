@Add_New_Payee
Feature: Add new payee under pay bills
  Scenario:Add new payee
    Given Add Neww Payee tab
    And creates new payee tab
    |Payee Name       | The Low Office od Hyde, Price & Scharks |
    |Payee Address    | 100 Same st, Anytown, USA, 10001        |
    |Account          | Checking                                |
    |Payee Details    | XYZ account                             |
    Then message The new payee The Low Office Hyde, Price & Scharks was successfully created should be displayed