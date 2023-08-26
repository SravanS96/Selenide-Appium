package android.splashScreen;

import com.codeborne.selenide.appium.SelenideAppium;
import org.testng.annotations.Test;


public class AndroidSplashScreenTest {

    @Test
    public void firstTest() throws InterruptedException {
        SelenideAppium.launchApp();
        Thread.sleep(5000);
    }
}
