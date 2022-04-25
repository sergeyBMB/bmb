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
}
