package amazonHome;

import baseAPI.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLogIn extends CommonAPI {
    @FindBy(xpath = "//*[@id='nav-link-accountList']")
    WebElement Clicksignin;

    @FindBy(id = "ap_email")
    WebElement Signin;

    @FindBy(id = "ap_password")
    WebElement PassWord;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    WebElement SignInButton;

    /*
    public void setClicksignin(){
        Clicksignin.click();
    }

    public void setSignin(){
        Signin.sendKeys("yilisww5@gmail.com");
    }

    public void setPassWord(){
        PassWord.sendKeys("oct081978");
    }

    public void setSignInButton(){
        SignInButton.click();
    }
     */


    public void Accountlogin() throws InterruptedException {

        Clicksignin.click();
        sleepFor(2);
        Signin.sendKeys("yilisww5@gmail.com");
        sleepFor(2);
        PassWord.sendKeys("oct081978");
        sleepFor(2);
        SignInButton.click();
        sleepFor(2);
    }
}
