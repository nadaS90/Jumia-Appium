package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class P2_HomePage extends BasePage
{
    public P2_HomePage(AppiumDriver appiumDriver)
    {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.jumia.android:id/navigation_bar_item_icon_view")
    public MobileElement accountBrn;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Jumia\"]/android.widget.ImageView[8]")
    public MobileElement sectionBtn;

    public void clickAccountBtn()
    {
        click(accountBrn);
    }
    public void selectSection()
    {
        tap(sectionBtn);
    }
}
