package android.splashScreen;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSplashScreenTest {

    @Test
    public void firstTest() throws MalformedURLException, InterruptedException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("My Testing");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setApp(System.getProperty("user.dir")+"/android-builds/app-uat-release.apk");
        new AndroidDriver(new URL("http://127.0.0.1:4723"),options);

        Thread.sleep(5000);
    }
}
