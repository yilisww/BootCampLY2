package testFacebookHome;

import baseAPI.CommonAPI;
import facebookHome.UploadImage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestUploadImage extends CommonAPI {


    @Test
    public void testFacebookUpload() throws InterruptedException {
        UploadImage uploadImage = PageFactory.initElements(driver, UploadImage.class);
        uploadImage.FacebookLogIn();
        sleepFor(2);
        uploadImage.Facebookupload();
        sleepFor(2);
    }
}
