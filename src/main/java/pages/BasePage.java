package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestUtils;

public class BasePage
{
    AppiumDriver driver;
    TestUtils utils = new TestUtils();

    public BasePage(AppiumDriver appiumDriver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        driver = appiumDriver;
    }

    public void waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void clear(WebElement element)
    {
        waitForVisibility(element);
        element.clear();
    }

    public void click(WebElement element)
    {
        waitForVisibility(element);
        element.click();
    }

    public void sendTxt(WebElement element, String txt)
    {
        waitForVisibility(element);
        element.sendKeys(txt);
    }

    public String getAttribute(WebElement element, String attribute)
    {
        waitForVisibility(element);
        return element.getAttribute(attribute);
    }

}
