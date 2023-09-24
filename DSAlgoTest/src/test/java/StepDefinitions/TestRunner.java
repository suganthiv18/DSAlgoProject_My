package StepDefinitions;

import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  


@RunWith(Cucumber.class) 
	@CucumberOptions(features="src/test/resources/features",
	glue={"StepDefinitions"},
			plugin = {"pretty","pretty",  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					
					}
)
	public class TestRunner {
		
	}

	
//plugin = { "pretty", "html:target/HTMLReports/reports"},
//plugin = { "pretty", "json:target/JSONReports/cucumber.json"},
//plugin = { "pretty",  "junit:target/JUnit/cucumber.xml"}

//"pretty",  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"