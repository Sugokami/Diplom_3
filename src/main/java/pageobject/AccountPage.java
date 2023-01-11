package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.Constant.BASE_URL;

public class AccountPage extends Steps {
    // Локатор кнопки Войти в аккаунт
    private final By buttonEnterAccount = By.xpath(".//button[text()='Войти в аккаунт']");
    // Локатор поле ввода email
    private final By inputEmailField = By.xpath(".//fieldset[1]//input");
    // Локатор поле ввода Пароля
    private final By inputPasswordField = By.xpath(".//fieldset[2]//input");
    // Локатор кнопки Войти
    private final By buttonEnter = By.xpath(".//button[text()='Войти']");
    // Локатор кнопки Выход
    private final By buttonExit = By.xpath(".//button[text()='Выход']");
    // Локатор кнопки Личный Кабинет
    private final By buttonPersonalArea = By.xpath(".//*[text()='Личный Кабинет']");
    // Локатор текста Имя
    private final By inputTypeName = By.xpath(".//*[text()='Имя']");
    // Локатор текста Логин
    private final By inputTypeLogin = By.xpath(".//*[text()='Логин']");
    // Локатор текста Пароль
    private final By inputTypePassword = By.xpath(".//*[text()='Пароль']");
    // Локатор текста Вход
    private final By textEnter = By.xpath(".//*[text()='Вход']");
    // Локатор текста Конструктор
    private final By textConstructor = By.xpath(".//*[text()='Конструктор']");
    // Локатор кнопки Оформить заказ
    private final By buttonCreateOrder = By.xpath(".//button[text()='Оформить заказ']");
    // Локатор Stellar Burgers
    private final By stellarBurgers = By.xpath("//a[.//*[@id='filter0_f']]");

    // Конструктор
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public AccountPage open() {
        open(BASE_URL);
        return this;
    }
    // Методы кликов по элементам
    public AccountPage clickStellarBurgers() {
        click(stellarBurgers);
        return this;
    }

    public AccountPage clickTextConstructor() {
        click(textConstructor);
        return this;
    }

    public AccountPage clickButtonEnter() {
        click(buttonEnter);
        return this;
    }

    public AccountPage clickButtonExit() {
        click(buttonExit);
        return this;
    }

    public AccountPage clickButtonEnterAccount() {
        click(buttonEnterAccount);
        return this;
    }

    public AccountPage clickButtonPersonalArea() {
        click(buttonPersonalArea);
        return this;
    }

    // Методы видимости элементов
    public AccountPage isDisplayedButtonEnter() {
        isDisplayed(buttonEnter);
        return this;
    }

    public AccountPage isDisplayedTextEnter() {
        isDisplayed(textEnter);
        return this;
    }

    public AccountPage isDisplayedFieldName() {
        isDisplayed(inputTypeName);
        return this;
    }

    public AccountPage isDisplayedFieldLogin() {
        isDisplayed(inputTypeLogin);
        return this;
    }

    public AccountPage isDisplayedFieldPassword() {
        isDisplayed(inputTypePassword);
        return this;
    }

    // Методы заполенения полей
    public AccountPage sendPasswordToField(String name) {
        input(inputPasswordField, name);
        return this;
    }

    public AccountPage sendEmailToField(String name) {
        input(inputEmailField, name);
        return this;
    }

    // Метод проверки текстовой надписи
    public AccountPage checkTextCreateOrder(String expected) {
        checkText(buttonCreateOrder, expected);
        return this;
    }


}
