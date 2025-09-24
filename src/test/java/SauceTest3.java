import Utils.ElementHelper;
/*import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class SauceTest3 {

    WebDriver driver;

    @BeforeAll
    static void setupDriver(){
        WebDriverManager.chromedriver().setup();
    }
   @BeforeEach
    public void launchBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-features=PasswordLeakDetection,SafeBrowsingEnhancedProtection,PasswordManagerOnboarding,AutofillServerCommunication");
       Map<String, Object> prefs = new HashMap<>();
       prefs.put("credentials_enable_service", false);
       prefs.put("profile.password_manager_enabled", false);
       prefs.put("profile.default_content_setting_values.notifications", 2);
       prefs.put("profile.password_manager_leak_detection_enabled", false);
       prefs.put("profile.password_manager_bubble_enabled", false);
       options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(Duration.ofMillis(500));
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(Duration.ofMillis(500));
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("first-name")).sendKeys("Adifha");
        driver.findElement(By.id("last-name")).click();
        driver.findElement(By.id("last-name")).sendKeys("Adifha");
        driver.findElement(By.id("postal-code")).click();
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(Duration.ofMillis(500));
        driver.findElement(By.id("finish")).click();



    }
  @AfterEach
    public void closeBrowser(){
        driver.quit();
  }


}*/
