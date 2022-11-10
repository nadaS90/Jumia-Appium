package stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;
import utils.TestData;

public class S3_ShippingAddStepDefinition {

    P6_ItemDetailsPage _detailsPage;
    P7_CartPage _cartPage;
    P8_AddressPage _addressPage;
    P9_CheckOutPage _checkOutPage;
    public S3_ShippingAddStepDefinition(AppiumDriver driver)
    {
        this._detailsPage = new P6_ItemDetailsPage(driver);
        this._cartPage = new P7_CartPage(driver);
        this._addressPage = new P8_AddressPage(driver);
        this._checkOutPage = new P9_CheckOutPage(driver);
    }

    @Given("user navigates to cart")
    public void userNavigatesToCart()
    {
        _detailsPage.clickCartBtn();
    }

    @When("click on total amount")
    public void clickOnTotalAmount()
    {
        _cartPage.clickCheckOutBtn();
    }

    @Then("user directed to add new address")
    public void userDirectedToAddNewAddress()
    {
        Assert.assertTrue(_addressPage.pageTittle.getText().contains("Add new address"));
    }

    @When("user fill mandatory fields")
    public void userFillMandatoryFields()
    {
        _addressPage.addAddressTxt(TestData.address);
        _addressPage.clickCityDropList();
        _addressPage.clickSelectedCity();
    }

    @And("click save button")
    public void clickSaveButton()
    {
        _addressPage.clickSaveBtn();
    }

    @Then("user directed to Checkout page")
    public void userDirectedToCheckoutPage()
    {
        Assert.assertTrue(_checkOutPage.deliveryLabel.getText().contains("DELIVERY"));
    }
}
