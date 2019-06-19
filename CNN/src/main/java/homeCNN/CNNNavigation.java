package homeCNN;

import baseAPI.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CNNNavigation extends CommonAPI {

    @FindBy(linkText = "World")
    WebElement World;

    @FindBy(linkText = "US")
    WebElement USnews;

    @FindBy(xpath = "//*[@id='nav-section-submenu']/a[6]")
    WebElement Chinanews;

    //back to Homepage
    @FindBy(xpath = "//*[@id=\"logo\"]")
    WebElement Homepage;

    @FindBy(linkText = "Sport")
    WebElement Sport;

    public void setWorld(){ World.click(); }

    public void setUSnews(){ USnews.click(); }

    public void setChinanews(){ Chinanews.click(); }

    public void setHomepage(){ Homepage.click(); }

    public void setSport(){ Sport.click(); }

}
