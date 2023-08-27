package android.login;

import androidScreens.languageScreen.LanguageSelectionScreen;
import androidScreens.loginScreen.LoginScreen;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.appium.ScreenObject;
import com.codeborne.selenide.appium.SelenideAppium;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.MobileAppUtilities;

import static com.codeborne.selenide.Selenide.$;

public class LoginScreenTest {

    @BeforeMethod
    public void setUp() {
        SelenideAppium.launchApp();
    }

    @Test
    public void TC_01_VerifyMobileNumberInputFiled() {
        LanguageSelectionScreen languageScreen = ScreenObject.screen(LanguageSelectionScreen.class);
        LoginScreen loginScreen = ScreenObject.screen(LoginScreen.class);
        languageScreen.clickTheLanguageButton("English");
        $(languageScreen.languageScreenNextButton).should(Condition.visible).click();
        loginScreen.enterMobileNumber("9126538935");
    }

    @Test
    public void TC_02_VerifyTheBehaviourOfNextButton() {
        LanguageSelectionScreen languageScreen = ScreenObject.screen(LanguageSelectionScreen.class);
        LoginScreen loginScreen = ScreenObject.screen(LoginScreen.class);
        languageScreen.clickTheLanguageButton("English");
        $(languageScreen.languageScreenNextButton).should(Condition.visible).click();
        Boolean nextButtonDisabled = $(loginScreen.loginScreenNextButton).should(Condition.visible).isEnabled();
        loginScreen.enterMobileNumber("9126538935");
        Boolean nextButtonEnabled = $(loginScreen.loginScreenNextButton).should(Condition.visible).isEnabled();

        Assert.assertEquals(nextButtonDisabled, false);
        Assert.assertEquals(nextButtonEnabled, true);
    }

    @Test
    public void TC_03_VerifyMobileNumberInputFiled() {
        LanguageSelectionScreen languageScreen = ScreenObject.screen(LanguageSelectionScreen.class);
        LoginScreen loginScreen = ScreenObject.screen(LoginScreen.class);
        languageScreen.clickTheLanguageButton("English");
        $(languageScreen.languageScreenNextButton).should(Condition.visible).click();
        loginScreen.enterMobileNumber("my email id ");
        Boolean nextButtonDisabled = $(loginScreen.loginScreenNextButton).should(Condition.visible).isEnabled();

        Assert.assertEquals(nextButtonDisabled, false);
    }

    @Test
    public void TC_04_VerifyTheInvalidMobileNumberErrorMessage() {
        LanguageSelectionScreen languageScreen = ScreenObject.screen(LanguageSelectionScreen.class);
        LoginScreen loginScreen = ScreenObject.screen(LoginScreen.class);
        languageScreen.clickTheLanguageButton("English");
        $(languageScreen.languageScreenNextButton).should(Condition.visible).click();
        loginScreen.enterMobileNumber("9126535");
        String errorMessage = $(loginScreen.errorMessage).getAttribute("content-desc");


        Assert.assertEquals(errorMessage, "Please enter a valid phone number");

    }

    @Test
    public void TC_05_VerifyMenuButtons() throws InterruptedException {
        LanguageSelectionScreen languageScreen = ScreenObject.screen(LanguageSelectionScreen.class);
        LoginScreen loginScreen = ScreenObject.screen(LoginScreen.class);
        languageScreen.clickTheLanguageButton("English");
        $(languageScreen.languageScreenNextButton).should(Condition.visible).click();
        $(loginScreen.menuButton).should(Condition.visible).click();
    }

    @Test
    public void TC_06_VerifyTheContinueWithEmailButton() {
        LanguageSelectionScreen languageScreen = ScreenObject.screen(LanguageSelectionScreen.class);
        LoginScreen loginScreen = ScreenObject.screen(LoginScreen.class);
        languageScreen.clickTheLanguageButton("English");
        $(languageScreen.languageScreenNextButton).should(Condition.visible).click();
        MobileAppUtilities.clickOnWebElement(loginScreen.continueWithWorkEmailButton);
        String emailIdText = MobileAppUtilities.getAttributeValue(loginScreen.emailIdText, "content-desc");

        Assert.assertEquals(emailIdText, "Email Id");
    }

    @Test
    public void TC_07_VerifyEmailIdInputField() throws InterruptedException {
        LanguageSelectionScreen languageScreen = ScreenObject.screen(LanguageSelectionScreen.class);
        LoginScreen loginScreen = ScreenObject.screen(LoginScreen.class);
        languageScreen.clickTheLanguageButton("English");
        $(languageScreen.languageScreenNextButton).should(Condition.visible).click();
        MobileAppUtilities.clickOnWebElement(loginScreen.continueWithWorkEmailButton);
        MobileAppUtilities.clickOnWebElement(loginScreen.emailIdInputFiled);
        MobileAppUtilities.enterTextInTheInputField(loginScreen.emailIdInputFiled, "testing");
        String invalidEmailIDErrorMessage = MobileAppUtilities.getAttributeValue(loginScreen.invalidEmailErrorMessage, "content-desc");
        boolean nextButtonDisabled = MobileAppUtilities.isTheButtonClickable(loginScreen.emailIdSubmitNextButton);
        MobileAppUtilities.clearTextFromInputField(loginScreen.emailIdInputFiled);
        MobileAppUtilities.enterTextInTheInputField(loginScreen.emailIdInputFiled,"sravan@refyne.co.in");
        boolean nextButtonEnabled = MobileAppUtilities.isTheButtonClickable(loginScreen.emailIdSubmitNextButton);

        Assert.assertEquals(invalidEmailIDErrorMessage,"Please enter a valid email");
        Assert.assertFalse(nextButtonDisabled);
        Assert.assertTrue(nextButtonEnabled);

    }
}
