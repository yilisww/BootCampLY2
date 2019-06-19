package homeCigna;

import baseAPI.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInOut extends CommonAPI {

    @FindBy(id = "oo_no_thanks")
    WebElement NoThanks;

    @FindBy(xpath = "//*[@id='includes-content']/div[1]/nav[2]/div/ul/li[2]/a")
    WebElement LogIn;

    @FindBy(id = "username")
    WebElement UserName;

    @FindBy(name = "password")
    WebElement PassWord;

    @FindBy(xpath = "//*[@id=\"loginbutton\"]")
    WebElement LoginButton;

    public void LogIn() throws InterruptedException {
  //      NoThanks.click();
   //     sleepFor(1);
        LogIn.click();
        sleepFor(1);
        UserName.sendKeys("yilisww5@gmail.com");
        sleepFor(1);
        PassWord.sendKeys("123456Go", Keys.ENTER);
        sleepFor(1);
        LoginButton.click();
    }
}
