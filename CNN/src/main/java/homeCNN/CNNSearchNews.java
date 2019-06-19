package homeCNN;

import baseAPI.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CNNSearchNews extends CommonAPI {

    @FindBy(xpath="//*[@id=\"search-button\"]")
    WebElement Search;
    @FindBy(id="search-input-field")
    WebElement InputSearch;
    @FindBy(id="submit-button")
    WebElement submitbutton;

    public void CNNSearch() throws InterruptedException {

        Search.click();
        sleepFor(2);

        InputSearch.sendKeys("2019 Women's World Cup", Keys.ENTER);
        sleepFor(1);

        InputSearch.sendKeys("2019 NBA Finals", Keys.ENTER);
        sleepFor(1);
    }
}
