package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Test extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("https://www.facebook.com/");

        WebElement CreateNewAccount=driver.findElement(By.xpath("//*[@class='_6ltg']"));
        CreateNewAccount.click();











    }
}
