package citiBankHome;

import baseAPI.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CitiBankSearchPage extends CommonAPI {
    @FindBy(xpath = "//div[@class='citiSearchMenu']")
    public WebElement Search;

    @FindBy(xpath = "//*[@id='Howactivatenewcard-label']")
    public WebElement CommonQuestion;

    @FindBy(xpath = "//input[@placeholder='Tell us what you’re looking for']")
    public WebElement InputSearch;

    public void CitiBankSearch () {
        Search.click();
        CommonQuestion.click();
        InputSearch.sendKeys("What is the APR?");

    }
}
