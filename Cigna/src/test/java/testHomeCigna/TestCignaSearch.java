package testHomeCigna;

import baseAPI.CommonAPI;
import homeCigna.CignaSearch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCignaSearch extends CommonAPI {

    @Test
    public void testProductSearch() throws InterruptedException {
        CignaSearch cignaSearch = PageFactory.initElements(driver, CignaSearch.class);
        cignaSearch.SearchProduct();
        sleepFor(1);
    }
}
