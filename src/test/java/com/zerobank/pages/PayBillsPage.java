package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PayBillsPage extends BasePage {

    @FindBy(xpath = "//a[.='Pay Bills']")
    public WebElement payBillsPage;

    @FindBy(xpath = "//a[text()='Add New Payee']")
    public WebElement addNewPayee;

    @FindBy(css = "[id='np_new_payee_name']")
    public WebElement payeename;

    @FindBy(css = "[id='np_new_payee_address']")
    public WebElement payeeAddress;

    @FindBy(css = "[id='np_new_payee_account']")
    public WebElement acount;

    @FindBy(css = "[id='np_new_payee_details']")
    public WebElement payeeDetails;

    @FindBy(css = "[id='add_new_payee']")
    public WebElement addButton;


    @FindBy(css = "[name='payee']")   /// ????
    public WebElement payee;

    @FindBy(css = "[name='account']")   /// ????
    public WebElement account;

    @FindBy(css = "[name='amount']")
    public WebElement amount;

    @FindBy(css = "[name='date']")   /// ??????
    public WebElement date;

    @FindBy(css = "[name='description']")
    public WebElement description;

    @FindBy(id = "pay_saved_payees")
    public WebElement payButton;

    @FindBy(css = "div[id='alert_content']")
    public WebElement message;

    @FindBy()
    public WebElement warningMessage;   /// ??????

    public PayBillsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public void pageSubTitle(){
        payBillsPage.click();
        Driver.get().getTitle();
    }

    public void getDropdownOptions(String str){
        WebElement dropdown = Driver.get().findElement(By.cssSelector("[name='payee']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(str);
    }


}
