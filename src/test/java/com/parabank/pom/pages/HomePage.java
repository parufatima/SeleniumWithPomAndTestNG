package com.parabank.pom.pages;

import com.parabank.pom.BaseParaBankTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseParaBankTest {
    @FindBy(linkText = "Log Out")
    WebElement logoutText;
    @FindBy(linkText = "Open New Account")
    WebElement openNewAccountLink;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public OpenAccountPage clickOpenAccountLink(){

        openNewAccountLink.isDisplayed();
        openNewAccountLink.click();
        return new OpenAccountPage();
    }
    public boolean  isLogoutTextDisplay(){
        return logoutText.isDisplayed();
    }

}
