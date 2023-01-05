package Gun05;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_isDisplayed extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("https://www.facebook.com/");

        WebElement btnYeniHesap=driver.findElement(By.cssSelector("[id^='u_0_0_']"));
        btnYeniHesap.click();

        Bekle(2);
        WebElement txtisim=driver.findElement(By.name("firstname"));
        txtisim.sendKeys("sema");


        Bekle(2);
        WebElement txtsoyad=driver.findElement(By.name("lastname"));
        txtsoyad.sendKeys("simsek");


        WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(reEmail.isDisplayed());


        WebElement Email=driver.findElement(By.name("reg_email__"));
        Email.sendKeys("sema@hotmail.com");


        Assert.assertTrue(reEmail.isDisplayed()); //beklediğim true false olursa hata ver



        BekleKapat();


    }
}
