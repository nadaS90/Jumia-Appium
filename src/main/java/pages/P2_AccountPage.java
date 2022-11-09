package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class P2_AccountPage extends BasePage
{


    public P2_AccountPage(AppiumDriver appiumDriver)
    {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.jumia.android:id/button_top_login")
    private MobileElement loginBtn;

    public void clickLoginBtn()
    {
        click(loginBtn);
    }
}
