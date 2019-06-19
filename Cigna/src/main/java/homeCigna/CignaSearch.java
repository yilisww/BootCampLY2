package homeCigna;

import baseAPI.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CignaSearch extends CommonAPI {
    @FindBy(xpath="//input[@type='search']")
    WebElement Search;
    @FindBy(xpath = "//*[@id=\"csng-search-header\"]/search-header-bar/form/div/cigna-typeahead/input")
    WebElement HeaderSearch;
    @FindBy(xpath="//*[@id=\"csng-search-results\"]/search-bar/form/div/cigna-typeahead/input")
    WebElement ResultSearch;

    public void SearchProduct() throws InterruptedException {

        Search.sendKeys("monitor",Keys.ENTER);
        sleepFor(2);
        HeaderSearch.sendKeys("Dental", Keys.ENTER);
        sleepFor(1);
        ResultSearch.sendKeys("Vision", Keys.ENTER);
        sleepFor(1);
    }
}
