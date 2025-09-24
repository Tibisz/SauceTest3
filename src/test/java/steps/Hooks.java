package steps;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import base.BaseTest;



public class Hooks extends BaseTest {

    /// Rulează înainte de fiecare scenariu
    @Before
    public void setUp (Scenario scenario){
        System.out.println("Starting Scenarios" + scenario.getName());
        launchBrowser();
    }

    /// Rulează după fiecare scenariu
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println("Scenario FAILED" + scenario.getName());
        } else {
            System.out.println("Scenario PASSED" + scenario.getName());
        }
        if(driver!=null){
            driver.quit();
            System.out.println("Browser closed after scenario");
        }
    }
}
