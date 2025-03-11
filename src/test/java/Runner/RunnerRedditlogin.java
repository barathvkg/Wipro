package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src\\test\\java\\FeaturePkg\\Rediff.feature"},glue={"StepDef"}
,	plugin= {
		"html:src\\test\\resources\\Reports\\cucumber-reports.html"
}
		
		)

public class RunnerRedditlogin extends AbstractTestNGCucumberTests  {
	

}
