package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles/HookPlain.feature",
               glue = {"stepDefinition","Hooks"},
               monochrome=true,
               dryRun = false,
               tags = "@Hooks")
public class RunnerHookesNormal {
	

}
