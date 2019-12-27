package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {

    @FindBy(css= "[id='signin_button']")
    public WebElement signinButton;

    @FindBy(css = "input[type='text']")
    public WebElement userNameInput;

    @FindBy(css="[id='user_password']")
    public WebElement passwordInput;

    @FindBy(className = "btn btn-primary")
    public WebElement LoginButton;

    @FindBy(css = "[class = 'alert alert-error']")
    public WebElement warningMessage;

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void login(String userName, String password){
        BrowserUtils.waitForStaleElement(signinButton);
        signinButton.click();
        BrowserUtils.wait(3);
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password, Keys.ENTER);
    }
}
