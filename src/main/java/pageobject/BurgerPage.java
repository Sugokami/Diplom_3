package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.Constant.BASE_URL;

public class BurgerPage extends Steps {
    private final By buttonBun = By.xpath(".//span[text()='Булки']");
    private final By buttonSauce = By.xpath(".//span[text()='Соусы']");
    private final By buttonFilling = By.xpath(".//span[text()='Начинки']");
    private final By buttonAll = By.cssSelector(".tab_tab_type_current__2BEPc");

    public BurgerPage(WebDriver driver) {
        super(driver);
    }

    public BurgerPage open() {
        open(BASE_URL);
        return this;
    }

    // Методы клика по кнопке
    public BurgerPage clickButtonBun() {
        click(buttonBun);
        return this;
    }

    public BurgerPage clickButtonSauce() {
        click(buttonSauce);
        return this;
    }

    public BurgerPage clickButtonFilling() {
        click(buttonFilling);
        return this;
    }

    // Метод проверки текcтовой надписи
    public BurgerPage checkTextCurrentButton(String expected) {
        checkText(buttonAll, expected);
        return this;
    }


}
