package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//revision---
@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Eclipse A\\CucumberJunit\\src\\test\\java\\com\\feature\\LoginPage.feature", glue = "com.stepdefinition")

public class Runner {

}
