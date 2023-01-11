package pageobject;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.TIME_OUT_IN_SECONDS;

public class Steps {
    private final WebDriver driver;

    public Steps(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @Step("Открытие страницы")
    public Steps open(String url) {
        driver.get(url);
        return this;
    }

    @Step("Ожидание элемента")
    public WebElement waitForElement(By element, long time) {
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    @Step("Нажатие на кнопку")
    public Steps click(By element) {
        driver.findElement(element).click();
        return this;
    }

    @Step("Ввод значения в поле")
    public Steps input(By element, String text) {
        driver.findElement(element).sendKeys(text);
        return this;
    }

    @Step("Проверка отображения текста {expected}")
    public Steps checkText(By element, String expected) {
        String txt = driver.findElement(element).getText();
        Assert.assertEquals("Ошибка, должно быть: " + expected, expected, txt);
        return this;
    }

    @Step("Отображается ли элемент")
    public Steps isDisplayed(By element) {
        waitForElement(element, TIME_OUT_IN_SECONDS);
        driver.findElement(element).isDisplayed();
        return this;
    }
}
