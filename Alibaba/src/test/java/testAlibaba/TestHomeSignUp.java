package testAlibaba;

import alibabaHome.HomeSignUp;
import baseAPI.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomeSignUp extends CommonAPI {

    //use Page Obe\ject Model
    @Test
    public void testSignUp() throws IOException, InterruptedException {
        HomeSignUp sign = PageFactory.initElements(driver, HomeSignUp.class);
        sign.signUp(driver);
    }

}
