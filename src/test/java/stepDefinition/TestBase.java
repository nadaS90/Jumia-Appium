package stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase extends AbstractTestNGCucumberTests
{
    public AppiumDriver driver;

    @BeforeTest
    public  void setup() throws MalformedURLException
    {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("app", System.getProperty("user.dir")+"/src/test/resources/apps/jumia-13-7-0.apk");

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
