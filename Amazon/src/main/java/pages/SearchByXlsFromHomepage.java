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

    public String[] getXlsData(String filename) throws IOException {
        String path = "C:\\Users\\himel\\IdeaProjects\\WebAutomationDemo\\Amazon\\data\\"+filename;
        String[] output = dtr.colReader(path, 1);
        return output;
    }

 public String[] useXlsData(String filename) throws IOException, InterruptedException {
        String[] searchItem = getXlsData(filename);
        for (int i = 0; i < searchItem.length; i++) {
            sleepFor(1);
            searchInputWebElement.sendKeys(searchItem[i]);
            sleepFor(1);
            submitButtonWebElement.click();
            searchInputWebElement.clear();
            sleepFor(2);
         }
        return getXlsData(filename);
 }
}