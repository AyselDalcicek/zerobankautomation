package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));

    }

    @Then("user logs in as user")
    public void user_logs_in_as_user() {
        System.out.println("Login as user");
        String  userName = ConfigurationReader.getProperty("user_name");
        String  password = ConfigurationReader.getProperty("password");
        loginPage.login(userName, password);

    }

    @Then("user verifies that {string} page should be displayed")
    public void user_verifies_that_page_should_be_displayed(String string) {
        System.out.println(string);
        Assert.assertEquals(string, loginPage.getPageSubTitle());
        System.out.println("verified that " +string+ " page is displayed");

    }

    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        System.out.println("Login with "+string+ " username and " +string2+ " password");
        loginPage.login(string,string2);

    }

    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
        System.out.println("verify that warning message is displayed: "+string);
        Assert.assertEquals(string, loginPage.warningMessage.getText());

    }


}


