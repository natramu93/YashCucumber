package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/features", glue="",
				tags= {"@selenium"},
		format={"json:reports.json"})
public class Runner extends AbstractTestNGCucumberTests{

}
