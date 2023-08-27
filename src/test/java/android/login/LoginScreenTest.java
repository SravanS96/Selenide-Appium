package android.login;

import androidScreens.languageScreen.LanguageSelectionScreen;
import androidScreens.loginScreen.LoginScreen;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.appium.ScreenObject;
import com.codeborne.selenide.appium.SelenideAppium;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class LoginScreenTest {

    @BeforeMethod
    public void setUp() {
        SelenideAppium.launchApp();
    }

    @Test
    public void TC_01_VerifyMobileNumberInputFiled(){
        LanguageSelectionScreen languageScreen = ScreenObject.screen(LanguageSelectionScreen.class);
        LoginScreen loginScreen =ScreenObject.screen(LoginScreen.class);
        languageScreen.clickTheLanguageButton("English");
        $(languageScreen.languageScreenNextButton).should(Condition.visible).click();
        loginScreen.enterMobileNumber("9126538935");
    }

    @Test
    public void TC_02_VerifyTheBehaviourOfNextButton(){
        LanguageSelectionScreen languageScreen = ScreenObject.screen(LanguageSelectionScreen.class);
        LoginScreen loginScreen =ScreenObject.screen(LoginScreen.class);
        languageScreen.clickTheLanguageButton("English");
        $(languageScreen.languageScreenNextButton).should(Condition.visible).click();
        Boolean nextButtonDisabled = $(loginScreen.loginScreenNextButton).should(Condition.visible).isEnabled();
        loginScreen.enterMobileNumber("9126538935");
        Boolean nextButtonEnabled = $(loginScreen.loginScreenNextButton).should(Condition.visible).isEnabled();

        Assert.assertEquals(nextButtonDisabled,false);
        Assert.assertEquals(nextButtonEnabled,true);
    }
}
