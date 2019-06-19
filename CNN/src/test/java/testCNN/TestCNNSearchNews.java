package testCNN;

import baseAPI.CommonAPI;
import homeCNN.CNNSearchNews;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCNNSearchNews extends CommonAPI {

    @Test
    public void testCNNSearch() throws InterruptedException {
        CNNSearchNews cnnSearchNews = PageFactory.initElements(driver, CNNSearchNews.class);
        cnnSearchNews.CNNSearch();
    }
}
