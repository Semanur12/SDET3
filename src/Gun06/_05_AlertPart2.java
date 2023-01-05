package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_AlertPart2 extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe2=driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        clickMe2.click();

        Bekle(4);
        driver.switchTo().alert().dismiss(); //Alert kutucuğuna geçildi ve HAYIR,CANCEL butonuna basıldı
        Bekle(2);
        //kapattığında sayfaya dönmüş olursun.










        BekleKapat();
    }
}
