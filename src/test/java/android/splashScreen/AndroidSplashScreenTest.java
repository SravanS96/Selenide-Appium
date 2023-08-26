package android.splashScreen;

import com.codeborne.selenide.appium.SelenideAppium;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AndroidSplashScreenTest {

    @BeforeMethod
    public void setUp(){SelenideAppium.launchApp();}

    @Test
    public void firstTest() throws InterruptedException {

        Thread.sleep(5000);
    }


}