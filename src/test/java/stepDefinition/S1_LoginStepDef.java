package stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P1_LaunchApp;

public class S1_LoginStepDef
{
    P1_LaunchApp _launchApp;
    P2_LoginPage _loginPage;

    public S1_LoginStepDef(AppiumDriver driver)
    {
        this._launchApp = new P1_LaunchApp(driver);
        this._loginPage = new P2_LoginPage(driver);
    }

    @Given("user select country")
    public void userSelectCountry()
    {
        _launchApp.selectCpuntry();
    }

    @And("user choose language")
    public void userChooseLanguage() {
    }

    @Then("user navigates to Account page")
    public void userNavigatesToAccountPage() {
    }

    @When("user click Login")
    public void userClickLogin() {
    }

    @And("enter email")
    public void enterEmail() {
    }

    @And("click Continue")
    public void clickContinue() {
    }

    @And("user enter password")
    public void userEnterPassword() {
    }

    @And("click login button")
    public void clickLoginButton() {
    }

    @Then("user could login successfully")
    public void userCouldLoginSuccessfully() {
    }
}
