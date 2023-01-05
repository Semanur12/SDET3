package Gun09;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _01_WindowsGiris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");

        List<WebElement> Linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link:Linkler) {
            if (!link.getAttribute("href").contains("mailto"))//mailto geçen yeri açmasın
             link.click();
        }


        Set<String> WindowIdler=driver.getWindowHandles(); //açılan windowların numaraları
        for (String id:WindowIdler)
            System.out.println("id = " + id);





        Bekle(6);
        BekleKapat();








    }
}
