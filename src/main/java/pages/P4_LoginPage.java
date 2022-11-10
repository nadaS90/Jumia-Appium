package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class P4_LoginPage extends BasePage
{
    public P4_LoginPage(AppiumDriver appiumDriver)
    {
        super(appiumDriver);
    }
    @AndroidFindBy(className = "android.widget.EditText")
    private MobileElement emailBox;

    @AndroidFindBy(className = "android.widget.Button")
    private MobileElement continueBtn;

    @AndroidFindBy(className = "ndroid.widget.EditText")
    private MobileElement passwordBox;

    @AndroidFindBy(className =  "loginButton")
    private MobileElement loginBtn;

    public void enterEmailAccount(String email)
    {
        clear(emailBox);
        sendTxt(emailBox, email);
    }
    public void clickContinueBtn()
    {
        click(continueBtn);
    }
    public void enterPassword(String password)
    {
        clear(passwordBox);
        sendTxt(passwordBox, password);
    }
    public void clickLoginBtn()
    {
        click(loginBtn);
    }



}
