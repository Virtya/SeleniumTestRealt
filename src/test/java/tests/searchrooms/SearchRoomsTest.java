package tests.searchrooms;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class SearchRoomsTest extends BaseTest {

    @Test
    public void checkIsRedirectToListing() {
        page.open("https://realt.by");

        realtHomePage
                .enterCountRooms()
                .clickToFindRooms();

        realtListingPage.checkCountCards();
    }

}
