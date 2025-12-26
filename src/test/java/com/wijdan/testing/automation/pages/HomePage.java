package com.wijdan.testing.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    By loginMenu = By.id("login2");
    By cartMenu = By.id("cartur");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin() {
        driver.findElement(loginMenu).click();
    }

    public void clickCart() {
        driver.findElement(cartMenu).click();
    }
}
