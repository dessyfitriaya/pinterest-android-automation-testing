import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import java.net.MalformedURLException;

public class Pin {

    public static void clickPin() throws MalformedURLException, InterruptedException{
        OpenPinterest.getDriver().findElement(By.xpath("//android.view.View[@index='1']")).click();

        System.out.println("An image is showing");
    }

    public static void likePin() throws MalformedURLException, InterruptedException{
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"com.pinterest:id/pin_reaction_entry_point\"))"))
                .click();

        System.out.println("Liked the image");
    }

    public static void savePin() throws MalformedURLException, InterruptedException{
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\"com.pinterest:id/save_pinit_bt\").instance(0))"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Profile\")"))
                .click();
        System.out.println("Saved the image to profile");
    }

    public static void downloadPin() throws MalformedURLException, InterruptedException{
        Thread.sleep(2000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/icon_button\").instance(0)"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Download image\")"))
                .click();
        System.out.println("Image has been downloaded");
        Thread.sleep(3000);

        // close save or share tab
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/icon_button\").instance(2)"))
                .click();
    }

    public static void createPin() throws MalformedURLException, InterruptedException{
        Thread.sleep(2000);

        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/tab_icon\").instance(2)"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/action_button_icon_container\").instance(0)"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_all_button\")"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/story_pin_media_cell_thumbnail\").instance(0)"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/gallery_next_gestalt_button\")"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/create_gestalt_button\")"))
                .click();

        System.out.println("New Pin has been created");
        Thread.sleep(5000);
    }
}
