package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class P1_LaunchApp extends BasePage
{

    public P1_LaunchApp(AppiumDriver appiumDriver)
    {
        super(appiumDriver);
    }

   // @AndroidFindBy (xpath = "//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.RadioButton");
   // @AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[2]")
    @AndroidFindBy (xpath = "//ndroid.view.ViewGroup[@class=\"android.widget.RadioButton\"]/preceding-sibling::android.view.ViewGroup[3]/android.widget.RadioButton")
   MobileElement egyptRdBtn;

    public void selectCpuntry()
    {
        click(egyptRdBtn);
    }
}
