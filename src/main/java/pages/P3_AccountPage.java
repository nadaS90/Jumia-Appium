package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class P3_AccountPage extends BasePage
{


    public P3_AccountPage(AppiumDriver appiumDriver)
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
