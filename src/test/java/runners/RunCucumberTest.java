package runners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;


/// Runner care pornește execuția testelor Cucumber
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") /// caută fișiere .feature în folderul "features"
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps,hooks") //// pachetul unde sunt pașii
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report.html, junit:target/cucumber-junit.xml")


public class RunCucumberTest {
}
