package testRunners;


import io.cucumber.testng.CucumberOptions;
import stepDefinition.TestBase;

@CucumberOptions(features="src/test/resources/features/CreateTaskExampleTable.feature"
        ,glue= {"steps"}
        ,plugin= {"pretty","html:target/cucumber-html-report.html"})

public class TestRunner extends TestBase
{

}

