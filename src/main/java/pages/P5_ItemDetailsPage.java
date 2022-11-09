package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class P5_ItemDetailsPage extends BasePage
{

    public P5_ItemDetailsPage(AppiumDriver appiumDriver)
    {
        super(appiumDriver);
    }

    @AndroidFindBy(id ="com.jumia.android:id/add_to_cart_button")
    public MobileElement addToCartBtn;
    @AndroidFindBy(id = "com.jumia.android:id/action_cart_image_pktheme")
    public MobileElement cartBtn;


    public void clickAddToCartBtn()
    {
        click(addToCartBtn);
    }

    public void clickCartBtn()
    {
        click(cartBtn);
    }

}
