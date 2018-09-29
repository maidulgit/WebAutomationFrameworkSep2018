package liveTv;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ClickLiveTv extends CommonAPI {
    @Test
    public void liveTv() {
      driver.findElement(By.id("nav-mobileTV")).click();


    }
}
