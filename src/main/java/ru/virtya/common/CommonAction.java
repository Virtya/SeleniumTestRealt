package ru.virtya.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static ru.virtya.common.Config.PLATFORM_BROWSER;

public class CommonAction {
    private static WebDriver driver = null;

    private CommonAction() {

    }

    public static WebDriver createDriver() {
        if (driver == null) {
            switch (PLATFORM_BROWSER) {
                case "win_yandex":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                    ChromeOptions options = new ChromeOptions();
                    options.setBinary("C:/Users/Admin/AppData/Local/Yandex/YandexBrowser/Application/browser.exe");
                    driver = new ChromeDriver(options);
                    break;
                default:
                    Assert.fail("Incorrect platform");
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().getImplicitWaitTimeout();
        }
        return driver;
    }
}
