package android.languageScreen;

import androidScreens.LanguageSelectionScreen;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.appium.ScreenObject;
import com.codeborne.selenide.appium.SelenideAppium;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LanguageSelectionScreenTest{

    @BeforeMethod
    public void setUp() {
        SelenideAppium.launchApp();
    }

    @Test
    public void TC_01_AllLanguageButtonsShouldBeClickable(){

        LanguageSelectionScreen screenTest = ScreenObject.screen(LanguageSelectionScreen.class);
        screenTest.clickTheLanguageButton("Hindi");
        screenTest.clickTheLanguageButton("English");
        screenTest.clickTheLanguageButton("Kannada");
        screenTest.clickTheLanguageButton("Malayalam");
        screenTest.clickTheLanguageButton("Tamil");
        screenTest.clickTheLanguageButton("Telugu");
        screenTest.clickTheLanguageButton("Marati");
        screenTest.clickTheLanguageButton("Bengali");
        screenTest.clickTheLanguageButton("Gujarathi");
        screenTest.clickTheLanguageButton("Oriya");
        screenTest.clickTheLanguageButton("Konkani");
        screenTest.clickTheLanguageButton("Urdu");
    }

    @Test
    public void TC_01_VerifyTheLanguageScreenNextButtonBehaviour(){
        LanguageSelectionScreen screenTest = ScreenObject.screen(LanguageSelectionScreen.class);
        Boolean buttonDisabled = Selenide.$(screenTest.languageScreenNextButton).should(Condition.visible).isEnabled();
        screenTest.clickTheLanguageButton("English");
        Boolean buttonEnabled = Selenide.$(screenTest.languageScreenNextButton).should(Condition.visible).isEnabled();

        Assert.assertEquals(buttonDisabled,false);
        Assert.assertEquals(buttonEnabled,true);
    }

}