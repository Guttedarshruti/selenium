package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features= {".//Features//login.feature"},
        glue="StepDefinition",
        plugin= {
        		"pretty", "html:reports/myreport.html", 
        		"json:reports/myreport.json"
        		},    //Mandatory to capture failures
        dryRun=false,
        monochrome=true
      )
public class testrunner {

}