package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SendAutoEmail extends CommonAPI {
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-xshop\"]/a[7]")
    public static WebElement helpButtonWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"category-section\"]/li[11]/a")
    public static WebElement needMoreHelpMenuWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"help-gateway-category-10\"]/div/div/div/ul/li[3]/a")
    public static WebElement contactUsWebElement;
    @FindBy(how = How.ID, using = "createAccountSubmit")
    public static WebElement createAccountWebElement;
    @FindBy(how = How.ID, using = "ap_customer_name")
    public static WebElement customerNameWebElement;
    @FindBy(how = How.ID, using = "ap_email")
    public static WebElement emailWebElement;
    @FindBy(how = How.ID, using = "ap_password")
    public static WebElement passwordWebElement;
    @FindBy(how = How.ID, using = "ap_password_check")
    public static WebElement passwordCheckWebElement;
    @FindBy(how = How.ID, using = "continue")
    public static WebElement createAccountSubmitWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"ap_register_form\"]/div/div/div[5]/a")
    public static WebElement contactCustomerServiceWebElement;
    @FindBy(how = How.ID, using = "cu-select-firstNode")
    public static WebElement dropDownMenuWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"cu-contact-channels\"]/tbody/tr/td/div[1]/a/span")
    public static WebElement emailButtonWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"cu-email-widget\"]/div[3]/div[2]/div[2]/span[2]/input")
    public static WebElement emailEnterBoxWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"cu-email-widget\"]/div[3]/div[2]/div[3]/span[2]/input")
    public static WebElement nameEnterWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"cu-email-widget\"]/div[3]/div[3]/div[4]/div[2]/textarea")
    public static WebElement typeMessageWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"cu-email-widget\"]/div[3]/div[4]/div[1]/a/span")
    public static WebElement sendMessageWebElement;

    public void emailAutomation() throws InterruptedException {
        helpButtonWebElement.click();
        needMoreHelpMenuWebElement.click();
        contactUsWebElement.click();
        createAccountWebElement.click();
        customerNameWebElement.sendKeys("I, Automation");
        emailWebElement.sendKeys("automaticman@gmail.com");
        passwordWebElement.sendKeys("Iamauto2018");
        passwordCheckWebElement.sendKeys("Iamauto2018");
        createAccountSubmitWebElement.click();
        contactCustomerServiceWebElement.click();
        dropDownMenuWebElement.click();
        dropDown(dropDownMenuWebElement, 1);
        emailButtonWebElement.click();
        emailEnterBoxWebElement.sendKeys("email@gmail.com");
        nameEnterWebElement.sendKeys("I, Automation");
        typeMessageWebElement.sendKeys("This is an Automated Message. So Don't Worry");
        sleepFor(5);
        sendMessageWebElement.click();
        sleepFor(5);
    }
}
