package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestUtils;

import java.time.Duration;

public class BasePage
{
    AppiumDriver driver;
    TestUtils utils = new TestUtils();
    public AndroidTouchAction actions;

    public BasePage(AppiumDriver appiumDriver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        driver = appiumDriver;
    }

    public void waitForVisibility(MobileElement element) {
        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void clear(MobileElement element)
    {
        waitForVisibility(element);
        element.clear();
    }

    public void click(MobileElement element)
    {
        waitForVisibility(element);
        element.click();
    }

    public void sendTxt(MobileElement element, String txt)
    {
        waitForVisibility(element);
        element.sendKeys(txt);
    }

    public String getAttribute(MobileElement element, String attribute)
    {
        waitForVisibility(element);
        return element.getAttribute(attribute);
    }

    public void tap(MobileElement element)
    {
        actions = new AndroidTouchAction((PerformsTouchActions) driver);
        actions.tap(ElementOption.element(element)).perform();

    }

    public void scrollDown()
    {
        Dimension dimension = driver.manage().window().getSize();
        int startPoint = (int) (dimension.getHeight() * 0.9 );
        int endPoint = (int) (dimension.getHeight() * 0.01 );
        actions = new AndroidTouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(0, startPoint))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .moveTo(PointOption.point(0, endPoint))
                .release().perform();
    }

    public void swipeLeft(MobileElement element)
    {
        actions.press(ElementOption.element(element)).waitAction()
                .moveTo(PointOption.point(-400, 6000))
                .release().perform();

    }


}
