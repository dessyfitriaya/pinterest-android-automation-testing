import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;
import java.util.Map;

public class Search {
    public static void searchWithWords(String searchKey) throws MalformedURLException, InterruptedException{
        Thread.sleep(2000);

        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/tab_icon\").instance(1)"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/search_tv\")"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/view_search_bar_input\")"))
                .sendKeys(searchKey);
        OpenPinterest.getDriver().executeScript("mobile: performEditorAction", Map.of("action", "done"));

        System.out.println("Search some pictures");
        Thread.sleep(10000);
    }

    public static void searchWithManySymbols() throws MalformedURLException, InterruptedException{
        Thread.sleep(2000);

        // bikin search key panjang
        char alphabet = '%';
        int targetLength = 1000;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < targetLength; i++) {
            stringBuilder.append(alphabet);
        }

        String searchKey = stringBuilder.toString();

        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/tab_icon\").instance(1)"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/search_tv\")"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/view_search_bar_input\")"))
                .sendKeys(searchKey);
        OpenPinterest.getDriver().executeScript("mobile: performEditorAction", Map.of("action", "done"));

        WebElement errorMessage = OpenPinterest.getDriver().findElement((By.xpath("//android.widget.TextView[@text=\"Oops, something went wrong! Try again.\"]")));
        String error = errorMessage.getAttribute("text");

        System.out.println("Error: "+error);
        Thread.sleep(5000);
    }

    public static void searchWithPicture() throws MalformedURLException, InterruptedException{
        Thread.sleep(2000);

        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/tab_icon\").instance(1)"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/lens_icon\")"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_one_time_button\")"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/lens_gallery_icon\")"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_all_button\")"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(16)"))
                .click();
        Thread.sleep(5000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/save_pinit_bt\")"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/icon_button\")"))
                .click();
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/icon_button\").instance(2)"))
                .click();
        Thread.sleep(3000);
    }
}
