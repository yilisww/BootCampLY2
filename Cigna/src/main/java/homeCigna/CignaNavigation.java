package homeCigna;

import baseAPI.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CignaNavigation extends CommonAPI {

    @FindBy(id = "oo_no_thanks")
    WebElement NoThanks;

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div/nav[3]/div/ul/li[1]/a")
    WebElement IndiFami;

    @FindBy(xpath = "//*[@id=\"nav-item-l2-plans-services\"]/button")
    WebElement Plan;

    @FindBy(css = "#nav-item-l2-plans-services > div > div > div:nth-child(1) > div:nth-child(3) > a")
    WebElement Dental;

    @FindBy(linkText = "About Us")
    WebElement AboutUs;

    @FindBy(xpath = "//*[@id=\"1385098823854\"]/div/div[5]/header/div/nav/div/ul/li[1]/a")
    WebElement CompanyProfile;

    @FindBy(xpath = "//*[@id=\"1385098823854\"]/div/div[5]/header/div/nav/div/ul/li[1]/div/div/div[1]/ul/li[5]/a")
    WebElement CignaHistory;

    //back to Homepage
    @FindBy(xpath = "//*[@id=\"cigna-logo\"]/path[4]")
    WebElement Homepage;

    public void Navigation() throws InterruptedException {
        NoThanks.click();
        sleepFor(1);
        IndiFami.click();
        sleepFor(1);
        Plan.click();
        sleepFor(1);
        Dental.click();
        sleepFor(1);
        AboutUs.click();
        sleepFor(1);
        CompanyProfile.click();
        sleepFor(1);
        CignaHistory.click();
        sleepFor(1);
        Homepage.click();
        sleepFor(1);
    }
}
