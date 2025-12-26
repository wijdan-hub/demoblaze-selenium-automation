package com.wijdan.testing.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By usernameField = By.id("loginusername");
    By passwordField = By.id("loginpassword");
    By loginButton = By.xpath("//button[text()='Log in']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
