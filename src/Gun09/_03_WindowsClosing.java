package Gun09;

/*
-https://www.selenium.dev/ sayfasına gidiniz
-Sayfadaki bütün yeni sayfa açan linkleri tıklatınız.(mailto hariç)
-Açılan bütün yeni sayfaları teker teker kapatınız.

 */


import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _03_WindowsClosing extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");

        List<WebElement> Linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : Linkler)
        {
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }


        Set<String > WindowIdeler=driver.getWindowHandles(); //Açık olan tüm sayfaların Window Id leri


        for(String id: WindowIdeler) {


            System.out.println("id = " + id);
            driver.switchTo().window(id); //Diğer sayfaya geçiş yapıldı
            System.out.println(id + " - Title = " + driver.getTitle());
            driver.close(); //açılan sayfaları kapatır



        }


        Bekle(2);
        BekleKapat();
















    }
}
