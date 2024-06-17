import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.net.MalformedURLException;

public class SignIn {

    public static void signInGoogleSuccess() throws MalformedURLException, InterruptedException{
        Thread.sleep(4000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(2)"))
                .click();
        System.out.println("Sign in with Google Account succeed");
        Thread.sleep(4000);
    }

    public static void signInEmailSuccess() throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);

        // isi email yang terdaftar
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/edit_text\")"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/edit_text\")"))
                .sendKeys("goodtoknow1512@gmail.com");
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/continue_email_bt\")"))
                .click();

        // isi password yang benar
        OpenPinterest.getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.pinterest:id/edit_text\" and @text=\"Enter your password\"]"))
                .click();
        OpenPinterest.getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.pinterest:id/edit_text\" and @text=\"Enter your password\"]"))
                .sendKeys("why dont you say so");

        // login
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/login_bt\")"))
                .click();
        Thread.sleep(9000);

        // dont save password to google
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Cancel\")"))
                .click();

        System.out.println("Sign in with Email succeed");
        Thread.sleep(2000);
    }

    public static void signInEmailFail() throws MalformedURLException, InterruptedException{
        Thread.sleep(3000);

        // isi email yang terdaftar
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/edit_text\")"))
                .click();
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/edit_text\")"))
                .sendKeys("goodtoknow1512@gmail.com"); //2110817220018@mhs.ulm.ac.id
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/continue_email_bt\")"))
                .click();

        // isi password yang salah
        OpenPinterest.getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.pinterest:id/edit_text\" and @text=\"Enter your password\"]"))
                .click();
        OpenPinterest.getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.pinterest:id/edit_text\" and @text=\"Enter your password\"]"))
                .sendKeys("pass salah");
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.pinterest:id/login_bt\")"))
                .click();

        // pesan error
        Thread.sleep(4000);
        WebElement errorMessageElement = OpenPinterest.getDriver().findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.pinterest:id/helper_text\"]"));
        String errorMessage = errorMessageElement.getText();

        System.out.println(errorMessage);
        Thread.sleep(1000);
    }

    public static void notificationAlert() throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);
        OpenPinterest.getDriver().findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_button\")"))
                .click();

        System.out.println("Pinterest is allowed to send notification");
    }
}
