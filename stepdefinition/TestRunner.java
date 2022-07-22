package com.flipkart.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features",
                     glue = "com.flipkart.stepdefinition",
                   plugin = "html:target",	
               monochrome = true,
               	   dryRun = false,
               	   tags   = "@Mobile")
  


//tags @mobile for feature tag
//tags used in scenario are scenario tag
// tags only for particular scenario
//tags used using two tags{"@smoke" "@sanity"}- and operator
//tags used for any of the tags can execute{"@smoke,@sanity"}--or operator
//tags used for skip particular scenario or feature {~@Mobile~}
public class TestRunner {

}
