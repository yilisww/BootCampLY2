package testAmazon;

import amazonHome.SearchPage;
import baseAPI.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearchPage extends CommonAPI {
    SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
    @Test
    public void test2() {
        searchPage.searchItems();
    }

    @Test
    public void search() throws InterruptedException {
        typeOnCss("#twotabsearchtextbox","iPhone");
        clickOnCss(".nav-input");
        Thread.sleep(1000);
        driver.findElement(By.className("a-size-base a-color-base")).click();
    }

    @Test
    public void Deals(){
        driver.findElement(By.linkText("Today's Deals")).click();
    }

    @Test
    public void Departments() throws InterruptedException {
        driver.findElement(By.linkText("Departments")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Amazon Music Unlimited")).click();
    }

    @Test
    public void Orders() throws InterruptedException {
        driver.findElement(By.linkText("Orders")).click();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("yilisww5@gmail.com");
        sleepFor(1);
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("19751978");
        Thread.sleep(1000);
        driver.findElement(By.id("signInSubmit")).click();
    }
}
