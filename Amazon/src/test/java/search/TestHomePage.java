package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

import java.io.IOException;

public class TestHomePage extends CommonAPI {

    @Test
    public void searchData()throws IOException{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.searchItemsAndSubmitButton();
    }
}