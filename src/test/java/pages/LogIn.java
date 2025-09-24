package pages;

import Utils.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

///Page Object pentru pagina de Login de pe SauceDemo.
////  Se ocupă cu deschiderea paginii și autentificarea utilizatorului.

public class LogIn {
    private final WebDriver driver;
    private final ElementHelper helper;

    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id ("login-button");

    public LogIn(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }

    //// Deschide pagina principală a site-ului
    public void open() {
        driver.get("https://www.saucedemo.com/");
    }

    //// Autentificare folosind username și password
    public void login(String username, String password) {

        helper.insertText(usernameField, username);

        helper.insertText(passwordField, password);
        helper.click(loginButton);

       // driver.findElement(usernameField).sendKeys(username);
       // driver.findElement(passwordField).sendKeys(password);
        //driver.findElement(loginButton).click();
    }

}
