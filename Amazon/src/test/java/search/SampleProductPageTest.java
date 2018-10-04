package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SampleProductPage;

import java.io.IOException;

public class SampleProductPageTest extends CommonAPI {
    @Test
    public void productPageToCart()throws IOException, InterruptedException{
        SampleProductPage sampleProductPage = PageFactory.initElements(driver, SampleProductPage.class);
        sampleProductPage.fromProductPageToCart();
    }
}
