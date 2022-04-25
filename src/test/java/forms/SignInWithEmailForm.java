package forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SignInWithEmailForm extends Form {
    private static final By FORM_LOCATOR = By.xpath("//h1[text()='Sign in with email']");

    private final ITextBox emailTxb = getElementFactory().getTextBox(
            By.id("ui-sign-in-email-input"), "Email");
    private final IButton nextBtn = getElementFactory().getButton(
            By.xpath("//*[@type='submit']"), "Next");

    public SignInWithEmailForm() {
        super(FORM_LOCATOR, "Sign in with email form");
    }
}
