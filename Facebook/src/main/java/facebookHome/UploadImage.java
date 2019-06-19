package facebookHome;

import baseAPI.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadImage extends CommonAPI {

    @FindBy(xpath = "//*[@id='email']")
    WebElement Email;

    @FindBy(id = "pass")
    WebElement PassWord;

    @FindBy(xpath = "//*[@id='js_8mm']/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div")
    WebElement CreatePost;

    @FindBy(xpath = "//input[@type='file']")
    WebElement UploadPhoto;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement Submit;


    public void FacebookLogIn() throws InterruptedException {
        Email.sendKeys("yilisww5@gmail.com");
        sleepFor(1);
        PassWord.sendKeys("123456Go", Keys.ENTER);
        sleepFor(5);
    }

    public void Facebookupload() throws InterruptedException {

        UploadPhoto.sendKeys("../Generic/src/main/resources/panda.jpg");
        sleepFor(10);
        Submit.click();
    }




}
