package stellaburgertests;

import base.BrowserRule;
import io.qameta.allure.junit4.DisplayName;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Rule;
import org.junit.Test;
import pageobject.RegistrationPage;

import static constants.Constant.*;

@DisplayName("Регистрация")
public class RegistrationPageTest {

    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    @DisplayName("Успешная регистрация")
    public void trueRegTest() {
        String name = RandomStringUtils.randomAlphanumeric(10);
        String email = RandomStringUtils.randomAlphanumeric(12) + "@ya.ru";
        RegistrationPage registrationPage = new RegistrationPage(browserRule.getDriver());
        registrationPage
                .open()
                .sendNameToField(name)
                .sendEmailToField(email)
                .sendPasswordToField(PASSWORD)
                .clickButtonRegistration()
                .checkTextEnter("Вход");
    }

    @Test
    @DisplayName("Некорректный пароль")
    public void falseRegTest() {
        RegistrationPage registrationPage = new RegistrationPage(browserRule.getDriver());
        registrationPage
                .open()
                .sendNameToField(RandomStringUtils.randomAlphanumeric(10))
                .sendEmailToField(RandomStringUtils.randomAlphanumeric(12) + "@ya.ru")
                .sendPasswordToField("парол")
                .clickButtonRegistration()
                .checkTextIncorrectPassword("Некорректный пароль");
    }
}
