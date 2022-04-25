package tests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utilities.Environment;

public abstract class BaseTest {

    @BeforeSuite()
    public void setHeadlessModeIfNeeded() {
        if (System.getProperty("headless") != null && System.getProperty("headless").equals("on")) {
            setHeadless();
        }
    }

    private void setHeadless() {
        System.setProperty("driverSettings." + System.getProperty("browserName").toLowerCase() +".startArguments",
                "--headless");
    }

    @BeforeMethod
    public void startTheApp() {
        Browser browser = AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo(Environment.getBaseUrl());
        browser.waitForPageToLoad();
    }

    @AfterMethod
    public void closeTheApp() {
        if (AqualityServices.isBrowserStarted()) {
            AqualityServices.getBrowser().quit();
        }
    }
}
