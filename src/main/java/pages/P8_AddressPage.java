package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.FindBy;

public class P8_AddressPage extends BasePage
{

    public P8_AddressPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(className = "android.widget.TextView")
    public MobileElement pageTittle;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"address1\"]")
    public MobileElement addressBox;


    @AndroidFindBy(id = "com.jumia.android:id/save_btn")
    public MobileElement saveBtn;

    @AndroidFindBy (id ="com.jumia.android:id/spinner_field")
    public MobileElement cityDropList;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Ain Shams']")
    public MobileElement selectCity;


    public void addAddressTxt(String address)
    {
        sendTxt(addressBox, address);
    }
    public void clickCityDropList()
    {
        click(cityDropList);
    }
    public void clickSelectedCity()
    {
        click(selectCity);
    }
    public void clickSaveBtn()
    {
        click(saveBtn);
    }




}
