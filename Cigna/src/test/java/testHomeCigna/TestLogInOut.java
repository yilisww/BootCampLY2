package testHomeCigna;

import baseAPI.CommonAPI;
import homeCigna.LogInOut;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogInOut extends CommonAPI {

    @Test
    public void testLogInOut() throws InterruptedException {
        LogInOut logInOut = PageFactory.initElements(driver, LogInOut.class);
        logInOut.LogIn();
        sleepFor(1);

    }
}
