package stellaburgertests;

import base.BrowserRule;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Rule;
import org.junit.Test;
import pageobject.AccountPage;

import static constants.Constant.*;

@DisplayName("Выход из аккаунта")
public class LogoutTest {
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    @DisplayName("Выход по кнопке 'Выйти' в личном кабинете")
    public void LogoutTest() {
        AccountPage accountPage = new AccountPage(browserRule.getDriver());
        accountPage
                .open()
                .clickButtonEnterAccount()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .clickButtonPersonalArea()
                .clickButtonExit()
                .isDisplayedTextEnter();
    }

}
