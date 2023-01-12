package stellaburgertests;

import base.BrowserRule;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Rule;
import org.junit.Test;
import pageobject.AccountPage;

import static constants.Constant.*;

@DisplayName("Переход в личный кабинет")
public class PersonalAccountTest {

    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    @DisplayName("Успешная авторизация в личном кабинете")
    public void enterAccountTest() {
        AccountPage accountPage = new AccountPage(browserRule.getDriver());
        accountPage
                .open()
                .clickButtonEnterAccount()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .clickButtonPersonalArea()
                .isDisplayedFieldName()
                .isDisplayedFieldLogin()
                .isDisplayedFieldPassword();
    }

}
