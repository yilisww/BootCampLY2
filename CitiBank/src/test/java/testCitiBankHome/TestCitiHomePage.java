package testCitiBankHome;

import baseAPI.CommonAPI;
import citiBankHome.CitiHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCitiHomePage extends CommonAPI {

    @Test
    public void testCitiBank() throws InterruptedException {
        CitiHomePage citiHomePage = PageFactory.initElements(driver, CitiHomePage.class);
        citiHomePage.setUserID();
        sleepFor(1);
        citiHomePage.setPassWord();
        sleepFor(2);
    }
}
