package com.wijdan.testing.automation.tests;

import com.wijdan.testing.automation.base.BaseTest;
import com.wijdan.testing.automation.pages.HomePage;
import com.wijdan.testing.automation.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginValidUser() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.clickLogin();

        LoginPage login = new LoginPage(driver);
        login.login("wijdan", "Wijdan123");
    }
}
