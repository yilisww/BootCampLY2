package testFacebookHome;

import baseAPI.CommonAPI;
import facebookHome.FacebookLogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestFacebookLogIn extends CommonAPI {

    @Test
    public void testFacebookLogIn() throws InterruptedException {
        FacebookLogIn accountLogin = PageFactory.initElements(driver, FacebookLogIn.class);
        accountLogin.FacebookLogIn();
        sleepFor(2);
    }


        /*
        accountLogin.setEmail();
        sleepFor(1);
        accountLogin.setPassWord();
        sleepFor(2);
        accountLogin.setSearchName();
        sleepFor(1);
        accountLogin.setFriend();
        sleepFor(1);
//        accountLogin.setAddFriend();
        sleepFor(1);
        accountLogin.setPost();
        sleepFor(1);

         */


}
