package Gun08;


/*

1-driver.get("https://chercher.tech/practice/frames") sayfasına gidiniz.
2-Inputa ülke adı yazınız
3-Checkbox u çekleyiniz
4-Select in 4. elemanını seçiniz.


 */
import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement input=driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");


        driver.switchTo().frame(0);  //frame 1 in içinden frame 3 e geçiş yaptım
        WebElement chkbox=driver.findElement(By.id("a"));
        chkbox.click();

        driver.switchTo().parentFrame(); //suan da frame 1 e geri geldim
        driver.switchTo().parentFrame(); //şuan da ana sayfaya geri geldim


         //driver.switchTo().defaultContent(); // veya direk ana sayfaya gitmenin yolu

        driver.switchTo().frame(1); //frame 2
        WebElement menu=driver.findElement(By.id("animals"));
        Select ddmenu=new Select(menu); //drop down
        ddmenu.selectByIndex(3); //4. eleman yani 3 indexli eleman seçildi

        BekleKapat();




    }
}
