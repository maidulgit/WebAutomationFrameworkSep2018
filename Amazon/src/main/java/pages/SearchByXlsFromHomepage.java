package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.DataReader;

import java.io.IOException;

public class SearchByXlsFromHomepage extends CommonAPI {
    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using =".nav-input")
    public static WebElement submitButtonWebElement;

    DataReader dtr = new DataReader();

    public String[] getDataCol1(String fileName) throws IOException {
        String path = "Amazon/data/"+fileName;
        String[] output = dtr.colReader(path, 1);
        return output;
    }

 public String[] getXlsValue(String fileName) throws IOException, InterruptedException {
        String[] searchItem = getDataCol1(fileName);
     for (int i = 0; i < searchItem.length; i++) {
            sleepFor(1);
            searchInputWebElement.sendKeys(searchItem[i]);
            sleepFor(2);
            submitButtonWebElement.click();
            searchInputWebElement.clear();
            sleepFor(1);
     }
     return searchItem;
 }
}