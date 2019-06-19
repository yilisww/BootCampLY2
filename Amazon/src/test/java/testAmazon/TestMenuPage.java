package testAmazon;

import amazonHome.MenuPage;
import baseAPI.CommonAPI;
import org.testng.annotations.Test;

public class TestMenuPage extends MenuPage {
    @Test
    public void menu(){
        readMenuText();
    }
}
