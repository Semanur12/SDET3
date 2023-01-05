package Gun06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        Bekle(2);
        WebElement clickMe3=driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        clickMe3.click();

        Bekle(4);
        System.out.println(driver.switchTo().alert().getText()); //alertin text i alındı
        Bekle(2);
        driver.switchTo().alert().sendKeys("sema");
        driver.switchTo().alert().accept();



        WebElement txtActual=driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(txtActual.getText().contains("sema"));

        Bekle(2);
        BekleKapat();





    }
}
