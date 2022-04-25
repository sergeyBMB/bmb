package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class AccountsPage extends Form {
    private static final By FORM_LOCATOR = By.xpath("//h1[text()='Accounts']");

    public AccountsPage() {
        super(FORM_LOCATOR, "Accounts page");
    }
}
