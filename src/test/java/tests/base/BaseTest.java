package tests.base;

import org.openqa.selenium.WebDriver;
import ru.virtya.common.CommonAction;
import ru.virtya.pages.base.BasePage;
import ru.virtya.pages.listing.RealtListingPage;
import ru.virtya.pages.realthome.RealtHomePage;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage page = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);

    protected RealtListingPage realtListingPage = new RealtListingPage(driver);
}
