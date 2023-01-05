package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;


/*
       Selenium da sayfanın aşağı kaydırılması gereken durumlar vardır.
       Bunlar,sayfa kaydırıldıkça yüklenen elemanlar için

       Bu işlem javascriptexecuter ile yapılır.Bu interface sayesinde
       sayfa kaydırma işlemi ve javascript komutları ile çalıştırılabilir.

       kaydırmak için de javascript kullanılır.
 */
public class _01_Scrollintro extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://triplebyte.com/");

        //javascript komutlarını çalıştırmak için önce js değişkeni tanımladık
        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1500)");
        //(0,1500) => Sayfayı sağa x kadar ve aşağı y kadar kaydırır.
        //1500 px kadar aşağı kaydıracak



        Bekle(2);

        js.executeScript("window.scrollBy(0,-1500)");


        BekleKapat();

    }
}
