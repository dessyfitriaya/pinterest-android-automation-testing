import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenPinterest {

    static AppiumDriver driver;
    public static void openPinterest() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "A13 milik Dessy");
        cap.setCapability("udid", "RR8T9088X1P");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "14");
        cap.setCapability("automationName", "uiAutomator2");
        cap.setCapability("appPackage", "com.pinterest");
        cap.setCapability("appActivity", "com.pinterest.activity.PinterestActivity");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver(url, cap);
        System.out.println("Pinterest has been opened");
    }

    public static AppiumDriver getDriver() {
        return driver;
    }
}
