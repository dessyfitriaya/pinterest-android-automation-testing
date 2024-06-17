import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class Board {
    public static void createBoard() throws MalformedURLException, InterruptedException{
        Thread.sleep(2000);

        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/tab_icon\").instance(2)"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/action_button_icon_container\").instance(2)"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/edit_text\")"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/edit_text\")"))
                .sendKeys("before sunrise");
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/create_board_button_id\")"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(By.xpath("//android.view.View[@index='0']")).click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/done_button\")"))
                .click();

        System.out.println("Board has been created");
        Thread.sleep(5000);
    }

    public static void deleteBoard() throws MalformedURLException, InterruptedException{
        Thread.sleep(3000);

        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/tab_avatar\")"))
                .click();
        OpenPinterest.getDriver().findElement(By.xpath("//android.view.ViewGroup[@index='4']"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/icon_button\").instance(1)"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Edit board\")"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\"com.pinterest:id/edit_board_delete\"))"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/primary_button\")"))
                .click();

        System.out.println("Board has been deleted");
        Thread.sleep(5000);
    }
}
