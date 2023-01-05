package Gun09;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.BitSet;
import java.util.Formatter;
import java.util.List;
import java.util.Set;

public class _02_WindowsSwitch extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");

        List<WebElement> Linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : Linkler)
        {
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }


        Set<String >WindowIdeler=driver.getWindowHandles(); //Açık olan tüm sayfaların Window Id leri


        for(String id: WindowIdeler) {


            System.out.println("id = " + id);
            driver.switchTo().window(id); //Diğer sayfaya geçiş yapıldı
            System.out.println(id + " - Title = " + driver.getTitle());


          }


        Bekle(2);
        BekleKapat();
    }
}
