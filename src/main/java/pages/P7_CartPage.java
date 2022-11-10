package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class P7_CartPage extends BasePage
{

    public P7_CartPage(AppiumDriver appiumDriver)
    {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.jumia.android:id/tv_cart_product_item_name")
    public MobileElement itemName;

    @AndroidFindBy(id = "com.jumia.android:id/tv_checkout_total")
    public MobileElement checkOutBtn;

    public void clickCheckOutBtn()
    {
        click(checkOutBtn);
    }
}
