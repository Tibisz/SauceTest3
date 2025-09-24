package pages;

import Utils.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private final WebDriver driver;
    private final ElementHelper helper;

    /// Locatori pentru butonul de adăugare în coș și pentru iconița coșului
    private final By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    private final  By cartIcon = By.id("shopping_cart_container");

    /// Constructor: inițializează driverul și helper-ul
    public HomePage (WebDriver driver){
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    /// Adaugă produsul "backpack" în coș
    public void addBackpackToCart() {
        helper.click(addToCartBtn);
        //driver.findElement(addToCartBtn).click();
    }

    /// Deschide coșul de cumpărături
    public void openCart() {
        helper.click(cartIcon);
       // driver.findElement(cartIcon).click();
    }
}
