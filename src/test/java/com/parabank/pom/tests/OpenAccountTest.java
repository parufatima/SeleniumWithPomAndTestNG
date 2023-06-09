package com.parabank.pom.tests;

import com.parabank.pom.BaseParaBankTest;
import com.parabank.pom.pages.LoginPage;
import com.parabank.pom.pages.OpenAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAccountTest extends BaseParaBankTest {

    public OpenAccountTest() {
        super();
    }

    @Test
    public void openAccountShouldSucceed()  {
        OpenAccountPage openAccountPage;
        LoginPage loginPage = new LoginPage()
                .fillUsername(getUsername())
                .fillPassword(getPassword());

        openAccountPage = loginPage
                .clickLoginButton()
                .clickOpenAccountLink()
                .clickOpenNewAccountBtn();
        Assert.assertTrue(openAccountPage.hasAccountOpenSmsDisplay());

    }

}
