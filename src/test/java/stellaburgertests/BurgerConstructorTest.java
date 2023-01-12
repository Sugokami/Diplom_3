package stellaburgertests;

import base.BrowserRule;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Rule;
import org.junit.Test;
import pageobject.AccountPage;

import static constants.Constant.*;

@DisplayName("Переход из личного кабинета в конструктор и на StellaBurgers")
public class BurgerConstructorTest {

    @Rule
    public BrowserRule browserRule = new BrowserRule();
    @Test
    @DisplayName("Переход по клику на кнопку 'Конструктор'")
    public void checkEnterConstructorTest() {
        AccountPage accountPage = new AccountPage(browserRule.getDriver());
        accountPage
                .open()
                .clickButtonEnterAccount()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .clickButtonPersonalArea()
                .clickTextConstructor()
                .checkTextCreateOrder("Оформить заказ");
    }

    @Test
    @DisplayName("Переход по клику на логотип Stellar Burgers")
    public void checkEnterStellarBurgersTest() {
        AccountPage accountPage = new AccountPage(browserRule.getDriver());
        accountPage
                .open()
                .clickButtonEnterAccount()
                .sendEmailToField(EMAIL)
                .sendPasswordToField(PASSWORD)
                .clickButtonEnter()
                .clickButtonPersonalArea()
                .clickStellarBurgers()
                .checkTextCreateOrder("Оформить заказ");
    }

}
