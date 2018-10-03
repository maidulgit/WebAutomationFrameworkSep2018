package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SendAutoEmail;

@Test
public class SendAutoEmailTest extends CommonAPI {
    public void fakeHelpMessage()throws InterruptedException {
        SendAutoEmail sendAutoEmail = PageFactory.initElements(driver, SendAutoEmail.class);
        sendAutoEmail.emailAutomation();
    }
}
