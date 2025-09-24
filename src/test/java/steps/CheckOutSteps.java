package steps;

import base.BaseTest;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import pages.LogIn;
import pages.CheckOut;
import pages.Cart;
import pages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/// Clasa care conține implementarea pașilor Cucumber pentru scenariul de checkout.
///   Leagă pașii scriși în fișierul .feature de acțiunile din paginile aplicației.




public class CheckOutSteps extends BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(CheckOutSteps.class);
    private LogIn loginPage;
    private Cart cart;
    private CheckOut checkOutPage;
    private HomePage homePage;

    ///Constructor care primește o instanță de BaseTest (dependency injection).
            /// În acest fel folosim același driver inițializat în BaseTest pentru toate paginile.
    public CheckOutSteps() {


        /// Inițializăm obiectele pentru pagini cu driver-ul din BaseTest
        this.loginPage = new LogIn(driver);
        this.cart = new Cart(driver);
        this.checkOutPage = new CheckOut(driver);
        this.homePage = new HomePage(driver);
    }
    @Given("I open the Sauce Demo site")
    public void i_open_the_sauce_demo_site(){
        logger.info("STEP: Opening Sauce Demo site");
        /// Deschidem pagina principală a site-ului
        loginPage.open();
///  Mesaj în consolă pentru debug



    }
    @And("I log in with valid credentials")
    public void i_log_in_with_valid_credentials(){
        logger.info("STEP: Logging in with valid credentials");
        loginPage = new LogIn(driver);


        /// Apelăm metoda login din LogIn Page Object
        loginPage.login("standard_user","secret_sauce");



    }
    @When ("I add the first product to the cart")
    public void i_add_the_first_product_to_the_cart(){
        logger.info("STEP: Adding first product to cart");

        /// // Re-instanțiem pagina de Home și adăugăm produsul în coș
        homePage = new HomePage(driver);
        homePage.addBackpackToCart();

    }

    @And("I proceed to checkout with my details")
    public void i_proceed_to_checkout_with_my_details(){
        logger.info("STEP: Proceeding to checkout");

        homePage.openCart();
        cart.clickCheckout();
        checkOutPage.fillInformation("Adifha", "Adifha", "12345");
        checkOutPage.continueButton();
    }
    @And("I complete the order")
    public void i_complete_the_order(){
        logger.info("STEP: Finishing checkout");
        checkOutPage.finishButton();
    }

}
