package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchByGoogleSheetFromHomepage;
import java.io.IOException;

public class SearchByGoogleSheetFromHomepageTest extends CommonAPI {
    String spreadsheetId = "1emZMFDOS-IpaMSu09FQcDWZIagtX4_b95XjKXIWMXsw";
    String range = "Sheet1!A2:A";

    @Test
    public void objectCreationOfSearchByGoogleSheetData()throws IOException, InterruptedException{
        SearchByGoogleSheetFromHomepage searchByGoogleSheetFromHomepage = PageFactory.initElements(driver, SearchByGoogleSheetFromHomepage.class);
        searchByGoogleSheetFromHomepage.searchBySheetData(spreadsheetId, range);
    }
}
