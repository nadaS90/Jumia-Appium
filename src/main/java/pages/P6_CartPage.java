package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class P6_CartPage extends BasePage
{

    public P6_CartPage(AppiumDriver appiumDriver)
    {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.jumia.android:id/tv_cart_product_item_name")
    public MobileElement itemName;
}
