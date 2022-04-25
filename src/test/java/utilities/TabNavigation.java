package utilities;

import aquality.selenium.browser.AqualityServices;

public class TabNavigation {

    private TabNavigation() {
    }

    public static void navigate() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String currentTab = AqualityServices.getBrowser().tabs().getCurrentTabHandle();
        System.out.println("currentTab" + currentTab);
        for (String actual : AqualityServices.getBrowser().tabs().getTabHandles()) {
            System.out.println("actual " + actual);
            if (!actual.equalsIgnoreCase(currentTab)) {
                AqualityServices.getBrowser().tabs().switchToTab(actual);
            }
        }
        AqualityServices.getBrowser().waitForPageToLoad();
    }

    public static void closeTab() {
        AqualityServices.getBrowser().tabs().closeTab();
        AqualityServices.getBrowser().tabs().switchToTab(0);

    }

    public static void switchToFirstTab() {
        AqualityServices.getBrowser().tabs().switchToTab(0);
    }

    public static void navigateBackToPreviousPage() {
        AqualityServices.getBrowser().goBack();
    }

    public static void refresh() {
        AqualityServices.getBrowser().refresh();
        AqualityServices.getBrowser().waitForPageToLoad();
    }
}