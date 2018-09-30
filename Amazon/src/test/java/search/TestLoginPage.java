package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LogInPage;

import java.io.IOException;

public class TestLoginPage extends CommonAPI {

    @Test
    public void emptyData()throws InterruptedException {
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.signInNull();

    }

    @Test
    public void validEmailData() throws InterruptedException {
        LogInPage validEmail = PageFactory.initElements(driver, LogInPage.class);
        validEmail.signInValid();
    }

    @Test
    public void invalidEmailData()throws InterruptedException {
        LogInPage invalidEmail = PageFactory.initElements(driver, LogInPage.class);
        invalidEmail.signInInvalid();
    }
}
