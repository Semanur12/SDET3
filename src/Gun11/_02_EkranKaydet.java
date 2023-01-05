package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

public class _02_EkranKaydet extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("sema");

        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("mmmmm");

        WebElement btnbutton=driver.findElement(By.className("orangehrm-login-button"));
        btnbutton.click();

        List<WebElement> spanMessage=driver.findElements(By.className("oxd-alert-content-text"));
        if (spanMessage.size()>0){  //login olamadın hata ekran görüntüsünü saklayalım.
            // Hata ekranının ScreenShot ını alalım

            System.out.println("Login olamadı.Hata mesajı gözüktü");

            //Ekran görüntüsü alalım

            TakesScreenshot ts=(TakesScreenshot) driver; //1. Aşama Ekran görüntüsü alma değişkenini tanımladım
            File HafizadakiHali=ts.getScreenshotAs(OutputType.FILE); //2. aşama saklama tipi seçildi
            //HafizadakiHali ->dosya olarak (jpg,png,bmp) kaydedeceğiz.


            //FileUtils.copyFile(HafizadakiHali,new File("ekranGoruntuleri/loginKontrol.png"));
            //Hafızada ki ekran dosyasını al bunu verdiğim yola ve isme kaydet
        }

        BekleKapat();


    }
}
