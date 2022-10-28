package appiumPackage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    
    public CalculatorPage () {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @AndroidFindBy(accessibility = "multiply")
    public MobileElement multiply ;

    @AndroidFindBy(accessibility = "equals")
    public MobileElement equals;

    @AndroidFindBy(id="com.google.android.calculator:id/result_preview")
    public MobileElement result;

    public void clickDigit (int digit){
        String Id ="com.google.android.calculator:id/digit_" + digit;
        MobileElement number = Driver.getDriver().findElement(By.id(equals.getId()));
        number.click();

    }





}
