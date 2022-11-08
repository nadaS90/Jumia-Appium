package stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase
{
    public AppiumDriver driver;

    @BeforeTest
    public  void setup() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("deviceName", "Android Emulator 1");
        caps.setCapability("app", System.getProperty("user.dir")+"/apps/ToDo_1.24_Apkpure.apk");

        // add appium server
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }


    @AfterTest
    public void teatDown()
    {
        if (null != driver)
        {
            driver.quit();
        }
    }
}
