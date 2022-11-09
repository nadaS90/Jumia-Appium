package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Helper
{
    public static void failureScreenSoot(WebDriver driver, String screenSotName)
    {
        // distination path for screenshots
        Path dest = Paths.get("./screenshots", screenSotName + ".png");
        try {
            Files.createDirectories(dest.getParent());
            //streaming from dest to save it and save it in string
            FileOutputStream out = new FileOutputStream(dest.toString());
            // will write and save the screenshot and export it as bytes
            // create image and put it in stream
            out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            out.close();
        }
        catch (IOException e)
        {
            System.out.println("Excpetion while taking screenshot"+ e.getMessage());;
        }
    }

}
