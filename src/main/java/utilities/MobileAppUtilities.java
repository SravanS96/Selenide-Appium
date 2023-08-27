package utilities;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class MobileAppUtilities {

    public static void enterTextInTheInputField(WebElement element, String text){
        $(element).should(Condition.visible).click();
        $(element).should(Condition.visible).sendKeys(text);
    }
}
