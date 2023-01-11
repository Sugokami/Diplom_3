package stellaburgertests;

import base.BrowserRule;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Rule;
import org.junit.Test;
import pageobject.LoginPage;

import static constants.Constant.*;

public class EnterAccountTest {
    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    @DisplayName("Вход по кнопке 'Войти в аккаунт' на главной")
    public void loginFromPersonalAccountAreaTest() {
        LoginPage loginPage = new LoginPage(browserRule.getDriver());
        loginPage
                .open()
                .clickButtonEnterAccount()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .checkTextCreateOrder("Оформить заказ");
    }

    @Test
    @DisplayName("Вход через кнопку 'Личный кабинет'")
    public void loginFromRegistrationFormTest() {
        LoginPage loginPage = new LoginPage(browserRule.getDriver());
        loginPage
                .open()
                .clickButtonPersonalArea()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .checkTextCreateOrder("Оформить заказ");
    }

    @Test
    @DisplayName("Вход через кнопку в форме регистрации")
    public void LoginFromRegistrationFormTest() {
        LoginPage loginPage = new LoginPage(browserRule.getDriver());
        loginPage
                .open()
                .clickButtonEnterAccount()
                .clickLinkTextRegistration()
                .clickLinkTextEnter()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .checkTextCreateOrder("Оформить заказ");
    }

    @Test
    @DisplayName("Вход через кнопку в форме восстановления пароля")
    public void LoginFromRestorePasswordTest() {
        LoginPage loginPage = new LoginPage(browserRule.getDriver());
        loginPage
                .open()
                .clickButtonPersonalArea()
                .clickLinkTextRestorePassword()
                .clickLinkTextEnter()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .checkTextCreateOrder("Оформить заказ");
    }

}
