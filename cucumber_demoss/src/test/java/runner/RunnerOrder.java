package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles/Ordering.feature",
                 glue={"stepDefinition","Hooks"},
                 tags = "@start")
                  
public class RunnerOrder {

}
