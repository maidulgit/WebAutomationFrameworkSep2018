package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage{
    @FindBy(how = How.ID, using ="nav-link-accountList")
    public static WebElement signInWebElement;

    @FindBy(how = How.ID, using ="ap_email")
    public static WebElement emailBoxWebElement;

    @FindBy(how = How.ID, using ="continue")
    public static WebElement continueButtonWebElement;

    @FindBy(how = How.CLASS_NAME, using ="a-expander-prompt")
    public static WebElement needHelpWebElement;

    @FindBy(how = How.ID, using ="createAccountSubmit")
    public static WebElement createAccountWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"auth-email-missing-alert\"]/div/div")
    public static WebElement missingEmailErrorWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")
    public static WebElement invalidEmailErrorWebElement;

    // Sign in with empty email box
    public String signInNull() throws InterruptedException {
        signInWebElement.click();
        emailBoxWebElement.sendKeys("");
        continueButtonWebElement.click();
        String errorMessage = missingEmailErrorWebElement.getText();
        System.out.println("Sign In With No Email Error Message" + errorMessage);
        return errorMessage;
    }

    // Sign in with valid email address
    public void signInValid() throws InterruptedException {
        signInWebElement.click();
        emailBoxWebElement.sendKeys("cent_mercy@yahoo.com");
        continueButtonWebElement.click();
    }

    // Sign in with invalid email address
    public String signInInvalid() throws InterruptedException {
        signInWebElement.click();
        emailBoxWebElement.sendKeys("cent_mercy@gmail.com");
        continueButtonWebElement.click();
        String errorMessage2 = invalidEmailErrorWebElement.getText();
        System.out.println("Sign In With Invalid Email Error Message" + errorMessage2);
        return errorMessage2;
    }
}
