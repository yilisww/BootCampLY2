package testHomeCigna;

import baseAPI.CommonAPI;
import homeCigna.CignaNavigation;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCignaNavigation extends CommonAPI {

    @Test
    public void testNavigation() throws InterruptedException {
        CignaNavigation cignaNavigation = PageFactory.initElements(driver, CignaNavigation.class);
        cignaNavigation.Navigation();
        sleepFor(1);
    }
}
