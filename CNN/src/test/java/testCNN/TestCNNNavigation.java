package testCNN;

import baseAPI.CommonAPI;
import homeCNN.CNNNavigation;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestCNNNavigation extends CommonAPI {

    @Test
    public void testFacebookLogIn() throws InterruptedException {
        CNNNavigation cnnNavigation = PageFactory.initElements(driver, CNNNavigation.class);
        cnnNavigation.setWorld();
        sleepFor(2);
        cnnNavigation.setUSnews();
        sleepFor(2);
        cnnNavigation.setChinanews();
        sleepFor(2);
        cnnNavigation.setHomepage();
        sleepFor(2);
        cnnNavigation.setSport();
        sleepFor(2);
    }
}
