package runnerFiles;

import org.testng.annotations.Test;

import com.facebook.generic.GenericMethods;

import cucumber.api.CucumberOptions;

@Test
@CucumberOptions(features = "./src/test/java/featureFiles/LoginFeature1.feature",
                 glue = {"stepDefinitionFiles"},
                 dryRun=false,
                 monochrome = true,
                 plugin = { "pretty",
		                   "html:cucumber-reports/default-address",
		                    "rerun:target/cucumber-reports/rerun.txt" })

public class LoginRunner extends GenericMethods {
}

	
	
	
	

