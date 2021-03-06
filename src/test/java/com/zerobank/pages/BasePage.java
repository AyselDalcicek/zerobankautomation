package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    @FindBy(css= "[id='account_summary_tab']")
    public WebElement pageSubTitle;



    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public String  getPageSubTitle(){
        BrowserUtils.waitForStaleElement(pageSubTitle);
        return  pageSubTitle.getText();
    }


}
