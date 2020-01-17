package com.zerobank.step_definitions;


import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AccountActivityNavigation_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @Then("user clicks on {string} button")
    public void user_clicks_on_button(String string) {

    }

    @When("user clicks on {string} on the link Account Summary Page")
    public void user_clicks_on_on_the_link_Account_Summary_Page(String string) {

    }

    @Then("user verifies that the page title is {string}")
    public void user_verifies_that_the_page_title_is(String string) {


}


//    @Given("the user is logged in")
//    public void the_user_is_logged_in() {
//        System.out.println("Login as user");
//        Driver.get().get(ConfigurationReader.getProperty("url"));
//        String userName = ConfigurationReader.getProperty("user_name");
//        String password = ConfigurationReader.getProperty("password");
//        loginPage.login(userName, password);
//    }
//
//    @When("the user clicks on Saving link on the Account Summary page")
//    public void the_user_clicks_on_Saving_link_on_the_Account_Summary_page() throws InterruptedException {
//        System.out.println("Clicks on saving link");
//        Thread.sleep(3000);
//        accountActivityPage.savings.click();
//    }
//
//    @Then("the Account Activity page should displayed")
//    public void the_Account_Activity_page_should_displayed() throws InterruptedException {
//        System.out.println("Account Activity page is displayed ");
//        Thread.sleep(3000);
//        accountActivityPage.accountActivityTab.isDisplayed();
//    }
//
//    @Then("Account drop down should have Saving selected")
//    public void account_drop_down_should_have_Saving_selected() {
//        System.out.println("Saving option is selected");
//        Assert.assertEquals(  "Saving ", accountActivityPage.accountDropdown.getText());
//
//    }
//
//    @When("the user clicks on Brokerage link on the Account Summary page")
//    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
//        System.out.println("Click on Brokerage link");
//        accountSummaryPage.accountSummaryTab.click();
//        accountSummaryPage.BrokerageLink.click();
//
//    }
//
//    @Then("Account drop down should have Brokerage selected")
//    public void account_drop_down_should_have_Brokerage_selected() {
//        System.out.println("Brokerage option is selected");
//        Assert.assertEquals(  "Brokerage ", accountActivityPage.accountDropdown.getText());
//    }
//
//    @When("the user clicks on Checking link on the Account Summary page")
//    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
//        System.out.println("Click on Checking link");
//        accountSummaryPage.accountSummaryTab.click();
//        accountSummaryPage.CheckingLink.click();
//
//    }
//
//    @Then("Account drop down should have Checking selected")
//    public void account_drop_down_should_have_Checking_selected() {
//        System.out.println("Checking option is selected");
//        Assert.assertEquals(  "Checking ", accountActivityPage.accountDropdown.getText());
//    }
//
//    @When("the user clicks on Credit Card link on the Account Summary page")
//    public void the_user_clicks_on_Credit_Card_link_on_the_Account_Summary_page() {
//        System.out.println("Click on Credit Card link");
//        accountSummaryPage.accountSummaryTab.click();
//        accountSummaryPage.CreditCardLink.click();
//
//    }
//
//    @Then("Account drop down should have Credit Card selected")
//    public void account_drop_down_should_have_Credit_Card_selected() {
//        System.out.println("Credit Card is selected");
//        Assert.assertEquals(  "Credit Card ", accountActivityPage.accountDropdown.getText());
//    }
//
//    @When("the user clicks on Loan link on the Account Summary page")
//    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
//        System.out.println("Click on Loan link");
//        accountSummaryPage.accountSummaryTab.click();
//        accountSummaryPage.LoanLink.click();
//    }
//
//    @Then("Account drop down should have Loan selected")
//    public void account_drop_down_should_have_Loan_selected() {
//        System.out.println("Credit Loan is selected");
//        Assert.assertEquals(  "Loan", accountActivityPage.accountDropdown.getText());
//    }




}
