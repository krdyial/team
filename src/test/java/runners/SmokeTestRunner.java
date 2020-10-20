package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        //Path of the feature folder
        plugin ={
                "html:target\\default-cucumber-reports",
                "json:target\\json-reports\\cucumber3.json",
                "junit:target\\xml-report\\cucumber3.xml"
        },
        features = "src\\test\\resources\\features",
        //Path of the step definition folder

        glue="stepdefinitions",
        tags = "@smoke",
        dryRun = false
)

public class SmokeTestRunner {
}
