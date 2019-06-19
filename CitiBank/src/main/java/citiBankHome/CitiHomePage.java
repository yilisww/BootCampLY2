package citiBankHome;

import baseAPI.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CitiHomePage extends CommonAPI {

    @FindBy(id = "username")
    WebElement UserID;

    @FindBy(name = "password")
    WebElement PassWord;

    public void setUserID(){ UserID.sendKeys("yilisww5@gmail.com"); }

    public void setPassWord(){ PassWord.sendKeys("123456Go", Keys.ENTER); }



}
