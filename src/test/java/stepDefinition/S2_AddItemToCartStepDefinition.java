package stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;

public class S2_AddItemToCartStepDefinition {

    BasePage _basePage;
    P2_HomePage _homePage;
    P5_ElectronicsPage _electronicPage;
    P6_ItemDetailsPage _detailsPage;
    P7_CartPage _cartPage;

    public S2_AddItemToCartStepDefinition(AppiumDriver driver)
    {
        this._basePage = new BasePage(driver);
        this._homePage = new P2_HomePage(driver);
        this._electronicPage = new P5_ElectronicsPage(driver);
        this._detailsPage = new P6_ItemDetailsPage(driver);
        this._cartPage = new P7_CartPage(driver);
    }

    @Given("user scroll down till required section")
    public void userScrollDownTillRequiredSection()
    {
        _basePage.scrollDown();
    }

    @And("user click on the section")
    public void userClickOnTheSection()
    {
        _homePage.selectSection();
    }

    @Then("user swipe to the left till required item")
    public void userSwipeToTheLeftTillRequiredItem()
    {
        _electronicPage.selectFirstItem();
        _basePage.swipeLeft(_electronicPage.firstItem);
    }

    @And("click on the item")
    public void clickOnTheItem()
    {
        _electronicPage.selectItemSpeaker();
    }

    @When("click on add to cart button")
    public void clickOnAddToCartButton()
    {
        _detailsPage.clickAddToCartBtn();
    }

    @Then("Item added successfully to the cart")
    public void itemAddedSuccessfullyToTheCart()
    {
        _detailsPage.clickCartBtn();
        Assert.assertTrue(_cartPage.itemName.getText().contains("Bluetooth Waterproof Speaker - Grey"));
    }
}
