package androidScreens;

import com.codeborne.selenide.Selenide;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;


public class LanguageSelectionScreen {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"English\"]")
    private WebElement englishLanguageButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"हिंदी\"]")
    private WebElement hindiLanguageButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"ಕನ್ನಡ\"]")
    private WebElement kannadaLanguageButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"മലയാളം\"]")
    private WebElement malayalamLanguageButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"தமிழ்\"]")
    private WebElement tamilLanguageButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"తెలుగు\"]")
    private WebElement teluguLanguageButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"मराठी\"]")
    private WebElement marathiLanguageButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"বাংলা\"]")
    private WebElement bengaliLanguageButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"कोंकणी\"]")
    private WebElement konkaniLanguageButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"ଓଡ଼ିଆ\"]")
    private WebElement oriyaLanguageButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"ગુજરાતી\"]")
    private WebElement gujaratiLanguageButton;

    public void clickTheLanguageButton(String language)  {

        switch (language.toLowerCase()){
            case "hindi": Selenide.$(hindiLanguageButton).should(visible).click();
            break;
            case "english": Selenide.$(englishLanguageButton).shouldBe(visible).click();
            break;
            case "kannada": Selenide.$(kannadaLanguageButton).should(visible).click();
            break;
            case "malayalam": Selenide.$(malayalamLanguageButton).should(visible).click();
            break;
            case "tamil": Selenide.$(tamilLanguageButton).should(visible).click();
            break;
            case "telugu": Selenide.$(teluguLanguageButton).should(visible).click();
            break;
            case "marati": Selenide.$(marathiLanguageButton).should(visible).click();
            break;
            case "bengali": Selenide.$(bengaliLanguageButton).should(visible).click();
            break;
            case "gujarathi": Selenide.$(gujaratiLanguageButton).should(visible).click();
            break;
            case "oriya": Selenide.$(oriyaLanguageButton).should(visible).click();
            break;
            case "konkani": Selenide.$(konkaniLanguageButton).should(visible).click();
            break;
            default: System.out.println(language + " language option is not present in the app.");
        }
    }
}
