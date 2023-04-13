package com.parabank.pom.tests;

import com.parabank.pom.BaseParaBankTest;
import com.parabank.pom.pages.HomePage;
import com.parabank.pom.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseParaBankTest {
    public LoginTest(){
        super();
    }
    @Test
    public void loginShouldSucceed(){
        HomePage homePage = new LoginPage()
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginButton();
        Assert.assertTrue(homePage.isLogoutTextDisplay());
    }
}
