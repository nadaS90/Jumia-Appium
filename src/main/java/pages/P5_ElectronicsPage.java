package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class P5_ElectronicsPage extends BasePage
{

    public P5_ElectronicsPage(AppiumDriver appiumDriver)
    {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView")
    public MobileElement firstItem;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='FLIP 5 Portable Bluetooth Waterproof Speaker - Grey']")
    public MobileElement iteamSpeaker;

    public void selectFirstItem()
    {
        tap(firstItem);
    }

    public void selectItemSpeaker()
    {
        click(iteamSpeaker);
    }


}
