package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/LoginPage.feature" ,glue="stepDefinition",
                 dryRun = false,
                 monochrome = true,
                 plugin = {"json:report/jsonReport.json","junit:report/xmlreport.xml",
                                    "html:report/WebReport"},
                    tags = {"@runnable"})
public class LoginPage1 {

}
