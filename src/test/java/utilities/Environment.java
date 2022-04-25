package utilities;

import aquality.selenium.core.utilities.JsonSettingsFile;

public class Environment {
    private static final JsonSettingsFile ENVIRONMENT_SETTINGS_FILE;

    static {
        String environment = System.getProperty("environment", "dev");
        ENVIRONMENT_SETTINGS_FILE = new JsonSettingsFile(String.format("environment/%s.json", environment.toLowerCase()));
    }

    public static String getBaseUrl() {
        return ENVIRONMENT_SETTINGS_FILE.getValue("/baseUrl").toString();
    }

    public static String getGoogleApiKey() {
        return ENVIRONMENT_SETTINGS_FILE.getValue("/googleApiKey").toString();
    }

    public static String getGoogleServiceUrl() {
        return ENVIRONMENT_SETTINGS_FILE.getValue("/service/google/url").toString();
    }

    public static String getBillMyBankServiceUrl() {
        return ENVIRONMENT_SETTINGS_FILE.getValue("/service/billmybank/url").toString();
    }

}
