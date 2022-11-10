package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class P2_LoginPage extends BasePage
{
    public P2_LoginPage(AppiumDriver appiumDriver)
    {
        super(appiumDriver);
    }

    @AndroidFindBy (id = "com.jumia.android:id/navigation_bar_item_icon_view")
    private MobileElement accountBrn;

    public void clickAccountBtn()
    {
        click(accountBrn);
    }
}
