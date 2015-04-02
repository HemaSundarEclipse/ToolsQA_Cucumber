package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "classpath:cucumber/", 
				 glue = "classpath:testDefinition/", 
				 format = { "pretty", "html:target/cucumber" }
//				 format = {"pretty", "json:target/cucumber_JSON"}
					)
public class CucumberRunner {

}
