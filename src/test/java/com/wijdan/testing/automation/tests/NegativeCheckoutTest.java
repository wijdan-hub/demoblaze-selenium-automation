package com.wijdan.testing.automation.tests;

import com.wijdan.testing.automation.base.BaseTest;
import com.wijdan.testing.automation.pages.CartPage;
import com.wijdan.testing.automation.pages.HomePage;
import org.testng.annotations.Test;

public class NegativeCheckoutTest extends BaseTest {

    @Test
    public void checkoutWithoutProduct() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.clickCart();

        CartPage cart = new CartPage(driver);
        cart.clickPlaceOrder();
        cart.clickPurchase();

        // Expected: checkout should be blocked
        // Actual: checkout succeeds (BUG)
    }
}
