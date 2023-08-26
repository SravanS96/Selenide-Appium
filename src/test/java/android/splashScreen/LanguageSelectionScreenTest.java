package android.splashScreen;

import androidScreens.LanguageSelectionScreen;
import com.codeborne.selenide.appium.ScreenObject;
import com.codeborne.selenide.appium.SelenideAppium;

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


}