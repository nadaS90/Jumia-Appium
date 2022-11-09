package stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.*;

public class S2_AddItemToCartStepDefinition {

    BasePage _basePage;
    P1_HomePage _homePage;
    P4_ElectronicsPage _electronicPage;
    P5_ItemDetailsPage _detailsPage;
    P6_CartPage _cartPage;

    public S2_AddItemToCartStepDefinition(AppiumDriver driver)
    {
        this._homePage = new P1_HomePage(driver);
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
