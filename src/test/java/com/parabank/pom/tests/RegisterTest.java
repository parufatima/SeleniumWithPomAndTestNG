package com.parabank.pom.tests;

import com.parabank.pom.BaseParaBankTest;
import com.parabank.pom.pages.HomePage;
import com.parabank.pom.pages.LoginPage;
import com.parabank.pom.pages.RegisterPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.annotations.Test;

public class RegisterTest extends BaseParaBankTest {
    public RegisterTest() {
        super();
    }

    @Test
    public void registerShouldSucceed() {
        // Login Page >> Register Page >> Home Page

        String username = LoremIpsum.getInstance().getTitle(1);
         String password= LoremIpsum.getInstance().getTitle(1);

        LoginPage loginPage = new LoginPage();
        RegisterPage registerPage =loginPage
                .clickRegisterLink();
        registerPage = registerPage
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(3))
                .fillCity(LoremIpsum.getInstance().getCity())
                .fillState(LoremIpsum.getInstance().getStateFull())
                .fillZipCode(LoremIpsum.getInstance().getZipCode())
                .fillPhoneNumber(LoremIpsum.getInstance().getPhone())
                .fillSsn(LoremIpsum.getInstance().getPhone())
                .fillUsername(username)
                .fillPassword(password)
                .fillConfirm(password);

        HomePage homePage = registerPage
                .clickRegisterBtn();
    }
    @Test
    public void registerShouldNotSucceed(){
        String username = LoremIpsum.getInstance().getTitle(1);
        String password= LoremIpsum.getInstance().getTitle(1);

        LoginPage loginPage = new LoginPage();
        RegisterPage registerPage =loginPage
                .clickRegisterLink();
        registerPage = registerPage
                .fillPhoneNumber(LoremIpsum.getInstance().getPhone())
                .fillSsn(LoremIpsum.getInstance().getPhone())
                .fillUsername(username)
                .fillPassword(password)
                .fillConfirm(password)
                .clickRegister();
        System.out.println("Total number of error = "+ registerPage.getErrorCount());
    }
}


