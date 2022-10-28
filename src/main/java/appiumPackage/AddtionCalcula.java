package appiumPackage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AddtionCalcula  {


    protected WebDriver driver;

    @Test
    public void initialTest() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        caps.setCapability(MobileCapabilityType.APP,
                "https://cybertek-appium.s3.amazonaws.com/calculator.apk");

        URL url = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver<MobileElement>(url, caps);

    }

        @Test
       public void addTest () {

        MobileElement one = driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
        one.click();
        MobileElement five = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
        five.click();
        MobileElement plus = driver.findElement(MobileBy.AccessibilityId("plus"));
        plus.click();
        MobileElement eight = driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
        eight.click();
        MobileElement equals = driver.findElement(MobileBy.AccessibilityId("equals"));
        equals.click();

    }
    }











