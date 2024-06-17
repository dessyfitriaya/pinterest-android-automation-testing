import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import java.net.MalformedURLException;

public class Collage {
    public static void createCollage() throws MalformedURLException, InterruptedException{
        Thread.sleep(5000);

        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/tab_icon\").instance(2)"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/action_button_icon_container\").instance(1)"))
                .click();
        Thread.sleep(6000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(4)"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(By.xpath("//android.view.View[@index='0']"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Add\")"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/icon_button\").instance(3)"))
                .click();
        Thread.sleep(10000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/primary_button\")"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/create_board_title\")"))
                .click();
        Thread.sleep(5000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/edit_text\")"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/edit_text\")"))
                .sendKeys("hasil collage");
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/create_board_button_id\")"))
                .click();

        System.out.println("Collage has been created");
        Thread.sleep(5000);
    }

    public static void deleteCollage() throws MalformedURLException, InterruptedException{
        Thread.sleep(3000);

        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/tab_avatar\")"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().description(\"Board: silly collages\")"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/lego_pin_grid_cell_id\").instance(0)"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/closeup_overflow_button\")"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Edit Pin\")"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\"com.pinterest:id/pin_edit_delete\"))"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/alert_view_confirm_button\")"))
                .click();

        System.out.println("Collage has been deleted");
        Thread.sleep(5000);
    }
}
