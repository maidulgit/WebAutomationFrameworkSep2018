package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchByXlsFromHomepage;

import java.io.IOException;

public class SearchByXlsFromHomepageTest extends CommonAPI {
    @Test
    public void searchXlsData() throws IOException, InterruptedException {
        SearchByXlsFromHomepage searchByXlsFromHomepage = PageFactory.initElements(driver, SearchByXlsFromHomepage.class);
        searchByXlsFromHomepage.useXlsData("itemlist.xls");
    }
}

