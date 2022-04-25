package forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class GoogleAuthForm extends Form {
    private static final By FORM_LOCATOR = By.xpath("//h1[text()='Sign in with email']");

    private final ITextBox emailTxb = getElementFactory().getTextBox(
            By.id("identifierId"), "Email");
    private final ITextBox passwordTxb = getElementFactory().getTextBox(
            By.name("password"), "Password");
    private final IButton nextBtn = getElementFactory().getButton(
            By.id("identifierNext"), "Next");
    private final IButton passwordNextBtn = getElementFactory().getButton(
            By.id("passwordNext"), "Password next");

    public GoogleAuthForm() {
        super(FORM_LOCATOR, "Google auth form");
    }

    public void loginByGoogle(String email, String password) {
        emailTxb.sendKeys(email);
        nextBtn.click();
        passwordTxb.sendKeys(password);
        passwordNextBtn.click();
    }

}
