package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
     //   features ="src/test/resources/features/",
        features ="C:\\Users\\aysel\\IdeaProjects\\zerobankautomation\\src\\test\\resources\\features\\FindTransaction.feature",
        dryRun = true
      //  tags = "@Account_Activity"

      //  plugin = {"html:target/default-cucumber-reports",
      //  "json:target/cucumber.json"}
)

public class CukesRunner {

}

