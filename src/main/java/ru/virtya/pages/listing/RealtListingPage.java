package ru.virtya.pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ru.virtya.pages.base.BasePage;
import ru.virtya.pages.realthome.RealtHomePage;

public class RealtListingPage extends BasePage {

    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath(
            "//*[@id=\"__next\"]/div[1]/div[1]/main/div/div/div/div/div[1]/div[2]/div[1]/div/div/div"
    );

    public RealtListingPage checkCountCards() {
        waitElement(driver.findElement(card));

        int countCards = driver.findElements(card).size();
        Assert.assertEquals(countCards, 30);

        return this;
    }
}
