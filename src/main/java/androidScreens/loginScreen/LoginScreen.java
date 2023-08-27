package androidScreens.loginScreen;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.appium.AppiumSelectors;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.MobileAppUtilities;

import static com.codeborne.selenide.Selenide.$;

public class LoginScreen {

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"\"]")
    private WebElement mobileNumberInputField;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Next\"]")
    public WebElement loginScreenNextButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Please enter a valid phone number\"]")
    public WebElement invalidInputErrorMessage;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"\"])[2]")
    public WebElement menuButton;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"\"])[1]")
    public WebElement menuButtonCloseButton;


    public By errorMessage = AppiumSelectors.byAttribute("content-desc", "Please enter a valid phone number");


    public void enterMobileNumber(String mobileNumber) {
        $(mobileNumberInputField).should(Condition.visible).click();
        MobileAppUtilities.enterTextInTheInputField(mobileNumberInputField, mobileNumber);
    }

    public void clickNextButton() {
        $(loginScreenNextButton).should(Condition.visible).click();
    }
}
