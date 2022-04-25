package tests;

import aquality.selenium.browser.AqualityServices;
import forms.GoogleAuthForm;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;
import utilities.TabNavigation;

public class JustTest extends BaseTest {

    @Test
    public void testRun() {
        new LoginPage().signWithGoogle();
        GoogleAuthForm googleAuthForm = new GoogleAuthForm();
        TabNavigation.navigate();
        googleAuthForm.loginByGoogle("sergey@billmybank.com", "5604215deZ");
        TabNavigation.switchToFirstTab();
        AccountsPage accountsPage = new AccountsPage();
        Assert.assertTrue(accountsPage.state().waitForDisplayed(), "Accounts page is not displayed");
        System.out.println("asdad");
        //sc-llYSUQ hRdpCd - spinner
    }
}