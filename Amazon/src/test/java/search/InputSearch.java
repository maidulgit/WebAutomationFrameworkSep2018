package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class InputSearch extends CommonAPI {
    @Test
    public void search(){
        typeOnInputBox("#twotabsearchtextbox", "Laptop");
    }

/*  Optional way to perform same test without calling method from Common API
    public void search(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop", Keys.ENTER);
    }
*/
}
