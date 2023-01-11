package base;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static constants.Constant.BASE_URL;
import static constants.Constant.TIME_OUT_IN_SECONDS;

public class BrowserRule extends ExternalResource {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @Override
    protected void before() throws Throwable {
        /*
        System.setProperty("webdriver.chrome.driver", "/Users/alexeyvovk/Projects/local-browser-drivers/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/Users/alexeyvovk/Projects/local-browser-drivers/geckodriver");
         */

        String browser = System.getenv("browser");

        if ("ya".equals(browser)) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/yandexdriver.exe");
                driver = new ChromeDriver();
        } else {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT_IN_SECONDS));
    }

    @Override
    protected void after() {
        driver.quit();
    }
}
