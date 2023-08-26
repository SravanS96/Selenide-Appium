package android.splashScreen;

import com.codeborne.selenide.appium.SelenideAppium;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.appium.SelenideAppium.$;


public class AndroidSplashScreenTest {

    @BeforeMethod
    public void setUp() {
        SelenideAppium.launchApp();
    }

    @Test
    public void firstTest(){
        $(By.xpath("//android.widget.Button[@content-desc=\"English\"]")).shouldBe(visible).click();
        $(By.xpath("//android.widget.Button[@content-desc=\"Next\"]")).shouldBe(visible).click();
        $(By.xpath("//android.view.View[@content-desc=\"India's #1 Financial Health App\"]")).should(appear);
        Boolean loginOrSignUpText =$(By.xpath("//android.view.View[@content-desc=\"Log In or Sign Up\"]")).isDisplayed();
        Boolean continueWithWorkerEmailButton = $(AppiumBy.accessibilityId("Continue with Work E-Mail")).shouldBe(visible).isDisplayed();

        Assert.assertEquals(loginOrSignUpText,true);
        Assert.assertEquals(continueWithWorkerEmailButton,true);
    }


}