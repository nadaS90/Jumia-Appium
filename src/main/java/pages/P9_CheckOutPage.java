package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class P9_CheckOutPage extends BasePage
{
    public P9_CheckOutPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

   @AndroidFindBy (id = "com.jumia.android:id/delivery_label")
    public MobileElement deliveryLabel;
}
