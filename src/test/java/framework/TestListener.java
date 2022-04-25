package framework;

import aquality.selenium.browser.AqualityServices;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        screenshot();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        screenshot();
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        screenshot();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        screenshot();
    }

    private static byte[] screenshot() {
        return AqualityServices.getBrowser().getScreenshot();
    }
}