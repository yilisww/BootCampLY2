package testAmazon;

import amazonHome.AccountLogIn;
import baseAPI.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAccoutnLogin extends CommonAPI {

    @Test
    public void testAccountLogin() throws InterruptedException {
        AccountLogIn accountLogin = PageFactory.initElements(driver, AccountLogIn.class);
        accountLogin.Accountlogin();
        /*
        accountLogin.setClicksignin();
        accountLogin.setSignin();
        accountLogin.setPassWord();
        accountLogin.setSignInButton();
         */
    }
}
