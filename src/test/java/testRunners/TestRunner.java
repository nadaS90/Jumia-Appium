package testRunners;


import io.cucumber.testng.CucumberOptions;
import stepDefinition.TestBase;

@CucumberOptions(
        features="sr/tes/resources/features"
        ,glue= {
                "src/test/java/stepDefinition"
               }
       , tags = "@test"
        ,plugin= {
                "pretty",
                "html:target/cucumber-html-report.html"
                 }
                 )

public class TestRunner extends TestBase
{

}

