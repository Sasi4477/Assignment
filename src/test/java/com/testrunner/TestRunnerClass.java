package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/feature"},glue = {"com.stepdefinition"},plugin = { "pretty" } )
public class TestRunnerClass {

}