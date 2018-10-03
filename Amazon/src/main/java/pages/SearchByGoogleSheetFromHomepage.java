package pages;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static googleAPI.GoogleSheetReader.getSheetsService;

public class SearchByGoogleSheetFromHomepage extends CommonAPI {
    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using =".nav-input")
    public static WebElement submitButtonWebElement;

    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }

    // Search by using Google Sheet data
    public List<String> searchBySheetData(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> col1Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col1Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(searchInputWebElement, row.get(0).toString());
            submitButtonWebElement.click();
            sleepFor(1);
            clearInputBox(searchInputWebElement);
            sleepFor(1);
        }
        return actual;
    }
}
