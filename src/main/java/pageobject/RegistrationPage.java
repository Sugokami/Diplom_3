package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.Constant.REGISTRATIONS_URL;

public class RegistrationPage extends Steps {

    private final By inputNameField = By.xpath(".//fieldset[1]//input");
    private final By inputEmailField = By.xpath(".//fieldset[2]//input");
    private final By inputPasswordField = By.xpath(".//fieldset[3]//input");
    private final By buttonRegistration = By.xpath(".//button[text()='Зарегистрироваться']");
    private final By textIncorrectPassword = By.xpath("//*[text() = 'Некорректный пароль']");
    private final By textUserAlreadyExists = By.xpath("//*[text() = 'Такой пользователь уже существует']");
    private final By textEnter = By.xpath("//*[text() = 'Вход']");

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationPage open() {
        open(REGISTRATIONS_URL);
        return this;
    }

    // Метод клика по кнопке
    public RegistrationPage clickButtonRegistration() {
        click(buttonRegistration);
        return this;
    }

    // Методы заполнения поля
    public RegistrationPage sendNameToField(String name) {
        input(inputNameField, name);
        return this;
    }

    public RegistrationPage sendEmailToField(String email) {
        input(inputEmailField, email);
        return this;
    }

    public RegistrationPage sendPasswordToField(String password) {
        input(inputPasswordField, password);
        return this;
    }

    // Методы проверки надписи
    public RegistrationPage checkTextIncorrectPassword(String expected) {
        checkText(textIncorrectPassword, expected);
        return this;
    }

    public RegistrationPage checkTextUserAlreadyExists(String expected) {
        checkText(textUserAlreadyExists, expected);
        return this;
    }

    public RegistrationPage checkTextEnter(String expected) {
        checkText(textEnter, expected);
        return this;
    }

}
