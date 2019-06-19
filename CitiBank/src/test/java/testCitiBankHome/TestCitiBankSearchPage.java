package testCitiBankHome;

import baseAPI.CommonAPI;
import citiBankHome.CitiBankSearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCitiBankSearchPage extends CommonAPI {

    @Test
    public void testCitiBankSearch() throws InterruptedException {
        CitiBankSearchPage citiBankSearchPage = PageFactory.initElements(driver, CitiBankSearchPage.class);
        citiBankSearchPage.CitiBankSearch();
        sleepFor(2);
    }
}
