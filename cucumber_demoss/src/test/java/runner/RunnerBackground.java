package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles/Background.feature",
glue={"stepDefinition","Hooks"},
monochrome = true,
tags="@Background")
public class RunnerBackground {

}
