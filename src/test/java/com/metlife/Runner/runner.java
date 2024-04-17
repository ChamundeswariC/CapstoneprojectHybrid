package com.metlife.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,features = {"src/test/java/com/metlife/feature"},glue = {"com.metlife.StepDefinition"})
public class runner {

}
