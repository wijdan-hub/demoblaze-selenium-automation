package com.wijdan.testing.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    By placeOrderBtn = By.xpath("//button[text()='Place Order']");
    By purchaseBtn = By.xpath("//button[text()='Purchase']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPlaceOrder() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(placeOrderBtn).click();
    }

    public void clickPurchase() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(purchaseBtn).click();
    }
}
