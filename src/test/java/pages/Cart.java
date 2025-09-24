package pages;

import Utils.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
    private final WebDriver driver;
    private final ElementHelper helper;

///  Locator pentru butonul de checkout
    private final By checkoutButton = By.id("checkout");

    /// Constructor: inițializează driverul și helper-ul pentru interacțiuni

    public Cart (WebDriver driver) {
        this.driver = driver; this.helper = new ElementHelper(driver);
    }
    /// Metodă care dă click pe butonul de checkout din coș

    public void clickCheckout() {
        helper.click(checkoutButton);

        // driver.findElement(checkoutButton).click();


    }
}
