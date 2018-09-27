package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("https://www.amazon.com") String url) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\himel\\IdeaProjects\\WebAutomationDemo\\Generic\\Browser-Driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop",Keys.ENTER);

    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
