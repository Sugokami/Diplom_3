package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.Constant.BASE_URL;

public class LoginPage extends Steps {
    // Локатор поля ввода email
    private final By inputEmailField = By.xpath(".//fieldset[1]//input");
    // Локатор поля ввода пароля
    private final By inputPasswordField = By.xpath(".//fieldset[2]//input");
    // Локатор кнопки войти
    private final By buttonEnter = By.xpath(".//button[text()='Войти']");
    // Локатор кнопки войти в аккаунт
    private final By buttonEnterAccount = By.xpath(".//button[text()='Войти в аккаунт']");
    // Локатор кнопки Оформить заказ
    private final By buttonCreateOrder = By.xpath(".//button[text()='Оформить заказ']");
    // Локатор кнопки Личный Кабинет
    private final By buttonPersonalArea = By.xpath(".//*[text()='Личный Кабинет']");
    // Локатор линктекст Войти
    private final By linkTextEnter = By.linkText("Войти");
    // Локатор линктекст Зарегистрироваться
    private final By linkTextRegister = By.linkText("Зарегистрироваться");
    // Локатор линктекст Восстановить пароль
    private final By linkTextRestorePassword = By.linkText("Восстановить пароль");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open() {
        open(BASE_URL);
        return this;
    }

    public LoginPage clickButtonEnterAccount() {
        click(buttonEnterAccount);
        return this;
    }

    public LoginPage clickButtonPersonalArea() {
        click(buttonPersonalArea);
        return this;
    }

    public LoginPage clickLinkTextEnter() {
        click(linkTextEnter);
        return this;
    }

    public LoginPage clickLinkTextRegistration() {
        click(linkTextRegister);
        return this;
    }

    public LoginPage clickLinkTextRestorePassword() {
        click(linkTextRestorePassword);
        return this;
    }

    public LoginPage clickButtonEnter() {
        click(buttonEnter);
        return this;
    }

    // Метод заполнения поля
    public LoginPage sendEmailToField(String email) {
        input(inputEmailField, email);
        return this;
    }

    public LoginPage sendPasswordToField(String password) {
        input(inputPasswordField, password);
        return this;
    }

    // Метод проверки текстовой надписи
    public LoginPage checkTextCreateOrder(String expected) {
        checkText(buttonCreateOrder, expected);
        return this;
    }

}
