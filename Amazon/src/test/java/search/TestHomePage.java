package search;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;
import java.io.IOException;

public class TestHomePage extends CommonAPI {
    @Test
    public void searchData()throws IOException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.searchItemsAndSubmitButton();
    }
}