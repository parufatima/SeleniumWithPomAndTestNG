package com.parabank.pom.pages;

import com.parabank.pom.BaseParaBankTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseParaBankTest {
    @FindBy(css="[name='username']")
    WebElement usernameEl;
    @FindBy(css="[name='password']")
    WebElement passwordEl;
    @FindBy(css = "input.button")
    WebElement loginBtn;
    public LoginPage(){
        PageFactory.initElements(driver , this);
    }
    public LoginPage fillUsername(String username){
        usernameEl.isDisplayed();
        usernameEl.clear();
        usernameEl.sendKeys(username);
        return this;
    }
    public LoginPage fillPassword(String password){
        passwordEl.isDisplayed();
        passwordEl.clear();
        passwordEl.sendKeys(password);
        return this;
    }
    public HomePage clickLoginButton(){
        loginBtn.isDisplayed();
        loginBtn.click();
        return new HomePage();
    }

}
