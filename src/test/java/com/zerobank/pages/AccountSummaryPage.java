package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPage extends BasePage {

    @FindBy(xpath = "//a[.='Account Summary']")
    public WebElement accountSummaryTab;

    @FindBy(linkText= "Savings")
    public WebElement SavingsLink;

    @FindBy(linkText= "Brokerage")
    public WebElement BrokerageLink;//checking

    @FindBy(linkText= "Checking")
    public WebElement CheckingLink;  //Credit Card

    @FindBy(linkText= "Credit Card")
    public WebElement CreditCardLink;

    @FindBy(linkText= "Loan")
    public WebElement LoanLink;

    @FindBy(xpath = "//h2[.='Cash Accounts'] ")
    public WebElement Cash;

    @FindBy(xpath = "//h2[.='Investment Accounts'] ")
    public WebElement Investment;

    @FindBy(xpath = "//h2[.='Credit Accounts'] ")
    public WebElement Credit;

    @FindBy(xpath = "//h2[.='Loan Accounts'] ")
    public WebElement Loan;

    @FindBy(xpath = "//div[3]//table//thead//tr")
    public WebElement CreditAccountsTable;





    public AccountSummaryPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public void pageSubTitle(){
        accountSummaryTab.click();
        Driver.get().getTitle();
    }

}
