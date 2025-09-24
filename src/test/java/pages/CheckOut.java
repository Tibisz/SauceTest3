package pages;

import Utils.ElementHelper;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class CheckOut extends BaseTest {
    private final WebDriver driver;
    private final ElementHelper helper;

    /// Locatori pentru câmpurile și butoanele din formularul de checkout
    private final By firstNameField = By.id("first-name");
    private final By lastNameField = By.id("last-name");
    private final By postalCodeField = By.id("postal-code");
    private final By continueButton = By.id("continue");
    private final By finishButton = By.id("finish");


    /// Constructor: inițializează driverul și helper-ul
    public CheckOut(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);

    }

    /// Completează informațiile de checkout
    public void fillInformation(String firstName, String lastName, String postalCode) {
        helper.waitClickable(firstNameField);
   helper.insertText(firstNameField,firstName);
   helper.waitClickable(lastNameField);
   helper.insertText(lastNameField,lastName);
   helper.waitClickable(postalCodeField);
   helper.insertText(postalCodeField,postalCode);

   //find element by//

    //   driver.findElement(firstNameField).sendKeys(firstName);//
      // driver.findElement(lastNameField).sendKeys(lastName);//
        // driver.findElement(postalCodeField).sendKeys(postalCode);//

    }

    /// Apasă pe butonul Continue
    public void continueButton() {
        System.out.println("Trying to click Continue...");
        helper.waitClickable(continueButton);
        helper.click(continueButton);
        System.out.println("Clicked Continue.");

      // driver.findElement(continueButton).click();/

    }

    /// Apasă pe butonul Finish
public void finishButton(){
        helper.waitClickable(finishButton);
        helper.click(finishButton);

}



}
