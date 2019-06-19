package testAlibaba;

import alibabaHome.HomeSearch;
import baseAPI.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomeSearch extends CommonAPI {
    @Test
    public void testHomeSearch1() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        HomeSearch hs = PageFactory.initElements(driver, HomeSearch.class);
        hs.searchItem("fishing boat");
        driver.findElement(By.className("ui-searchbar-keyword")).clear(); // clear searchInputField
        hs.searchItem("fishing rod");
        driver.findElement(By.className("ui-searchbar-keyword")).clear(); // clear searchInputField
        hs.searchItem("fishing string");

    }

    @Test
    public void testHomeSearch2() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        HomeSearch hs = PageFactory.initElements(driver, HomeSearch.class);
        hs.searchItemList();
    }
}
