package android.splashScreen;

import com.codeborne.selenide.appium.SelenideAppium;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.appium.SelenideAppium.$;


public class AndroidSplashScreenTest {

    @BeforeMethod
    public void setUp(){SelenideAppium.launchApp();}

    @Test
    public void firstTest() throws InterruptedException {
        $(By.xpath("//android.widget.Button[@content-desc=\"English\"]")).click();
        Thread.sleep(5000);
    }


}