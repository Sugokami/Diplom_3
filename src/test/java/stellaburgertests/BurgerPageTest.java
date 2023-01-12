package stellaburgertests;

import base.BrowserRule;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Rule;
import org.junit.Test;
import pageobject.BurgerPage;

@DisplayName("Переход между вкладками конструктора")
public class BurgerPageTest {

    @Rule
    public BrowserRule browserRule = new BrowserRule();

    @Test
    @DisplayName("Переход к разделу 'Булки'")
    public void goToBunTest() {
        BurgerPage burgerPage = new BurgerPage(browserRule.getDriver());
        burgerPage
                .open()
                .clickButtonFilling()
                .clickButtonBun()
                .checkTextCurrentButton("Булки");
    }

    @Test
    @DisplayName("Переход к разделу 'Начинки'")
    public void goToFillingTest() {
        BurgerPage burgerPage = new BurgerPage(browserRule.getDriver());
        burgerPage
                .open()
                .clickButtonSauce()
                .clickButtonFilling()
                .checkTextCurrentButton("Начинки");
    }

    @Test
    @DisplayName("Переход к разделу 'Соусы'")
    public void goToSauceTest() {
        BurgerPage burgerPage = new BurgerPage(browserRule.getDriver());
        burgerPage
                .open()
                .clickButtonFilling()
                .clickButtonSauce()
                .checkTextCurrentButton("Соусы");
    }

}
