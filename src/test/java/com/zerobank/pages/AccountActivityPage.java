package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPage extends BasePage {


    @FindBy(xpath = "//a[.='Account Activity']")
    public WebElement accountActivityTab;

    @FindBy(css = "[class='input-xlarge']")
    public WebElement accountDropdown;

    @FindBy(xpath = "//option[.='Checking']")
    public WebElement checking;

    @FindBy(xpath = "//option[text()='Savings'][1]")
    public WebElement savings;

    @FindBy(xpath = "//option[.='Loan']")
    public WebElement loan;

    @FindBy(xpath = "//option[.='Credit Card']")
    public WebElement creditCard;

    @FindBy(xpath = "//option[.='Brokerage']")
    public WebElement brokerage;

    @FindBy(xpath = "//div//table//thead")
    public WebElement transactionsTable;

    public AccountActivityPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public void pageSubTitle(){
        accountActivityTab.click();
        Driver.get().getTitle();
    }

    public void getDropdownOptions(String str){
        WebElement dropdown = Driver.get().findElement(By.cssSelector("[id='aa_accountId']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(str);
    }

}
