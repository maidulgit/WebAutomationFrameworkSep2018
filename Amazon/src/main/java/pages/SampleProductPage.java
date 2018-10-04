package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SampleProductPage extends CommonAPI {
    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public static WebElement searchInputWebElement;
    @FindBy(how = How.ID, using ="sort")
    public static WebElement sortByWebElement;
    @FindBy(how = How.XPATH, using ="//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a")
    public static WebElement highestRatedItemWebElement;
    @FindBy(how = How.ID, using ="imgTagWrapperId")
    public static WebElement enlargeImageWebElement;
    @FindBy(how = How.ID, using ="ivImage_1")
    public static WebElement image2WebElement;
    @FindBy(how = How.ID, using ="ivImage_2")
    public static WebElement image3WebElement;
    @FindBy(how = How.ID, using ="ivImage_3")
    public static WebElement image4WebElement;
    @FindBy(how = How.XPATH, using ="//*[@id=\"a-popover-6\"]/div/header/button/i")
    public static WebElement closeImageWebElement;
    @FindBy(how = How.ID, using ="add-to-cart-button")
    public static WebElement addToCartWebElement;
    @FindBy(how = How.ID, using ="siNoCoverage-announce")
    public static WebElement noThanksButtonWebElement;
    @FindBy(how = How.ID, using ="hlb-ptc-btn-native")
    public static WebElement proceedToCheckoutWebElement;
    @FindBy(how = How.XPATH, using ="//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/div[3]/div/a/span")
    public static WebElement needHelpWebElement;
    @FindBy(how = How.ID, using ="ap-other-signin-issues-link")
    public static WebElement otherIssueWebElement;
    @FindBy(how = How.ID, using ="cu-select-firstNode")
    public static WebElement selectAnIssueWebElement;
    @FindBy(how = How.XPATH, using ="//*[@id=\"cu-contact-channels\"]/tbody/tr/td/div[1]/a/span")
    public static WebElement emailWebElement;
    @FindBy(how = How.XPATH, using ="//*[@id=\"cu-email-widget\"]/div[3]/div[2]/div[2]/span[2]/input")
    public static WebElement enterEmailAddressWebElement;
    @FindBy(how = How.XPATH, using ="//*[@id=\"cu-email-widget\"]/div[3]/div[2]/div[3]/span[2]/input")
    public static WebElement enterNameWebElement;
    @FindBy(how = How.CLASS_NAME, using ="ew-message-input")
    public static WebElement typeMessageWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"cu-email-widget\"]/div[3]/div[4]/div[1]/a/span")
    public static WebElement sendEmailConfirmWebElement;

    public void fromProductPageToCart() throws InterruptedException{
        searchInputWebElement.sendKeys("Essential Phone PH-1");
        searchInputWebElement.sendKeys(Keys.ENTER);
        sortByWebElement.click();
        sleepFor(1);
        dropDown(sortByWebElement,3);
        sleepFor(1);
        highestRatedItemWebElement.click();
        enlargeImageWebElement.click();
        sleepFor(1);
        image2WebElement.click();
        sleepFor(2);
        image3WebElement.click();
        sleepFor(2);
        image4WebElement.click();
        sleepFor(2);
        closeImageWebElement.click();
        sleepFor(1);
        addToCartWebElement.click();
        sleepFor(1);
        noThanksButtonWebElement.click();
        sleepFor(1);
        proceedToCheckoutWebElement.click();
        sleepFor(1);
        needHelpWebElement.click();
        sleepFor(1);
        otherIssueWebElement.click();
        sleepFor(1);
        selectAnIssueWebElement.click();
        sleepFor(1);
        dropDown(selectAnIssueWebElement,1);
        sleepFor(1);
        emailWebElement.click();
        enterEmailAddressWebElement.sendKeys("myemail@gmail.com");
        sleepFor(1);
        enterNameWebElement.sendKeys("My Name");
        sleepFor(1);
        typeMessageWebElement.sendKeys("Please Send Me A Free Essential Phone");
        sleepFor(2);
        sendEmailConfirmWebElement.click();
    }
}
