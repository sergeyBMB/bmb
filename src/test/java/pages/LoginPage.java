package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class LoginPage extends Form {
    private static final By FORM_LOCATOR = By.xpath("//h1[text()='Sign in']");

    private final IButton signWithGoogleBtn = getElementFactory().getButton(
            By.xpath("//*[@data-provider-id='google.com']"), "Sign with google");
    private final IButton signWithEmailBtn = getElementFactory().getButton(
            By.xpath("//*[@data-provider-id='password']"), "Sign with email");

    public LoginPage() {
        super(FORM_LOCATOR, "Login page");
    }

    public void signWithGoogle() {
        signWithGoogleBtn.click();
    }

}
