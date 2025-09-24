package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Utils.ElementHelper;

import java.util.HashMap;
import java.util.Map;

///BaseTest se ocupă cu inițializarea și gestionarea WebDriver-ului și a helperului pentru elemente.
public class BaseTest {
    public static WebDriver driver;
    protected ElementHelper helper;

///Metodă statică pentru a configura WebDriverManager înainte să ruleze testele.
    @BeforeAll
    static void setupDriver(){
        WebDriverManager.chromedriver().setup();
    }

    ///Lansăm browserul Chrome cu setări personalizate înainte de fiecare scenariu.
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
        prefs.put("profile.password_manager_leak_detection_enabled", false);
        prefs.put("profile.password_manager_bubble_enabled", false);
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        /// Inițializăm helper-ul pentru elemente cu driverul creat
        this.helper = new ElementHelper(driver);


    }
///Închidem browser-ul după fiecare scenariu.
    @AfterEach
    public void closeBrowser(){
        if(driver != null){
        driver.quit();
        }
    }
}
