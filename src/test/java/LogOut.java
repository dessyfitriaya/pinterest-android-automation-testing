import io.appium.java_client.AppiumBy;
import java.net.MalformedURLException;
import io.appium.java_client.AppiumDriver;

public class LogOut {
    public static void logOut() throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/tab_avatar\")"))
                .click();
        Thread.sleep(2000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/profile_user_avatar_component\")"))
                .click();
        Thread.sleep(2000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Log out\")"))
                .click();

        Thread.sleep(3000);
        System.out.println("Log out success");
    }
}
