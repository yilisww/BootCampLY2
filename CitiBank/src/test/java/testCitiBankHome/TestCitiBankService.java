package testCitiBankHome;

import baseAPI.CommonAPI;
import citiBankHome.CitiBankService;
import citiBankHome.CitiHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCitiBankService extends CommonAPI {

    @Test
    public void testCitiBankService() throws InterruptedException {
        CitiBankService citiBankService = PageFactory.initElements(driver, CitiBankService.class);
        citiBankService.BankingService();
        sleepFor(2);
    }
}
