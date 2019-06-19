package citiBankHome;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CitiBankService {

    @FindBy(xpath = "//*[@id='banking']")
    public WebElement Banking;

    @FindBy(xpath = "//*[@id='bankingOverview_Link']")
    public WebElement BankingOverview;

    @FindBy(linkText = "Checking")
    public WebElement Checking;

    @FindBy(linkText = "Savings")
    public WebElement Savings;



    public void BankingService(){
        Banking.click();
        BankingOverview.click();
        Checking.click();
        Savings.click();
    }


}
