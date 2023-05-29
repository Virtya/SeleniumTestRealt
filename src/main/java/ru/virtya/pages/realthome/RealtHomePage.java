package ru.virtya.pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.virtya.pages.base.BasePage;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    By countRooms = By.xpath("//select[@id='rooms']");
    By selectedSecondRoom = By.xpath("//select[@id='rooms']/option[@value='2']");
    By findBtn = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public RealtHomePage enterCountRooms() {
        driver.findElement(countRooms).click();
        driver.manage().timeouts().getImplicitWaitTimeout();
        driver.findElement(selectedSecondRoom).click();

        return this;
    }

    public RealtHomePage clickToFindRooms() {
        driver.findElement(findBtn).click();

        return this;
    }
}
