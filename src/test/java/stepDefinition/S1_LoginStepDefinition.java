package stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.P1_HomePage;
import pages.P2_AccountPage;
import pages.P3_LoginPage;
import utils.TestData;

public class S1_LoginStepDefinition {
    P1_HomePage _homePage;
    P2_AccountPage _accountPage;
    P3_LoginPage _loginPage;


    public S1_LoginStepDefinition(AppiumDriver driver)
    {
        this._homePage = new P1_HomePage(driver);
        this._accountPage = new P2_AccountPage(driver);
        this._loginPage = new P3_LoginPage(driver);
    }
    @Given("user navigates to Account page")
    public void userNavigatesToAccountPage()
    {
        _homePage.clickAccountBtn();
    }

    @When("user click Login")
    public void userClickLogin()
    {
        _accountPage.clickLoginBtn();
    }

    @And("enter email")
    public void enterEmail()
    {
        _loginPage.enterEmailAccount(TestData.email);
    }

    @And("click Continue")
    public void clickContinue()
    {
        _loginPage.clickContinueBtn();
    }

    @And("user enter password")
    public void userEnterPassword()
    {
        _loginPage.enterPassword(TestData.password);
    }

    @And("click login button")
    public void clickLoginButton()
    {
        _loginPage.clickLoginBtn();
    }

    @Then("user could login successfully")
    public void userCouldLoginSuccessfully()
    {
        Assert.assertTrue(_homePage.accountBrn.getText().contains("Account"));
    }

}
