package com.parabank.pom.pages;

import com.parabank.pom.BaseParaBankTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends BaseParaBankTest {
    @FindBy(css = "input.button")
    WebElement openNewAccountBtn;
    @FindBy(css = "#newAccountId")
    WebElement newAccountId;

    public OpenAccountPage(){
        PageFactory.initElements(driver,this);
    }
    public OpenAccountPage clickOpenNewAccountBtn(){
        openNewAccountBtn.isDisplayed();
        openNewAccountBtn.click();
        return this;
    }
    public boolean hasNewAccountIdDisplay(){
       return newAccountId.isDisplayed();
    }

}
