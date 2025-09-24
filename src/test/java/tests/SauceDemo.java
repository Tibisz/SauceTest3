package tests;

import pages.LogIn;
import pages.HomePage;
import pages.Cart;
import pages.CheckOut;
import base.BaseTest;
import org.junit.jupiter.api.Test;



public class SauceDemo extends BaseTest {
    @Test
    public void checkoutFlow(){
        /// Inițializare pagini

        LogIn logIn = new LogIn(driver);
        HomePage homePage = new HomePage(driver);
        Cart cart = new Cart(driver);
        CheckOut checkOut = new CheckOut(driver);

        /// Flux complet de checkout
        logIn.open();
        logIn.login("standard_user","secret_sauce");
        homePage.addBackpackToCart();
        homePage.openCart();
        cart.clickCheckout();

        checkOut.fillInformation("Adifha","Adifha", "12345");
        checkOut.continueButton();
        checkOut.finishButton();


        //find by element
        //checkOut.fillInformation("Adifha", "Adifha", "12345");
       // checkOut.continueButton();

        //checkOut.finishOrder();

    }
}
