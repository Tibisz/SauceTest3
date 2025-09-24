package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

///ElementHelper este o clasă utilitară care simplifică interacțiunea cu elementele din pagină.
///  Include metode pentru a aștepta, a da click, a introduce text și a verifica prezența elementelor.
public class ElementHelper {
    private final WebDriver driver;
    private final WebDriverWait wait;
    public ElementHelper(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    /// Așteaptă până când elementul devine vizibil pe pagină
    public WebElement waitVisible(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /// Așteaptă până când elementul poate fi apăsat
    public WebElement waitClickable(By locator){
        return  wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /// Apasă pe un element după ce așteaptă să fie clicabil
    public void click(By locator){
        waitClickable(locator).click();
    }

    /// Șterge textul existent și introduce text nou într-un câmp
    public void insertText(By locator, String text){
        WebElement element = waitVisible(locator); //asteapta sa fie vizibil
        element.clear(); //sterge textu existent
        element.sendKeys(text);
    }

    /// Verifică dacă elementul există pe pagină (returnează true/false)
    public boolean isPresent(By locator){
        return !driver.findElements(locator).isEmpty();
    }


}
