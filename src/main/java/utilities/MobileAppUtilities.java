package utilities;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class MobileAppUtilities {

    public static void enterTextInTheInputField(WebElement element, String text){
        $(element).should(Condition.visible).click();
        $(element).should(Condition.visible).sendKeys(text);
    }

    public static String getElementText(WebElement element){

      return  $(element).should(Condition.visible).getText();
    }

    public static void clickOnWebElement(WebElement element){
        $(element).should(Condition.visible).click();
    }

    public static String getAttributeValue(WebElement element, String attribute){
        return $(element).getAttribute(attribute);
    }
    public static void clearTextFromInputField(WebElement element){
        $(element).clear();
    }
    public static boolean isTheButtonClickable(WebElement element){
        return $(element).should(Condition.visible).isEnabled();
    }
}
