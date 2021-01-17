package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.qameta.allure.AllureResultsReader;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty", 
				"html:target/cucumber-reports",
				"json:target/cucumber-reports/cucumber.json",
				"io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm"
				},
		features = "src/test/resources/features/loginLogout.feature",
		glue={"steps"},
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		tags = "",
		strict = false, 
		dryRun = false
)

public class LoginLogoutRunner {

}
